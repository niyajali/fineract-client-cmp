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
 * PutRecurringDepositAccountsAccountIdResponse
 *
 * @param changes
 * @param clientId
 * @param officeId
 * @param resourceId
 * @param savingsId
 */

@Serializable
data class PutRecurringDepositAccountsAccountIdResponse(

    val changes: PutRecurringDepositAccountsChanges? = null,

    val clientId: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val resourceId: kotlin.Long? = null,

    val savingsId: kotlin.Long? = null

)

