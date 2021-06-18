package com.rbkmoney.claimmanagementapi.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotEmpty

@Validated
@Configuration
@ConstructorBinding
@ConfigurationProperties(prefix = "bouncer")
data class BouncerProperties(
    @NotEmpty val contextFragmentId: String,
    @NotEmpty val deploymentId: String,
    @NotEmpty val authMethod: String,
    @NotEmpty val realm: String,
    @NotEmpty val ruleSetId: String
)
