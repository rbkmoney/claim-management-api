package com.rbkmoney.claimmanagementapi.security

data class BouncerContextDto(
    val operationName: String,
    val partyId: String? = null
)
