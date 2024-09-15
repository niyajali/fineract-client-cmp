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
 * GetAccountRulesResponse
 *
 * @param allowMultipleCreditEntries
 * @param allowMultipleDebitEntries
 * @param creditTags
 * @param debitTags
 * @param description
 * @param id
 * @param name
 * @param officeId
 * @param officeName
 * @param systemDefined
 */

@Serializable
data class GetAccountRulesResponse(

    val allowMultipleCreditEntries: kotlin.Boolean? = null,

    val allowMultipleDebitEntries: kotlin.Boolean? = null,

    val creditTags: kotlin.collections.List<AccountingTagRuleData>? = null,

    val debitTags: kotlin.collections.List<AccountingTagRuleData>? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val systemDefined: kotlin.Boolean? = null

)

