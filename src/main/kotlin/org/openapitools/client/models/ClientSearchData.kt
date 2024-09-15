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
 * @param accountNumber
 * @param activationDate
 * @param createdDate
 * @param displayName
 * @param externalId
 * @param id
 * @param mobileNo
 * @param officeId
 * @param officeName
 * @param status
 */

@Serializable
data class ClientSearchData(

    val accountNumber: kotlin.String? = null,

    @Contextual
    val activationDate: java.time.LocalDate? = null,

    @Contextual
    val createdDate: java.time.OffsetDateTime? = null,

    val displayName: kotlin.String? = null,

    val externalId: ExternalId? = null,

    val id: kotlin.Long? = null,

    val mobileNo: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val status: EnumOptionData? = null

)

