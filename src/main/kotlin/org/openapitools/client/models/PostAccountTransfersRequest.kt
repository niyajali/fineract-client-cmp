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
 * PostAccountTransfersRequest
 *
 * @param dateFormat
 * @param fromAccountId
 * @param fromAccountType
 * @param fromClientId
 * @param fromOfficeId
 * @param locale
 * @param toAccountId
 * @param toAccountType
 * @param toClientId
 * @param toOfficeId
 * @param transferAmount
 * @param transferDate
 * @param transferDescription
 */

@Serializable
data class PostAccountTransfersRequest(

    val dateFormat: kotlin.String? = null,

    val fromAccountId: kotlin.Long? = null,

    val fromAccountType: kotlin.Int? = null,

    val fromClientId: kotlin.Long? = null,

    val fromOfficeId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val toAccountId: kotlin.Long? = null,

    val toAccountType: kotlin.Int? = null,

    val toClientId: kotlin.Long? = null,

    val toOfficeId: kotlin.Long? = null,

    val transferAmount: kotlin.Float? = null,

    val transferDate: kotlin.String? = null,

    val transferDescription: kotlin.String? = null

)

