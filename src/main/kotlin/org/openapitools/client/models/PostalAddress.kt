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
 * @param addressLine1
 * @param addressLine2
 * @param city
 * @param country
 * @param postalCode
 * @param stateProvince
 */

@Serializable
data class PostalAddress(

    val addressLine1: kotlin.String? = null,

    val addressLine2: kotlin.String? = null,

    val city: kotlin.String? = null,

    val country: kotlin.String? = null,

    val postalCode: kotlin.String? = null,

    val stateProvince: kotlin.String? = null

)

