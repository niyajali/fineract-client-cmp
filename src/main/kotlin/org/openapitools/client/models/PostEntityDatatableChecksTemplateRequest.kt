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
 * PostEntityDatatableChecksTemplateRequest
 *
 * @param datatableName
 * @param entity
 * @param productId
 * @param status
 */

@Serializable
data class PostEntityDatatableChecksTemplateRequest(

    val datatableName: kotlin.String? = null,

    val entity: kotlin.String? = null,

    val productId: kotlin.Long? = null,

    val status: kotlin.Long? = null

)

