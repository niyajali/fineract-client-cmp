/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param components
 * @param countryCode
 * @param description
 * @param id
 * @param key
 * @param name
 * @param new
 * @param questions
 * @param validFrom
 * @param validTo
 */

@Serializable
data class Survey(

    val components: kotlin.collections.List<Component>? = null,

    val countryCode: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val key: kotlin.String? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val questions: kotlin.collections.List<Question>? = null,

    @Contextual
    val validFrom: LocalDate? = null,

    @Contextual
    val validTo: LocalDate? = null,

)
