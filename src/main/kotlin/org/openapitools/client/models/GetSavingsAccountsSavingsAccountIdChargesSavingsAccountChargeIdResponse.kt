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
 * GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
 *
 * @param amount
 * @param amountOrPercentage
 * @param amountOutstanding
 * @param amountPaid
 * @param amountPercentageAppliedTo
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeCalculationType
 * @param chargeId
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param penalty
 * @param percentage
 */

@Serializable
data class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse(

    val amount: kotlin.Float? = null,

    val amountOrPercentage: kotlin.Float? = null,

    val amountOutstanding: kotlin.Float? = null,

    val amountPaid: kotlin.Float? = null,

    val amountPercentageAppliedTo: kotlin.Double? = null,

    val amountWaived: kotlin.Float? = null,

    val amountWrittenOff: kotlin.Float? = null,

    val chargeCalculationType: GetChargesChargeCalculationType? = null,

    val chargeId: kotlin.Long? = null,

    val chargeTimeType: GetChargesChargeTimeType? = null,

    val currency: GetChargesCurrencyResponse? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

    val percentage: kotlin.Double? = null

)

