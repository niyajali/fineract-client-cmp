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
 * @param creditAccountType
 * @param creditAcount
 * @param debitAccountType
 * @param debitAcount
 * @param id
 * @param lastModifiedBy
 * @param lastModifiedDate
 * @param new
 * @param percentage
 * @param taxComponentHistories
 * @param taxGroupMappings
 */

@Serializable
data class TaxComponent(

    val createdBy: kotlin.Long? = null,

    @Contextual
    val createdDate: java.time.OffsetDateTime? = null,

    val creditAccountType: kotlin.Int? = null,

    val creditAcount: GLAccount? = null,

    val debitAccountType: kotlin.Int? = null,

    val debitAcount: GLAccount? = null,

    val id: kotlin.Long? = null,

    val lastModifiedBy: kotlin.Long? = null,

    @Contextual
    val lastModifiedDate: java.time.OffsetDateTime? = null,

    val new: kotlin.Boolean? = null,

    @Contextual
    val percentage: java.math.BigDecimal? = null,

    val taxComponentHistories: kotlin.collections.Set<TaxComponentHistory>? = null,

    val taxGroupMappings: kotlin.collections.Set<TaxGroupMappings>? = null

)

