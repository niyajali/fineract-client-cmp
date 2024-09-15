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
 * PostRepostRequest
 *
 * @param description
 * @param reportCategory
 * @param reportName
 * @param reportParameters
 * @param reportSql
 * @param reportSubType
 * @param reportType
 */

@Serializable
data class PostRepostRequest(

    val description: kotlin.String? = null,

    val reportCategory: kotlin.String? = null,

    val reportName: kotlin.String? = null,

    val reportParameters: kotlin.collections.List<@Contextual kotlin.Any>? = null,

    val reportSql: kotlin.String? = null,

    val reportSubType: kotlin.String? = null,

    val reportType: kotlin.String? = null

)

