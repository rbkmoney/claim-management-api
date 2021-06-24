package com.rbkmoney.claimmanagementapi.security

import com.rbkmoney.claimmanagementapi.enumerated.BouncerOperation

interface AccessService {
    fun checkAccess(operation: BouncerOperation, partyId: String? = null)
}
