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
 *
 *
 * @param code
 * @param decimalPlaces
 * @param displayLabel
 * @param displaySymbol
 * @param inMultiplesOf
 * @param name
 * @param nameCode
 */

@Serializable
data class GetRecurringDepositAccountsCurrency(

    val code: kotlin.String? = null,

    val decimalPlaces: kotlin.Int? = null,

    val displayLabel: kotlin.String? = null,

    val displaySymbol: kotlin.String? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val nameCode: kotlin.String? = null

)

