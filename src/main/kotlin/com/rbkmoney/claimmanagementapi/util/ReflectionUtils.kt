package com.rbkmoney.claimmanagementapi.util

import com.rbkmoney.claimmanagementapi.controller.Operation
import com.rbkmoney.claimmanagementapi.enumerated.BouncerOperation

object ReflectionUtils {

    fun getBouncerOperation(): BouncerOperation {
        val operationAnnotation = Operation::class.java
        val operationMethod = StackWalker.getInstance()
            .walk { frame ->
                frame.map { it.toMethod() }
                    .filter { it.isAnnotationPresent(operationAnnotation) }
                    .findFirst()
            }.orElseThrow { RuntimeException("Can't resolve bouncer operation") }
        return operationMethod
            .getAnnotation(operationAnnotation)
            .operation
    }

    private fun StackWalker.StackFrame.toMethod() =
        Class.forName(this.className)
            .declaredMethods
            .find { it.name == this.methodName }!!
            .also { it.trySetAccessible() }
}
