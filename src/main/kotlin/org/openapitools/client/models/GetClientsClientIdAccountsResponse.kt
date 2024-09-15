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
 * GetClientsClientIdAccountsResponse
 *
 * @param loanAccounts
 * @param savingsAccounts
 */

@Serializable
data class GetClientsClientIdAccountsResponse(

    val loanAccounts: kotlin.collections.Set<GetClientsLoanAccounts>? = null,

    val savingsAccounts: kotlin.collections.Set<GetClientsSavingsAccounts>? = null

)

