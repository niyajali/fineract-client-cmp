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

import kotlinx.serialization.Serializable

/**
 * PostFixedDepositAccountsRequest
 *
 * @param clientId
 * @param dateFormat
 * @param depositAmount
 * @param depositPeriod
 * @param depositPeriodFrequencyId
 * @param locale
 * @param productId
 * @param submittedOnDate
 */

@Serializable
data class PostFixedDepositAccountsRequest(

    val clientId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val depositAmount: kotlin.Float? = null,

    val depositPeriod: kotlin.Int? = null,

    val depositPeriodFrequencyId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val productId: kotlin.Long? = null,

    val submittedOnDate: kotlin.String? = null,

)
