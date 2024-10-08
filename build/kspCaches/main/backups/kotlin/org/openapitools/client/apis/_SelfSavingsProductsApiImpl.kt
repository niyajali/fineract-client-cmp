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
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress

@OptIn(InternalKtorfitApi::class)
public class _SelfSavingsProductsApiImpl(
  private val _ktorfit: Ktorfit,
) : SelfSavingsProductsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveAll38(clientId: Long?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/savingsproducts")
        clientId?.let{ parameter("clientId", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne29(productId: Long, clientId: Long?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/savingsproducts/${"$productId".encodeURLPath()}")
        clientId?.let{ parameter("clientId", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _SelfSavingsProductsApiProvider : ClassProvider<SelfSavingsProductsApi> {
  override fun create(_ktorfit: Ktorfit): SelfSavingsProductsApi =
      _SelfSavingsProductsApiImpl(_ktorfit)
}

public fun Ktorfit.createSelfSavingsProductsApi(): SelfSavingsProductsApi =
    _SelfSavingsProductsApiImpl(this)
