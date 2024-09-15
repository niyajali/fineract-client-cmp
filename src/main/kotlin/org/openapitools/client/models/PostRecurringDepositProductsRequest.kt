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

import kotlinx.serialization.Serializable

/**
 * PostRecurringDepositProductsRequest
 *
 * @param accountingRule
 * @param charts
 * @param currencyCode
 * @param depositAmount
 * @param description
 * @param digitsAfterDecimal
 * @param inMultiplesOf
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param locale
 * @param maxDepositAmount
 * @param maxDepositTerm
 * @param maxDepositTermTypeId
 * @param minDepositAmount
 * @param minDepositTerm
 * @param minDepositTermTypeId
 * @param name
 * @param preClosurePenalApplicable
 * @param preClosurePenalInterest
 * @param preClosurePenalInterestOnTypeId
 * @param recurringDepositFrequency
 * @param recurringDepositFrequencyTypeId
 * @param shortName
 */

@Serializable
data class PostRecurringDepositProductsRequest(

    val accountingRule: kotlin.Int? = null,

    val charts: kotlin.collections.Set<PostRecurringDepositProductsCharts>? = null,

    val currencyCode: kotlin.String? = null,

    val depositAmount: kotlin.Long? = null,

    val description: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val interestCalculationDaysInYearType: kotlin.Int? = null,

    val interestCalculationType: kotlin.Int? = null,

    val interestCompoundingPeriodType: kotlin.Int? = null,

    val interestPostingPeriodType: kotlin.Int? = null,

    val locale: kotlin.String? = null,

    val maxDepositAmount: kotlin.Long? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermTypeId: kotlin.Int? = null,

    val minDepositAmount: kotlin.Long? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermTypeId: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val preClosurePenalInterest: kotlin.Double? = null,

    val preClosurePenalInterestOnTypeId: kotlin.Int? = null,

    val recurringDepositFrequency: kotlin.Int? = null,

    val recurringDepositFrequencyTypeId: kotlin.Int? = null,

    val shortName: kotlin.String? = null

)

