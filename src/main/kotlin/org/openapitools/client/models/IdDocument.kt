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
 * @param idNumber
 * @param idType
 * @param issuerCountry
 * @param otherIdDescription
 */

@Serializable
data class IdDocument(

    val idNumber: kotlin.String? = null,

    val idType: kotlin.String? = null,

    val issuerCountry: kotlin.String? = null,

    val otherIdDescription: kotlin.String? = null

)

