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
import kotlin.collections.List
import org.openapitools.client.models.DeleteProvisioningCriteriaResponse
import org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse
import org.openapitools.client.models.GetProvisioningCriteriaResponse
import org.openapitools.client.models.PostProvisioningCriteriaRequest
import org.openapitools.client.models.PostProvisioningCriteriaResponse
import org.openapitools.client.models.PutProvisioningCriteriaRequest
import org.openapitools.client.models.PutProvisioningCriteriaResponse

@OptIn(InternalKtorfitApi::class)
public class _ProvisioningCriteriaApiImpl(
  private val _ktorfit: Ktorfit,
) : ProvisioningCriteriaApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend
      fun createProvisioningCriteria(postProvisioningCriteriaRequest: PostProvisioningCriteriaRequest):
      PostProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria")
        }
        setBody(postProvisioningCriteriaRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostProvisioningCriteriaResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteProvisioningCriteria(criteriaId: Long):
      DeleteProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteProvisioningCriteriaResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllProvisioningCriterias(): List<GetProvisioningCriteriaResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetProvisioningCriteriaResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveProvisioningCriteria(criteriaId: Long):
      GetProvisioningCriteriaCriteriaIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetProvisioningCriteriaCriteriaIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate3(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateProvisioningCriteria(criteriaId: Long,
      putProvisioningCriteriaRequest: PutProvisioningCriteriaRequest):
      PutProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        }
        setBody(putProvisioningCriteriaRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutProvisioningCriteriaResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ProvisioningCriteriaApiProvider : ClassProvider<ProvisioningCriteriaApi> {
  override fun create(_ktorfit: Ktorfit): ProvisioningCriteriaApi =
      _ProvisioningCriteriaApiImpl(_ktorfit)
}

public fun Ktorfit.createProvisioningCriteriaApi(): ProvisioningCriteriaApi =
    _ProvisioningCriteriaApiImpl(this)
