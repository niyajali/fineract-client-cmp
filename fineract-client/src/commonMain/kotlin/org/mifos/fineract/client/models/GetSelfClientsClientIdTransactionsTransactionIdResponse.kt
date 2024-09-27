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
 * GetSelfClientsClientIdTransactionsTransactionIdResponse
 *
 * @param amount
 * @param currency
 * @param date
 * @param id
 * @param officeId
 * @param officeName
 * @param reversed
 * @param submittedOnDate
 * @param type
 */

@Serializable
data class GetSelfClientsClientIdTransactionsTransactionIdResponse(

    val amount: kotlin.Float? = null,

    val currency: GetSelfClientsSavingsAccountsCurrency? = null,

    @Contextual
    val date: LocalDate? = null,

    val id: kotlin.Int? = null,

    val officeId: kotlin.Int? = null,

    val officeName: kotlin.String? = null,

    val reversed: kotlin.Boolean? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val type: GetSelfClientsClientIdTransactionsType? = null,

)
