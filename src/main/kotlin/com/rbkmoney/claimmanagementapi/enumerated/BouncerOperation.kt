package com.rbkmoney.claimmanagementapi.enumerated

enum class BouncerOperation(val id: String) {
    CREATE_CLAIM("createClaim"),
    GET_CLAIM("getClaimByID"),
    REVOKE_CLAIM("revokeClaimByID"),
    REQUEST_CLAIM_REVIEW("requestClaimReviewById"),
    SEARCH_CLAIMS("searchClaims"),
    UPDATE_CLAIM("updateClaimByID")
}
