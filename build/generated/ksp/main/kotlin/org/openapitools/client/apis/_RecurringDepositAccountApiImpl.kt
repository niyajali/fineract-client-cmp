// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.formData
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteRecurringDepositAccountsResponse
import org.openapitools.client.models.GetRecurringDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetRecurringDepositAccountsResponse
import org.openapitools.client.models.GetRecurringDepositAccountsTemplateResponse
import org.openapitools.client.models.PostRecurringDepositAccountsAccountIdResponse
import org.openapitools.client.models.PostRecurringDepositAccountsRequest
import org.openapitools.client.models.PostRecurringDepositAccountsResponse
import org.openapitools.client.models.PutRecurringDepositAccountsAccountIdRequest
import org.openapitools.client.models.PutRecurringDepositAccountsAccountIdResponse

@OptIn(InternalKtorfitApi::class)
public class _RecurringDepositAccountApiImpl(
  private val _ktorfit: Ktorfit,
) : RecurringDepositAccountApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun accountClosureTemplate1(accountId: Long, command: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/recurringdepositaccounts/${"$accountId".encodeURLPath()}/template")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete17(accountId: Long): DeleteRecurringDepositAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/${"$accountId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteRecurringDepositAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getRecurringDepositTemplate(
    officeId: Long?,
    staffId: Long?,
    dateFormat: String?,
  ) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/downloadtemplate")
        officeId?.let{ parameter("officeId", "$it") }
        staffId?.let{ parameter("staffId", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getRecurringDepositTransactionTemplate(officeId: Long?,
      dateFormat: String?) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/transactions/downloadtemplate")
        officeId?.let{ parameter("officeId", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun handleCommands5(
    accountId: Long,
    body: Any,
    command: String?,
  ): PostRecurringDepositAccountsAccountIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/${"$accountId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostRecurringDepositAccountsAccountIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun postRecurringDepositTemplate(
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/uploadtemplate")
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun postRecurringDepositTransactionsTemplate(
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/transactions/uploadtemplate")
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll31(
    paged: Boolean?,
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): List<GetRecurringDepositAccountsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts")
        paged?.let{ parameter("paged", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetRecurringDepositAccountsResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne22(
    accountId: Long,
    staffInSelectedOfficeOnly: Boolean?,
    chargeStatus: String?,
  ): GetRecurringDepositAccountsAccountIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/${"$accountId".encodeURLPath()}")
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        chargeStatus?.let{ parameter("chargeStatus", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetRecurringDepositAccountsAccountIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend
      fun submitApplication1(postRecurringDepositAccountsRequest: PostRecurringDepositAccountsRequest):
      PostRecurringDepositAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts")
        }
        setBody(postRecurringDepositAccountsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostRecurringDepositAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun template13(
    clientId: Long?,
    groupId: Long?,
    productId: Long?,
    staffInSelectedOfficeOnly: Boolean?,
  ): GetRecurringDepositAccountsTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/template")
        clientId?.let{ parameter("clientId", "$it") }
        groupId?.let{ parameter("groupId", "$it") }
        productId?.let{ parameter("productId", "$it") }
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetRecurringDepositAccountsTemplateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun update18(accountId: Long,
      putRecurringDepositAccountsAccountIdRequest: PutRecurringDepositAccountsAccountIdRequest):
      PutRecurringDepositAccountsAccountIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/recurringdepositaccounts/${"$accountId".encodeURLPath()}")
        }
        setBody(putRecurringDepositAccountsAccountIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutRecurringDepositAccountsAccountIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _RecurringDepositAccountApiProvider : ClassProvider<RecurringDepositAccountApi> {
  override fun create(_ktorfit: Ktorfit): RecurringDepositAccountApi =
      _RecurringDepositAccountApiImpl(_ktorfit)
}

public fun Ktorfit.createRecurringDepositAccountApi(): RecurringDepositAccountApi =
    _RecurringDepositAccountApiImpl(this)
