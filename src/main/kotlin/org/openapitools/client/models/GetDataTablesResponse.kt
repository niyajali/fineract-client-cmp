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
 * GetDataTablesResponse
 *
 * @param applicationTableName
 * @param columnHeaderData
 * @param registeredTableName
 */

@Serializable
data class GetDataTablesResponse(

    val applicationTableName: kotlin.String? = null,

    val columnHeaderData: kotlin.collections.List<ResultsetColumnHeaderData>? = null,

    val registeredTableName: kotlin.String? = null

)

