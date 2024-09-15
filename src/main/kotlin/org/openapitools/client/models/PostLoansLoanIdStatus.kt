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
 * PostLoansLoanIdStatus
 *
 * @param active
 * @param closed
 * @param closedObligationsMet
 * @param closedRescheduled
 * @param closedWrittenOff
 * @param code
 * @param id
 * @param overpaid
 * @param pendingApproval
 * @param `value`
 * @param waitingForDisbursal
 */

@Serializable
data class PostLoansLoanIdStatus(

    val active: kotlin.Boolean? = null,

    val closed: kotlin.Boolean? = null,

    val closedObligationsMet: kotlin.Boolean? = null,

    val closedRescheduled: kotlin.Boolean? = null,

    val closedWrittenOff: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val overpaid: kotlin.Boolean? = null,

    val pendingApproval: kotlin.Boolean? = null,

    val value: kotlin.String? = null,

    val waitingForDisbursal: kotlin.Boolean? = null

)

