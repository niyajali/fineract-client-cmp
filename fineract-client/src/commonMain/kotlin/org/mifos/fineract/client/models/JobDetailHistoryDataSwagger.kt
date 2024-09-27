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

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param jobRunEndTime
 * @param jobRunStartTime
 * @param status
 * @param triggerType
 * @param version
 */

@Serializable
data class JobDetailHistoryDataSwagger(

    @Contextual
    val jobRunEndTime: LocalDateTime? = null,

    @Contextual
    val jobRunStartTime: LocalDateTime? = null,

    val status: kotlin.String? = null,

    val triggerType: kotlin.String? = null,

    val version: kotlin.Long? = null,

)
