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
 * @param externalId
 * @param hierarchy
 * @param id
 * @param name
 * @param nameDecorated
 * @param openingDate
 */

@Serializable
data class GetAccountTransfersFromOffice(

    val externalId: kotlin.String? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val nameDecorated: kotlin.String? = null,

    @Contextual
    val openingDate: java.time.LocalDate? = null

)

