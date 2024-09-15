// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress

@OptIn(InternalKtorfitApi::class)
public class _DepositAccountOnHoldFundTransactionsApiImpl(
  private val _ktorfit: Ktorfit,
) : DepositAccountOnHoldFundTransactionsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveAll28(
    savingsId: Long,
    guarantorFundingId: Long?,
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/savingsaccounts/${"$savingsId".encodeURLPath()}/onholdtransactions")
        guarantorFundingId?.let{ parameter("guarantorFundingId", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _DepositAccountOnHoldFundTransactionsApiProvider :
    ClassProvider<DepositAccountOnHoldFundTransactionsApi> {
  override fun create(_ktorfit: Ktorfit): DepositAccountOnHoldFundTransactionsApi =
      _DepositAccountOnHoldFundTransactionsApiImpl(_ktorfit)
}

public fun Ktorfit.createDepositAccountOnHoldFundTransactionsApi():
    DepositAccountOnHoldFundTransactionsApi = _DepositAccountOnHoldFundTransactionsApiImpl(this)
