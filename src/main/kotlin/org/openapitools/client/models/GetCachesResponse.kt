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
 * GetCachesResponse
 *
 * @param cacheType
 * @param enabled
 */

@Serializable
data class GetCachesResponse(

    val cacheType: EnumOptionData? = null,

    val enabled: kotlin.Boolean? = null

)

