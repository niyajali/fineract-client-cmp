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
 *
 *
 * @param chartSlabs
 * @param fromDate
 * @param id
 * @param periodTypes
 * @param savingsProductId
 * @param savingsProductName
 */

@Serializable
data class GetRecurringDepositProductsProductIdActiveChart(

    val chartSlabs: kotlin.collections.Set<GetRecurringDepositProductsProductIdChartSlabs>? = null,

    @Contextual
    val fromDate: java.time.LocalDate? = null,

    val id: kotlin.Long? = null,

    val periodTypes: kotlin.collections.Set<GetRecurringDepositProductsProductIdPeriodType>? = null,

    val savingsProductId: kotlin.Long? = null,

    val savingsProductName: kotlin.String? = null

)

