/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * PostAdhocQuerySearchRequest
 *
 * @param dateFormat
 * @param includeOutStandingAmountPercentage
 * @param includeOutstandingAmount
 * @param loanDateOption
 * @param loanFromDate
 * @param loanToDate
 * @param locale
 * @param maxOutstandingAmount
 * @param minOutstandingAmount
 * @param outStandingAmountPercentage
 * @param outStandingAmountPercentageCondition
 * @param outstandingAmountCondition
 */

@Serializable
data class PostAdhocQuerySearchRequest(

    val dateFormat: kotlin.String? = null,

    val includeOutStandingAmountPercentage: kotlin.Boolean? = null,

    val includeOutstandingAmount: kotlin.Boolean? = null,

    val loanDateOption: kotlin.String? = null,

    @Contextual
    val loanFromDate: java.time.LocalDate? = null,

    @Contextual
    val loanToDate: java.time.LocalDate? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingAmount: kotlin.Long? = null,

    val minOutstandingAmount: kotlin.Long? = null,

    val outStandingAmountPercentage: kotlin.Long? = null,

    val outStandingAmountPercentageCondition: kotlin.String? = null,

    val outstandingAmountCondition: kotlin.String? = null

)

