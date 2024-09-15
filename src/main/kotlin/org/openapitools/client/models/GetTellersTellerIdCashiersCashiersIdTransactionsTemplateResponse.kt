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
 * GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse
 *
 * @param cashierData
 * @param cashierId
 * @param cashierName
 * @param currencyOptions
 * @param endDate
 * @param officeName
 * @param startDate
 * @param tellerId
 * @param tellerName
 */

@Serializable
data class GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse(

    val cashierData: CashierData? = null,

    val cashierId: kotlin.Long? = null,

    val cashierName: kotlin.String? = null,

    val currencyOptions: kotlin.collections.List<CurrencyData>? = null,

    @Contextual
    val endDate: java.time.LocalDate? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val startDate: java.time.LocalDate? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null

)

