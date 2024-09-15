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
 * @param accountId
 * @param accountNumber
 * @param chartSlabs
 * @param fromDate
 * @param id
 * @param periodTypes
 */

@Serializable
data class GetFixedDepositAccountsAccountChart(

    val accountId: kotlin.Long? = null,

    val accountNumber: kotlin.Long? = null,

    val chartSlabs: kotlin.collections.Set<GetFixedDepositAccountsChartSlabs>? = null,

    @Contextual
    val fromDate: java.time.LocalDate? = null,

    val id: kotlin.Long? = null,

    val periodTypes: kotlin.collections.Set<GetFixedDepositAccountsPeriodTypes>? = null

)

