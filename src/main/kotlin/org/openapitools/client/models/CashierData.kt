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
import java.time.LocalDate

/**
 *
 *
 * @param description
 * @param endDate
 * @param endTime
 * @param id
 * @param isFullDay
 * @param officeId
 * @param officeName
 * @param staffId
 * @param staffName
 * @param staffOptions
 * @param startDate
 * @param startTime
 * @param tellerId
 * @param tellerName
 */

@Serializable
data class CashierData(

    val description: kotlin.String? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val endTime: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isFullDay: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    val staffName: kotlin.String? = null,

    val staffOptions: kotlin.collections.List<StaffData>? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val startTime: kotlin.String? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null

)

