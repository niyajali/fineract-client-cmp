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
 * PutJobsJobsIDRequest
 *
 * @param active
 * @param cronExpression
 * @param displayName
 */

@Serializable
data class PutJobsJobIDRequest(

    val active: kotlin.Boolean? = null,

    val cronExpression: kotlin.String? = null,

    val displayName: kotlin.String? = null

)

