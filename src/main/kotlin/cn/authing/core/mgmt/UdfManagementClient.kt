package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 用户自定义字段管理类
 */
class UdfManagementClient(private val client: ManagementClient) {
    /**
     * 获取自定义字段元数据列表
     */
    fun list(targetType: UdfTargetType): GraphQLCall<UdfResponse, List<UserDefinedField>> {
        val param = UdfParam(targetType);
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UdfResponse>>() {}) {
            it.result
        }
    }

    /**
     * 设置元数据，如果不存在会创建
     */
    fun set(
        targetType: UdfTargetType,
        key: String,
        dataType: UdfDataType,
        label: String
    ): GraphQLCall<SetUdfResponse, UserDefinedField> {
        val param = SetUdfParam(targetType, key, dataType, label)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetUdfResponse>>() {}) {
            it.result
        }
    }

    /**
     * 移除元数据
     */
    fun remove(targetType: UdfTargetType, key: String): GraphQLCall<RemoveUdfResponse, CommonMessage> {
        val param = RemoveUdfParam(targetType, key)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveUdfResponse>>() {}) {
            it.result
        }
    }
}