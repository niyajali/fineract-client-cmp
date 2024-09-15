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
 *
 *
 * @param appUser
 * @param client
 * @param createdOn
 * @param id
 * @param new
 * @param question
 * @param response
 * @param survey
 * @param `value`
 */

@Serializable
data class Scorecard(

    val appUser: AppUser? = null,

    val client: Client? = null,

    @Contextual
    val createdOn: java.time.OffsetDateTime? = null,

    val id: kotlin.Long? = null,

    val new: kotlin.Boolean? = null,

    val question: Question? = null,

    val response: Response? = null,

    val survey: Survey? = null,

    val value: kotlin.Int? = null

)

