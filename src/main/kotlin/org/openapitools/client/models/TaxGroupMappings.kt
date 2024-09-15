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
 * @param createdBy
 * @param createdDate
 * @param endDate
 * @param id
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param new
 * @param taxComponent
 * @param taxGroup
 */

@Serializable
data class TaxGroupMappings(

    val createdBy: kotlin.Long? = null,

    @Contextual
    val createdDate: java.time.OffsetDateTime? = null,

    @Contextual
    val endDate: java.time.LocalDate? = null,

    val id: kotlin.Long? = null,

    val lastModifiedBy: kotlin.Long? = null,

    @Contextual
    val lastModifiedDate: java.time.OffsetDateTime? = null,

    val new: kotlin.Boolean? = null,

    val taxComponent: TaxComponent? = null,

    val taxGroup: TaxGroup? = null

)

