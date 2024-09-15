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
 * GetSelfUserDetailsResponse
 *
 * @param authenticated
 * @param base64EncodedAuthenticationKey
 * @param clients
 * @param isSelfServiceUser
 * @param officeId
 * @param officeName
 * @param organisationalRole
 * @param permissions
 * @param roles
 * @param staffDisplayName
 * @param staffId
 * @param userId
 * @param username
 */

@Serializable
data class GetSelfUserDetailsResponse(

    val authenticated: kotlin.Boolean? = null,

    val base64EncodedAuthenticationKey: kotlin.String? = null,

    val clients: kotlin.collections.List<kotlin.Int>? = null,

    val isSelfServiceUser: kotlin.Boolean? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val organisationalRole: GetSelfUserDetailsOrganisationalRole? = null,

    val permissions: kotlin.collections.List<kotlin.String>? = null,

    val roles: kotlin.collections.Set<GetSelfUserDetailsRoles>? = null,

    val staffDisplayName: kotlin.String? = null,

    val staffId: kotlin.Long? = null,

    val userId: kotlin.Long? = null,

    val username: kotlin.String? = null

)

