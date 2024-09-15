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
 *
 *
 * @param code
 * @param contra
 * @param description
 * @param disbursement
 * @param externalId
 * @param externalLoanId
 * @param id
 * @param loanId
 * @param recoveryRepayment
 * @param repayment
 * @param repaymentAtDisbursement
 * @param waiveCharges
 * @param waiveInterest
 * @param writeOff
 */

@Serializable
data class GetLoansType(

    val code: kotlin.String? = null,

    val contra: kotlin.Boolean? = null,

    val description: kotlin.String? = null,

    val disbursement: kotlin.Boolean? = null,

    val externalId: kotlin.String? = null,

    val externalLoanId: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val loanId: kotlin.Long? = null,

    val recoveryRepayment: kotlin.Boolean? = null,

    val repayment: kotlin.Boolean? = null,

    val repaymentAtDisbursement: kotlin.Boolean? = null,

    val waiveCharges: kotlin.Boolean? = null,

    val waiveInterest: kotlin.Boolean? = null,

    val writeOff: kotlin.Boolean? = null

)

