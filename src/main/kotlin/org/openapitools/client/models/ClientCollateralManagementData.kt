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
 * @param id
 * @param name
 * @param pctToBase
 * @param quantity
 * @param total
 * @param totalCollateral
 * @param unitPrice
 */

@Serializable
data class ClientCollateralManagementData(

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    @Contextual
    val pctToBase: java.math.BigDecimal? = null,

    @Contextual
    val quantity: java.math.BigDecimal? = null,

    @Contextual
    val total: java.math.BigDecimal? = null,

    @Contextual
    val totalCollateral: java.math.BigDecimal? = null,

    @Contextual
    val unitPrice: java.math.BigDecimal? = null

)

