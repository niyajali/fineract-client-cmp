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
 * @param activatedDate
 * @param approvedByFirstname
 * @param approvedByLastname
 * @param approvedByUsername
 * @param approvedDate
 * @param submittedByFirstname
 * @param submittedByLastname
 * @param submittedByUsername
 * @param submittedOnDate
 */

@Serializable
data class GetAccountsTimeline(

    @Contextual
    val activatedDate: java.time.LocalDate? = null,

    val approvedByFirstname: kotlin.String? = null,

    val approvedByLastname: kotlin.String? = null,

    val approvedByUsername: kotlin.String? = null,

    @Contextual
    val approvedDate: java.time.LocalDate? = null,

    val submittedByFirstname: kotlin.String? = null,

    val submittedByLastname: kotlin.String? = null,

    val submittedByUsername: kotlin.String? = null,

    @Contextual
    val submittedOnDate: java.time.LocalDate? = null

)

