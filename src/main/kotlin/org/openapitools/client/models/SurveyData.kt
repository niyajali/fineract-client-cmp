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
 * @param componentDatas
 * @param countryCode
 * @param description
 * @param id
 * @param key
 * @param name
 * @param questionDatas
 * @param validFrom
 * @param validTo
 */

@Serializable
data class SurveyData(

    val componentDatas: kotlin.collections.List<ComponentData>? = null,

    val countryCode: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val key: kotlin.String? = null,

    val name: kotlin.String? = null,

    val questionDatas: kotlin.collections.List<QuestionData>? = null,

    @Contextual
    val validFrom: java.time.LocalDate? = null,

    @Contextual
    val validTo: java.time.LocalDate? = null

)

