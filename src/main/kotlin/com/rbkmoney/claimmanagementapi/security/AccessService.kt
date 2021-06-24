package com.rbkmoney.claimmanagementapi.security

interface AccessService {
    fun checkAccess(operation: String, partyId: String? = null)
}
