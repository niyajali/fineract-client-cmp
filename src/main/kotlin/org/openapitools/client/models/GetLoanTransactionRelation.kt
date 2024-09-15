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
 * @param amount
 * @param fromLoanTransaction
 * @param paymentType
 * @param relationType
 * @param toLoanCharge
 * @param toLoanTransaction
 */

@Serializable
data class GetLoanTransactionRelation(

    val amount: kotlin.Double? = null,

    val fromLoanTransaction: kotlin.Long? = null,

    val paymentType: kotlin.String? = null,

    val relationType: kotlin.String? = null,

    val toLoanCharge: kotlin.Long? = null,

    val toLoanTransaction: kotlin.Long? = null

)

