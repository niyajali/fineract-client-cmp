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
 * GetUsersResponse
 *
 * @param email
 * @param firstname
 * @param id
 * @param lastname
 * @param officeId
 * @param officeName
 * @param passwordNeverExpires
 * @param selectedRoles
 * @param staff
 * @param username
 */

@Serializable
data class GetUsersResponse(

    val email: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val lastname: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val passwordNeverExpires: kotlin.Boolean? = null,

    val selectedRoles: kotlin.collections.List<RoleData>? = null,

    val staff: StaffData? = null,

    val username: kotlin.String? = null

)

