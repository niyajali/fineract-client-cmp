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
 * PutSelfUserRequest
 *
 * @param password
 * @param repeatPassword
 */

@Serializable
data class PutSelfUserRequest(

    val password: kotlin.String? = null,

    val repeatPassword: kotlin.String? = null

)

