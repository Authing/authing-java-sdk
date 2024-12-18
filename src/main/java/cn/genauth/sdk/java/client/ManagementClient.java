package cn.genauth.sdk.java.client;

import cn.genauth.sdk.java.dto.*;
import cn.genauth.sdk.java.model.AuthingRequestConfig;
import cn.genauth.sdk.java.model.AuthingWebsocketClient;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.model.Receiver;
import cn.genauth.sdk.java.util.signature.Impl.SignatureComposer;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;


public class ManagementClient extends BaseClient {

    public ManagementClient(ManagementClientOptions options) {
        super(options);
        // 必要参数校验
        if (StrUtil.isBlank(options.getAccessKeyId())) {
            throw new IllegalArgumentException("accessKeyId is required");
        }
        if (StrUtil.isBlank(options.getAccessKeySecret())) {
            throw new IllegalArgumentException("accessKeySecret is required");
        }
    }

	public Object makeRequest(MakeRequestReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl(reqDto.getUrl());
        config.setBody(reqDto.getData());
        config.setMethod(reqDto.getMethod());
        String response = request(config);
        return deserialize(response, Object.class);
    }

	/**
	 * @summary 岗位列表
	 * @description 岗位列表
	**/
	public PostPaginatedRespDto postList(ListPostDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-post");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PostPaginatedRespDto.class);
	}
	/**
	 * @summary 获取岗位
	 * @description 获取岗位
	**/
	public CreatePostDto getPost(GetPostDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-post");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CreatePostDto.class);
	}
	/**
	 * @deprecated
	 * @summary 获取用户关联岗位
	 * @description 获取用户关联的所有岗位
	**/
	public PostListRespDto getUserPosts(GetUserPostsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-posts");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PostListRespDto.class);
	}
	/**
	 * @deprecated
	 * @summary 获取用户关联岗位
	 * @description 此接口只会返回一个岗位，已废弃，请使用 /api/v3/get-user-posts 接口
	**/
	public CreatePostDto getUserPost(GetUserPostDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-post");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CreatePostDto.class);
	}
	/**
	 * @summary 获取岗位信息
	 * @description 根据岗位 id 获取岗位详情
	**/
	public PostRespDto getPostById(GetPostByIdListDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-post-by-id");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PostRespDto.class);
	}
	/**
	 * @summary 创建岗位
	 * @description 创建岗位
	**/
	public CreatePostRespDto createPost(CreatePostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreatePostRespDto.class);
	}
	/**
	 * @summary 更新岗位信息
	 * @description 更新岗位信息
	**/
	public CreatePostRespDto updatePost(CreatePostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreatePostRespDto.class);
	}
	/**
	 * @summary 删除岗位
	 * @description 删除岗位
	**/
	public CommonResponseDto removePost(RemovePostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 用户设置岗位
	 * @description 一次性给用户设置岗位：如果之前的岗位不在传入的列表中，会进行移除；如果有新增的岗位，会加入到新的岗位；如果不变，则不进行任何操作。
	**/
	public CommonResponseDto setUserPosts(SetUserPostsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-posts");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 用户关联岗位
	 * @description 用户关联岗位
	**/
	public CommonResponseDto userConnectionPost(UserConnectionPostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/user-connection-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 数据对象高级搜索
	 * @description 数据对象高级搜索
	**/
	public FunctionModelValueListResDto listRow(FilterDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/filter");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelValueListResDto.class);
	}
	/**
	 * @summary 获取数据对象行信息
	 * @description 获取数据对象行信息
	**/
	public FunctionModelValueResDto getRow(GetRowDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-row");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, FunctionModelValueResDto.class);
	}
	/**
	 * @summary 根据属性值获取数据对象行信息
	 * @description 根据属性值获取数据对象行信息，只允许通过唯一性字段进行精确查询。
	**/
	public FunctionModelValueResDto getRowByValue(GetRowByValueDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-row-by-value");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, FunctionModelValueResDto.class);
	}
	/**
	 * @summary 批量获取行信息
	 * @description 批量获取行信息
	**/
	public MetadataListResDto getRowBatch(GetRowBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/get-row-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, MetadataListResDto.class);
	}
	/**
	 * @summary 添加行
	 * @description 添加行
	**/
	public FunctionModelValueResDto createRow(CreateRowDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/create-row");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelValueResDto.class);
	}
	/**
	 * @summary 更新行
	 * @description 更新行
	**/
	public FunctionModelValueResDto updateRow(UpdateRowDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/update-row");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelValueResDto.class);
	}
	/**
	 * @summary 删除行
	 * @description 删除行
	**/
	public CommonResponseDto removeRow(RemoveRowDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/remove-row");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 创建数据对象
	 * @description 利用此接口可以创建一个自定义的数据对象，定义数据对象的基本信息
	**/
	public FunctionModelResDto createModel(CreateFunctionModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/create-model");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelResDto.class);
	}
	/**
	 * @summary 获取数据对象详情
	 * @description 利用功能 id ，获取数据对象的详细信息
	**/
	public FunctionModelResDto getModel(GetModelDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-model");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, FunctionModelResDto.class);
	}
	/**
	 * @summary 获取数据对象列表
	 * @description 获取数据对象列表
	**/
	public FunctionModelListDto listModel() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/list-model");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, FunctionModelListDto.class);
	}
	/**
	 * @summary 删除数据对象
	 * @description 根据请求的功能 id ，删除对应的数据对象
	**/
	public CommonResponseDto removeModel(FunctionModelIdDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/remove-model");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 更新数据对象
	 * @description 更新对应功能 id 的数据对象信息
	**/
	public FunctionModelResDto updateModel(UpdateFunctionModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/update-model");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelResDto.class);
	}
	/**
	 * @summary 创建数据对象的字段
	 * @description 创建相关数据对象的字段，配置字段信息及基本校验规则
	**/
	public FunctionModelFieldResDto createField(CreateFunctionModelFieldDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/create-field");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelFieldResDto.class);
	}
	/**
	 * @summary 更新数据对象的字段
	 * @description 更新相关数据对象的字段信息及基本校验规则
	**/
	public FunctionModelFieldResDto updateField(UpdateFunctionModelFieldDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/update-field");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelFieldResDto.class);
	}
	/**
	 * @summary 删除数据对象的字段
	 * @description 根据功能字段 id 、功能 id 、字段属性名删除对应的字段
	**/
	public CommonResponseDto remoteField(FunctionModelFieldIdDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/remove-field");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取数据对象字段列表
	 * @description 获取数据对象字段列表
	**/
	public FunctionFieldListResDto listField(ListFieldDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/list-field");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, FunctionFieldListResDto.class);
	}
	/**
	 * @summary 导出全部数据
	 * @description 导出全部数据
	**/
	public CommonResponseDto exportMeatdata(ExportModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/export");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 导入数据
	 * @description 导入数据
	**/
	public CommonResponseDto importMetadata(ImportModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/import");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取导入模板
	 * @description 获取导入模板
	**/
	public GetImportTemplateResDto getImportTemplate(GetImportTemplateDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-import-template");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetImportTemplateResDto.class);
	}
	/**
	 * @summary 创建自定义操作
	 * @description 创建自定义操作
	**/
	public CommonResponseDto createOperate(CreateOperateModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/create-operate");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 移除自定义操作
	 * @description 移除自定义操作
	**/
	public CommonResponseDto removeOperate(FunctionModelOperateIdDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/remove-operate");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 执行自定义操作
	 * @description 执行自定义操作
	**/
	public CommonResponseDto executeOperate(FunctionModelOperateIdDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/execute-operate");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 复制自定义操作
	 * @description 复制自定义操作
	**/
	public CommonResponseDto copyOperate(FunctionModelOperateIdDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/copy-operate");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 操作管理列表(分页)
	 * @description 操作管理列表(分页)
	**/
	public OperateModelDto listOperate(ListOperateDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/list-operate");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OperateModelDto.class);
	}
	/**
	 * @summary 全部操作管理列表
	 * @description 全部操作管理列表
	**/
	public OperateModelDto listOperateAll(AllOperateDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/all-operate");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OperateModelDto.class);
	}
	/**
	 * @summary 更新操作管理
	 * @description 更新操作管理
	**/
	public CommonResponseDto updateOperate(UpdateOperateModelDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/update-operate");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取关联数据详情
	 * @description 获取关联数据详情
	**/
	public CommonResponseDto getRelationInfo(GetRelationInfoDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-relation-info");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 创建行关联数据
	 * @description 创建行关联数据
	**/
	public CommonResponseDto createRowRelation(CreateRelationValueDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/create-row-relation");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取行关联数据
	 * @description 获取行关联数据
	**/
	public RelationValueListResDto getRelationValue(GetRowRelationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-row-relation");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RelationValueListResDto.class);
	}
	/**
	 * @summary 删除行关联数据
	 * @description 删除行关联数据
	**/
	public CommonResponseDto removeRelationValue(RemoveRelationValueDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/remove-row-relation");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 导出数据对象
	 * @description 导出数据对象
	**/
	public CommonResponseDto exportModel(ExportMetadataDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/export/model");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 导入数据对象
	 * @description 导入数据对象
	**/
	public CommonResponseDto importModel(ImportMetadataDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/import/model");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取全部数据对象数据
	 * @description 获取全部数据对象数据
	**/
	public FunctionModelValueListResDto getAllMetadata(GetAllRowDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-all-metadata");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, FunctionModelValueListResDto.class);
	}
	/**
	 * @summary 获取行关联数据
	 * @description 获取行关联数据
	**/
	public RelationValueListResDto getRelationDetails() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/get-row-relation-details");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RelationValueListResDto.class);
	}
	/**
	 * @summary UEBA 上传
	 * @description UEBA 上传
	**/
	public CreateUEBARespDto capture(CreateUEBADto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/metadata/ueba/capture");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateUEBARespDto.class);
	}
	/**
	 * @summary 移除绑定(用户详情页)
	 * @description 移除绑定(用户详情页)。
	**/
	public CommonResponseDto deleteDevice(DeleteTerminalUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-device-by-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 挂起设备(用户详情页)
	 * @description 挂起设备(用户详情页)。
	**/
	public CommonResponseDto suspendDevice(SuspendTerminalUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/suspend-device-by-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 停用设备(用户详情页)
	 * @description 停用设备(用户详情页)。
	**/
	public CommonResponseDto disableDevice(UpdateTerminalUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/disable-device-by-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 启用设备(用户详情页)
	 * @description 启用设备(用户详情页)。
	**/
	public CommonResponseDto enableDevice(UpdateTerminalUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/enable-device-by-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取设备状态
	 * @description 获取设备状态。
	**/
	public DeviceStatusRespDto getDeviceStatus(TerminalBaseDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/device-status");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DeviceStatusRespDto.class);
	}
	/**
	 * @summary 获取/搜索公共账号列表
	 * @description 
 * 此接口用于获取用户列表，支持模糊搜索，以及通过用户基础字段、用户自定义字段、用户所在部门、用户历史登录应用等维度筛选用户。
 * 
 * ### 模糊搜素示例
 * 
 * 模糊搜索默认会从 `phone`, `email`, `name`, `username`, `nickname` 五个字段对用户进行模糊搜索，你也可以通过设置 `options.fuzzySearchOn`
 * 决定模糊匹配的字段范围：
 * 
 * ```json
 * {
 * "keywords": "北京",
 * "options": {
 * "fuzzySearchOn": [
 * "address"
 * ]
 * }
 * }
 * ```
 * 
 * ### 高级搜索示例
 * 
 * 你可以通过 `advancedFilter` 进行高级搜索，高级搜索支持通过用户的基础信息、自定义数据、所在部门、用户来源、登录应用、外部身份源信息等维度对用户进行筛选。
 * **且这些筛选条件可以任意组合。**
 * 
 * #### 筛选状态为禁用的用户
 * 
 * 用户状态（`status`）为字符串类型，可选值为 `Activated` 和 `Suspended`：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "status",
 * "operator": "EQUAL",
 * "value": "Suspended"
 * }
 * ]
 * }
 * ```
 * 
 * #### 筛选邮箱中包含 `@example.com` 的用户
 * 
 * 用户邮箱（`email`）为字符串类型，可以进行模糊搜索：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "email",
 * "operator": "CONTAINS",
 * "value": "@example.com"
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户的任意扩展字段进行搜索
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "some-custom-key",
 * "operator": "EQUAL",
 * "value": "some-value"
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户登录次数筛选
 * 
 * 筛选登录次数大于 10 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "GREATER",
 * "value": 10
 * }
 * ]
 * }
 * ```
 * 
 * 筛选登录次数在 10 - 100 次的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "BETWEEN",
 * "value": [10, 100]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户上次登录时间进行筛选
 * 
 * 筛选最近 7 天内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLoginTime",
 * "operator": "GREATER",
 * "value": new Date(Date.now() - 7 * 24 * 60 * 60 * 1000)
 * }
 * ]
 * }
 * ```
 * 
 * 筛选在某一段时间内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLogin",
 * "operator": "BETWEEN",
 * "value": [
 * Date.now() - 14 * 24 * 60 * 60 * 1000,
 * Date.now() - 7 * 24 * 60 * 60 * 1000
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户曾经登录过的应用筛选
 * 
 * 筛选出曾经登录过应用 `appId1` 或者 `appId2` 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loggedInApps",
 * "operator": "IN",
 * "value": [
 * "appId1",
 * "appId2"
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户所在部门进行筛选
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "department",
 * "operator": "IN",
 * "value": [
 * {
 * "organizationCode": "steamory",
 * "departmentId": "root",
 * "departmentIdType": "department_id",
 * "includeChildrenDepartments": true
 * }
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * 
	**/
	public PublicAccountPaginatedRespDto listPublicAccounts(ListPublicAccountsRequestDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-public-accounts");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 获取公共账号信息
	 * @description 通过公共账号用户 ID，获取公共账号详情，可以选择获取自定义数据、选择指定用户 ID 类型等。
	**/
	public PublicAccountSingleRespDto getPublicAccount(GetPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountSingleRespDto.class);
	}
	/**
	 * @summary 批量获取公共账号信息
	 * @description 通过公共账号用户 ID 列表，批量获取公共账号信息，可以选择获取自定义数据、选择指定用户 ID 类型等。
	**/
	public PublicAccountListRespDto getPublicAccountBatch(GetPublicAccountBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-account-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountListRespDto.class);
	}
	/**
	 * @summary 创建公共账号
	 * @description 创建公共账号，邮箱、手机号、用户名必须包含其中一个，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份创建公共账号用户因此不需要进行手机号验证码检验等安全检测。  
	**/
	public PublicAccountSingleRespDto createPublicAccount(CreatePublicAccountReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-public-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PublicAccountSingleRespDto.class);
	}
	/**
	 * @summary 批量创建公共账号
	 * @description 批量创建公共账号，邮箱、手机号、用户名必须包含其中一个，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份创建公共账号用户因此不需要进行手机号验证码检验等安全检测。
	**/
	public PublicAccountListRespDto createPublicAccountsBatch(CreatePublicAccountBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-public-accounts-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PublicAccountListRespDto.class);
	}
	/**
	 * @summary 修改公共账号资料
	 * @description 通过公共账号用户 ID，修改公共账号资料，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份修改公共账号资料因此不需要进行手机号验证码检验等安全检测。
	**/
	public PublicAccountSingleRespDto updatePublicAccount(UpdatePublicAccountReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-public-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PublicAccountSingleRespDto.class);
	}
	/**
	 * @summary 批量修改公共账号资料
	 * @description 批量修改公共账号资料，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份修改公共账号资料因此不需要进行手机号验证码检验等安全检测。
	**/
	public PublicAccountListRespDto updatePublicAccountBatch(UpdatePublicAccountBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-public-account-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PublicAccountListRespDto.class);
	}
	/**
	 * @summary 批量删除公共账号
	 * @description 通过公共账号 ID 列表，删除公共账号，支持批量删除，可以选择指定用户 ID 类型等。
	**/
	public IsSuccessRespDto deletePublicAccountsBatch(DeletePublicAccountsBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-public-accounts-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 强制下线公共账号
	 * @description 通过公共账号 ID、App ID 列表，强制让公共账号下线，可以选择指定公共账号 ID 类型等。
	**/
	public IsSuccessRespDto kickPublicAccounts(KickPublicAccountsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/kick-public-accounts");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 个人账号转换为公共账号
	 * @description 通过用户 ID，把个人账号转换为公共账号。
	**/
	public CommonResponseDto changeIntoPublicAccount(CreatePublicAccountFromUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/transfer-into-public-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取用户的公共账号列表
	 * @description 通过用户 ID，获取用户的公共账号列表。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountsOfUser(GetPublicAccountsOfUserDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-accounts-of-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 公共账号的用户列表
	 * @description 通过公共账号 ID，获取用户列表。
	**/
	public PublicAccountPaginatedRespDto getUsersOfPublicAccount(GetUsersOfPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-users-of-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 公共账号绑定批量用户
	 * @description 使用公共账号绑定批量用户
	**/
	public IsSuccessRespDto bindUsersPublicAccount(SetPublicAccountBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-public-account-of-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 用户绑定批量公共账号
	 * @description 用户绑定批量公共账号
	**/
	public IsSuccessRespDto setuserOfPublicAccount(SetUserOfPublicAccountBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-of-public-accounts");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 公共账号解绑用户
	 * @description 公共账号解绑用户
	**/
	public IsSuccessRespDto unbindUsersPublicAccount(UnbindPublicAccountBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/unbind-public-account-of-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取组织机构详情
	 * @description 获取组织机构详情
	**/
	public OrganizationSingleRespDto getOrganization(GetOrganizationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-organization");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
	}
	/**
	 * @summary 批量获取组织机构详情
	 * @description 批量获取组织机构详情
	**/
	public OrganizationListRespDto getOrganizationsBatch(GetOrganizationBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-organization-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationListRespDto.class);
	}
	/**
	 * @summary 获取组织机构列表
	 * @description 获取组织机构列表，支持分页。
	**/
	public OrganizationPaginatedRespDto listOrganizations(ListOrganizationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-organizations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationPaginatedRespDto.class);
	}
	/**
	 * @summary 创建组织机构
	 * @description 创建组织机构，会创建一个只有一个节点的组织机构，可以选择组织描述信息、根节点自定义 ID、多语言等。
	**/
	public OrganizationSingleRespDto createOrganization(CreateOrganizationReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-organization");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
	}
	/**
	 * @summary 修改组织机构
	 * @description 通过组织 code，修改组织机构，可以选择部门描述、新组织 code、组织名称等。
	**/
	public OrganizationSingleRespDto updateOrganization(UpdateOrganizationReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-organization");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
	}
	/**
	 * @summary 删除组织机构
	 * @description 通过组织 code，删除组织机构树。
	**/
	public IsSuccessRespDto deleteOrganization(DeleteOrganizationReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-organization");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 搜索组织机构列表
	 * @description 通过搜索关键词，搜索组织机构列表，支持分页。
	**/
	public OrganizationPaginatedRespDto searchOrganizations(SearchOrganizationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-organizations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationPaginatedRespDto.class);
	}
	/**
	 * @summary 更新组织机构状态
	**/
	public IsSuccessRespDto updateOrganizationStatus(UpdateOrganizationStatusReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-organization-status");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取部门信息
	 * @description 通过组织 code 以及 部门 ID 或 部门 code，获取部门信息，可以获取自定义数据。
	**/
	public DepartmentSingleRespDto getDepartment(GetDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
	}
	/**
	 * @summary 创建部门
	 * @description 通过组织 code、部门名称、父部门 ID，创建部门，可以设置多种参数。
	**/
	public DepartmentSingleRespDto createDepartment(CreateDepartmentReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-department");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
	}
	/**
	 * @summary 修改部门
	 * @description 通过组织 code、部门 ID，修改部门，可以设置多种参数。
	**/
	public DepartmentSingleRespDto updateDepartment(UpdateDepartmentReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-department");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
	}
	/**
	 * @summary 删除部门
	 * @description 通过组织 code、部门 ID，删除部门。
	**/
	public IsSuccessRespDto deleteDepartment(DeleteDepartmentReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-department");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @deprecated
	 * @summary 搜索部门
	 * @description 通过组织 code、搜索关键词，搜索部门，可以搜索组织名称等。
	**/
	public DepartmentListRespDto searchDepartments(SearchDepartmentsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-departments");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentListRespDto.class);
	}
	/**
	 * @summary 搜索部门
	 * @description 通过组织 code、搜索关键词，搜索部门，可以搜索组织名称等。
	**/
	public DepartmentListRespDto searchDepartmentsList(SearchDepartmentsListReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-departments-list");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentListRespDto.class);
	}
	/**
	 * @summary 获取子部门列表
	 * @description 通过组织 code、部门 ID，获取子部门列表，可以选择获取自定义数据、虚拟组织等。
	**/
	public DepartmentPaginatedRespDto listChildrenDepartments(ListChildrenDepartmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-children-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentPaginatedRespDto.class);
	}
	/**
	 * @summary 获取所有部门列表
	 * @description 获取所有部门列表，可以用于获取某个组织下的所有部门列表。
	**/
	public DepartmentPaginatedRespDto getAllDepartments(GetAllDepartmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-all-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentPaginatedRespDto.class);
	}
	/**
	 * @summary 获取部门成员列表
	 * @description 通过组织 code、部门 ID、排序，获取部门成员列表，支持分页，可以选择获取自定义数据、identities 等。
	**/
	public UserPaginatedRespDto listDepartmentMembers(ListDepartmentMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 获取部门直属成员 ID 列表
	 * @description 通过组织 code、部门 ID，获取部门直属成员 ID 列表。
	**/
	public UserIdListRespDto listDepartmentMemberIds(ListDepartmentMemberIdsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-member-ids");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserIdListRespDto.class);
	}
	/**
	 * @summary 搜索部门下的成员
	 * @description 通过组织 code、部门 ID、搜索关键词，搜索部门下的成员，支持分页，可以选择获取自定义数据、identities 等。
	**/
	public UserPaginatedRespDto searchDepartmentMembers(SearchDepartmentMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-department-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 部门下添加成员
	 * @description 通过部门 ID、组织 code，添加部门下成员。
	**/
	public IsSuccessRespDto addDepartmentMembers(AddDepartmentMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-department-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 部门下删除成员
	 * @description 通过部门 ID、组织 code，删除部门下成员。
	**/
	public IsSuccessRespDto removeDepartmentMembers(RemoveDepartmentMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-department-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取父部门信息
	 * @description 通过组织 code、部门 ID，获取父部门信息，可以选择获取自定义数据等。
	**/
	public DepartmentSingleRespDto getParentDepartment(GetParentDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-parent-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
	}
	/**
	 * @summary 判断用户是否在某个部门下
	 * @description 通过组织 code、部门 ID，判断用户是否在某个部门下，可以选择包含子部门。
	**/
	public IsUserInDepartmentRespDto isUserInDepartment(IsUserInDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-user-in-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IsUserInDepartmentRespDto.class);
	}
	/**
	 * @summary 根据部门id查询部门
	 * @description 根据部门id查询部门
	**/
	public DepartmentSingleRespDto getDepartmentById(GetDepartmentByIdDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-department-by-id");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
	}
	/**
	 * @summary 根据组织树批量创建部门
	 * @description 根据组织树批量创建部门，部门名称不存在时会自动创建
	**/
	public CreateDepartmentTreeRespDto createDepartmentTree(CreateDepartmentTreeReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-department-tree");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateDepartmentTreeRespDto.class);
	}
	/**
	 * @summary 获取部门绑定的第三方同步关系
	 * @description 如果在 Authing 中的部门进行了上下游同步，此接口可以用于查询出在第三方的关联用户信息
	**/
	public SyncRelationListRespDto getDepartmentSyncRelations(GetDepartmentSyncRelationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-department-sync-relations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncRelationListRespDto.class);
	}
	/**
	 * @summary 删除部门同步关联关系
	 * @description 如果在 Authing 中的部门进行了上下游同步，此接口可以用于删除某个部门在指定身份源下的关联关系。
	**/
	public IsSuccessRespDto deleteDepartmentSyncRelations(DeleteDepartmentSyncRelationReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-department-sync-relations");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 更新部门状态
	 * @description 启用和禁用部门
	**/
	public Node updateNodeStatus(UpdateDepartmentStatusReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-department-status");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, Node.class);
	}
	/**
	 * @summary 获取/搜索用户列表
	 * @description 
 * 此接口用于获取用户列表，支持模糊搜索，以及通过用户基础字段、用户自定义字段、用户所在部门、用户历史登录应用等维度筛选用户。
 * 
 * ### 模糊搜素示例
 * 
 * 模糊搜索默认会从 `phone`, `email`, `name`, `username`, `nickname` 五个字段对用户进行模糊搜索，你也可以通过设置 `options.fuzzySearchOn`
 * 决定模糊匹配的字段范围：
 * 
 * ```json
 * {
 * "keywords": "北京",
 * "options": {
 * "fuzzySearchOn": [
 * "address"
 * ]
 * }
 * }
 * ```
 * 
 * ### 高级搜索示例
 * 
 * 你可以通过 `advancedFilter` 进行高级搜索，高级搜索支持通过用户的基础信息、自定义数据、所在部门、用户来源、登录应用、外部身份源信息等维度对用户进行筛选。
 * **且这些筛选条件可以任意组合。**
 * 
 * #### 筛选状态为禁用的用户
 * 
 * 用户状态（`status`）为字符串类型，可选值为 `Activated` 和 `Suspended`：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "status",
 * "operator": "EQUAL",
 * "value": "Suspended"
 * }
 * ]
 * }
 * ```
 * 
 * #### 筛选邮箱中包含 `@example.com` 的用户
 * 
 * 用户邮箱（`email`）为字符串类型，可以进行模糊搜索：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "email",
 * "operator": "CONTAINS",
 * "value": "@example.com"
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户的任意扩展字段进行搜索
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "some-custom-key",
 * "operator": "EQUAL",
 * "value": "some-value"
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户登录次数筛选
 * 
 * 筛选登录次数大于 10 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "GREATER",
 * "value": 10
 * }
 * ]
 * }
 * ```
 * 
 * 筛选登录次数在 10 - 100 次的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "BETWEEN",
 * "value": [10, 100]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户上次登录时间进行筛选
 * 
 * 筛选最近 7 天内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLoginTime",
 * "operator": "GREATER",
 * "value": new Date(Date.now() - 7 * 24 * 60 * 60 * 1000)
 * }
 * ]
 * }
 * ```
 * 
 * 筛选在某一段时间内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLogin",
 * "operator": "BETWEEN",
 * "value": [
 * Date.now() - 14 * 24 * 60 * 60 * 1000,
 * Date.now() - 7 * 24 * 60 * 60 * 1000
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户曾经登录过的应用筛选
 * 
 * 筛选出曾经登录过应用 `appId1` 或者 `appId2` 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loggedInApps",
 * "operator": "IN",
 * "value": [
 * "appId1",
 * "appId2"
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户所在部门进行筛选
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "department",
 * "operator": "IN",
 * "value": [
 * {
 * "organizationCode": "steamory",
 * "departmentId": "root",
 * "departmentIdType": "department_id",
 * "includeChildrenDepartments": true
 * }
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * 
	**/
	public UserPaginatedRespDto listUsers(ListUsersRequestDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @deprecated
	 * @summary 获取用户列表
	 * @description 获取用户列表接口，支持分页，可以选择获取自定义数据、identities 等。
	**/
	public UserPaginatedRespDto listUsersLegacy(ListUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 获取用户信息
	 * @description 通过用户 ID，获取用户详情，可以选择获取自定义数据、identities、选择指定用户 ID 类型等。
	**/
	public UserSingleRespDto getUser(GetUserDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
	}
	/**
	 * @summary 批量获取用户信息
	 * @description 通过用户 ID 列表，批量获取用户信息，可以选择获取自定义数据、identities、选择指定用户 ID 类型等。
	**/
	public UserListRespDto getUserBatch(GetUserBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
	}
	/**
	 * @summary 用户属性解密
	 * @description 接口接收加密信息，返回解密信息
	**/
	public UserFieldDecryptRespDto userFieldDecrypt(UserFieldDecryptReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/users/field/decrypt");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserFieldDecryptRespDto.class);
	}
	/**
	 * @summary 创建用户
	 * @description 创建用户，邮箱、手机号、用户名必须包含其中一个，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份创建用户因此不需要进行手机号验证码检验等安全检测。  
	**/
	public UserSingleRespDto createUser(CreateUserReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
	}
	/**
	 * @summary 批量创建用户
	 * @description 批量创建用户，邮箱、手机号、用户名必须包含其中一个，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份创建用户因此不需要进行手机号验证码检验等安全检测。
	**/
	public UserListRespDto createUsersBatch(CreateUserBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-users-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
	}
	/**
	 * @summary 修改用户资料
	 * @description 通过用户 ID，修改用户资料，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份修改用户资料因此不需要进行手机号验证码检验等安全检测。
	**/
	public UserSingleRespDto updateUser(UpdateUserReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
	}
	/**
	 * @summary 批量修改用户资料
	 * @description 批量修改用户资料，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份修改用户资料因此不需要进行手机号验证码检验等安全检测。
	**/
	public UserListRespDto updateUserBatch(UpdateUserBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-user-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
	}
	/**
	 * @summary 批量删除用户
	 * @description 通过用户 ID 列表，删除用户，支持批量删除，可以选择指定用户 ID 类型等。
	**/
	public IsSuccessRespDto deleteUsersBatch(DeleteUsersBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-users-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户的外部身份源
	 * @description 通过用户 ID，获取用户的外部身份源、选择指定用户 ID 类型。
	**/
	public IdentityListRespDto getUserIdentities(GetUserIdentitiesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-identities");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IdentityListRespDto.class);
	}
	/**
	 * @summary 获取用户角色列表
	 * @description 通过用户 ID，获取用户角色列表，可以选择所属权限分组 code、选择指定用户 ID 类型等。注意：如果不传 namespace，默认只会获取默认权限分组下面的角色！
	**/
	public RolePaginatedRespDto getUserRoles(GetUserRolesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
	}
	/**
	 * @summary 获取用户实名认证信息
	 * @description 通过用户 ID，获取用户实名认证信息，可以选择指定用户 ID 类型。
	**/
	public PrincipalAuthenticationInfoPaginatedRespDto getUserPrincipalAuthenticationInfo(GetUserPrincipalAuthenticationInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-principal-authentication-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PrincipalAuthenticationInfoPaginatedRespDto.class);
	}
	/**
	 * @summary 删除用户实名认证信息
	 * @description 通过用户 ID，删除用户实名认证信息，可以选择指定用户 ID 类型等。
	**/
	public IsSuccessRespDto resetUserPrincipalAuthenticationInfo(ResetUserPrincipalAuthenticationInfoDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/reset-user-principal-authentication-info");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户部门列表
	 * @description 通过用户 ID，获取用户部门列表，支持分页，可以选择获取自定义数据、选择指定用户 ID 类型、增序或降序等。
	**/
	public UserDepartmentPaginatedRespDto getUserDepartments(GetUserDepartmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserDepartmentPaginatedRespDto.class);
	}
	/**
	 * @summary 设置用户所在部门
	 * @description 通过用户 ID，设置用户所在部门，可以选择指定用户 ID 类型等。
	**/
	public IsSuccessRespDto setUserDepartments(SetUserDepartmentsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-departments");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户分组列表
	 * @description 通过用户 ID，获取用户分组列表，可以选择指定用户 ID 类型等。
	**/
	public GroupPaginatedRespDto getUserGroups(GetUserGroupsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-groups");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupPaginatedRespDto.class);
	}
	/**
	 * @summary 获取用户 MFA 绑定信息
	 * @description 通过用户 ID，获取用户 MFA 绑定信息，可以选择指定用户 ID 类型等。
	**/
	public UserMfaSingleRespDto getUserMfaInfo(GetUserMfaInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-mfa-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserMfaSingleRespDto.class);
	}
	/**
	 * @summary 获取已归档的用户列表
	 * @description 获取已归档的用户列表，支持分页，可以筛选开始时间等。
	**/
	public ListArchivedUsersSingleRespDto listArchivedUsers(ListArchivedUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-archived-users");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListArchivedUsersSingleRespDto.class);
	}
	/**
	 * @summary 强制下线用户
	 * @description 通过用户 ID、App ID 列表，强制让用户下线，可以选择指定用户 ID 类型等。
	**/
	public IsSuccessRespDto kickUsers(KickUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/kick-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 判断用户是否存在
	 * @description 根据条件判断用户是否存在，可以筛选用户名、邮箱、手机号、第三方外部 ID 等。
	**/
	public IsUserExistsRespDto isUserExists(IsUserExistsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-user-exists");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsUserExistsRespDto.class);
	}
	/**
	 * @summary 获取用户可访问的应用
	 * @description 通过用户 ID，获取用户可访问的应用，可以选择指定用户 ID 类型等。
	**/
	public AppListRespDto getUserAccessibleApps(GetUserAccessibleAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-accessible-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
	}
	/**
	 * @summary 获取用户授权的应用
	 * @description 通过用户 ID，获取用户授权的应用，可以选择指定用户 ID 类型等。
	**/
	public AppListRespDto getUserAuthorizedApps(GetUserAuthorizedAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
	}
	/**
	 * @summary 判断用户是否有某个角色
	 * @description 通过用户 ID，判断用户是否有某个角色，支持传入多个角色，可以选择指定用户 ID 类型等。
	**/
	public HasAnyRoleRespDto hasAnyRole(HasAnyRoleReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/has-any-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, HasAnyRoleRespDto.class);
	}
	/**
	 * @summary 获取用户的登录历史记录
	 * @description 通过用户 ID，获取用户登录历史记录，支持分页，可以选择指定用户 ID 类型、应用 ID、开始与结束时间戳等。
	**/
	public UserLoginHistoryPaginatedRespDto getUserLoginHistory(GetUserLoginHistoryDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-login-history");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoginHistoryPaginatedRespDto.class);
	}
	/**
	 * @summary 获取用户曾经登录过的应用
	 * @description 通过用户 ID，获取用户曾经登录过的应用，可以选择指定用户 ID 类型等。
	**/
	public UserLoggedInAppsListRespDto getUserLoggedinApps(GetUserLoggedinAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-loggedin-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoggedInAppsListRespDto.class);
	}
	/**
	 * @summary 获取用户曾经登录过的身份源
	 * @description 通过用户 ID，获取用户曾经登录过的身份源，可以选择指定用户 ID 类型等。
	**/
	public UserLoggedInIdentitiesRespDto getUserLoggedinIdentities(GetUserLoggedInIdentitiesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-logged-in-identities");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoggedInIdentitiesRespDto.class);
	}
	/**
	 * @summary 离职用户
	 * @description 离职用户。离职操作会进行以下操作：
 * 
 * - 离职后该成员授权、部门、角色、分组、岗位关系将被删除；
 * - 离职后将保留用户基本信息，同时账号将被禁用，无法登录应用；如果需要彻底删除账号，请调用删除接口。
 * 
 * 该操作不可恢复，请谨慎操作！
 * 
	**/
	public ResignUserRespDto resignUser(ResignUserReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/resign-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResignUserRespDto.class);
	}
	/**
	 * @summary 批量离职用户
	 * @description 批量离职用户。离职操作会进行以下操作：
 * 
 * - 离职后该成员授权、部门、角色、分组、岗位关系将被删除；
 * - 离职后将保留用户基本信息，同时账号将被禁用，无法登录应用；如果需要彻底删除账号，请调用删除接口。
 * 
 * 该操作不可恢复，请谨慎操作！
 * 
	**/
	public ResignUserRespDto resignUserBatch(ResignUserBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/resign-user-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResignUserRespDto.class);
	}
	/**
	 * @summary 获取用户被授权的所有资源
	 * @description 通过用户 ID，获取用户被授权的所有资源，可以选择指定用户 ID 类型等，用户被授权的资源是用户自身被授予、通过分组继承、通过角色继承、通过组织机构继承的集合。
	**/
	public AuthorizedResourcePaginatedRespDto getUserAuthorizedResources(GetUserAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
	}
	/**
	 * @summary 检查某个用户在应用下是否具备 Session 登录态
	 * @description 检查某个用户在应用下是否具备 Session 登录态
	**/
	public CheckSessionStatusRespDto checkSessionStatus(CheckSessionStatusDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-session-status");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckSessionStatusRespDto.class);
	}
	/**
	 * @summary 导入用户的 OTP
	 * @description 导入用户的 OTP
	**/
	public CommonResponseDto importOtp(ImportOtpReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/import-otp");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取用户绑定 OTP 的秘钥
	 * @description 通过用户 ID，获取用户绑定 OTP 的秘钥。可以选择指定用户 ID 类型等。
	**/
	public GetOtpSecretRespDto getOtpSecretByUser(GetOtpSecretByUserDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-otp-secret-by-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetOtpSecretRespDto.class);
	}
	/**
	 * @summary 获取用户自定义加密的密码
	 * @description 此功能主要是用户在控制台配置加基于 RSA、SM2 等加密的密钥后，加密用户的密码。
	**/
	public GetUserPasswordCiphertextRespDto getUserPasswordCiphertext(GetUserPasswordCiphertextDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-password-ciphertext");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetUserPasswordCiphertextRespDto.class);
	}
	/**
	 * @summary 给用户绑定一个身份信息
	 * @description 用户池管理员手动将来自外部身份源的身份信息绑定到用户上。绑定完成后，可以用执行过绑定操作的身份源登录到对应的 Authing 用户。
	**/
	public LinkIdentityResDto linkIdentity(LinkIdentityDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/link-identity");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, LinkIdentityResDto.class);
	}
	/**
	 * @summary 解除绑定用户在身份源下的所有身份信息
	 * @description 解除绑定用户在某个身份源下的所有身份信息。解绑后，将无法使用执行过解绑操作的身份源登录到对应的 Authing 用户，除非重新绑定身份信息。
	**/
	public UnlinkIdentityResDto unlinkIdentity(UnlinkIdentity reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/unlink-identity");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UnlinkIdentityResDto.class);
	}
	/**
	 * @summary 设置用户 MFA 状态
	 * @description 设置用户 MFA 状态，即 MFA 触发数据。
	**/
	public IsSuccessRespDto setUsersMfaStatus(SetMfaStatusDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-mfa-status");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户 MFA 状态
	 * @description 获取用户 MFA 状态，即 MFA 触发数据。
	**/
	public GetMapInfoRespDto getUserMfaStatus(GetMfaStatusDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-mfa-status");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetMapInfoRespDto.class);
	}
	/**
	 * @summary 获取用户绑定的第三方同步关系
	 * @description 如果在 Authing 中的用户进行了上下游同步，此接口可以用于查询出在第三方的关联用户信息
	**/
	public SyncRelationListRespDto getUserSyncRelations(GetUserSyncRelationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-sync-relations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncRelationListRespDto.class);
	}
	/**
	 * @summary 删除用户同步关联关系
	 * @description 如果在 Authing 中的用户进行了上下游同步，此接口可以用于删除某个用户在指定身份源下的关联关系。
	**/
	public IsSuccessRespDto deleteUserSyncRelations(DeleteUserSyncRelationReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-user-sync-relations");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取公共账号的角色列表
	 * @description 通过用户 ID，获取用户角色列表，可以选择所属权限分组 code、选择指定用户 ID 类型等。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountRoles(GetRolesOfPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-roles-of-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 获取角色的公共账号列表
	 * @description 通过角色 ID，获取用户的公共账号列表。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountsOfRole(GetPublicAccountsOfRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-accounts-of-role");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 公共账号绑定批量角色
	 * @description 公共账号绑定批量角色
	**/
	public IsSuccessRespDto bindPublicAccountOfRoles(SetUserRolesDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-public-account-of-roles");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取分组的公共账号列表
	 * @description 通过分组 ID，获取用户的公共账号列表。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountsOfGroup(GetPublicAccountsOfGroupDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-accounts-of-group");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 获取公共账号分组列表
	 * @description 通过公共账号 ID，获取公共账号分组列表，可以选择指定用户 ID 类型等。
	**/
	public GroupPaginatedRespDto getGroupsOfPublicAccount(GetGroupsOfPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-groups-of-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupPaginatedRespDto.class);
	}
	/**
	 * @summary 公共账号添加批量分组
	 * @description 公共账号通过分组 ID 添加批量分组
	**/
	public IsSuccessRespDto getPublicAccountOfGroups(SetUserGroupsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-public-account-of-groups");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取部门的公共账号列表
	 * @description 通过部门 ID，获取用户的公共账号列表。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountsOfDepartment(GetPublicAccountsOfDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-accounts-of-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 获取公共账号的部门列表
	 * @description 通过用户 ID，获取用户部门列表，支持分页，可以选择获取自定义数据、选择指定用户 ID 类型、增序或降序等。
	**/
	public UserDepartmentPaginatedRespDto getPublicAccountDepartments(GetDepartmentsOfPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-departments-of-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserDepartmentPaginatedRespDto.class);
	}
	/**
	 * @summary 设置公共账号所在部门
	 * @description 设置公共账号所在部门。
	**/
	public IsSuccessRespDto setPublicAccountOfDepartments(SetUserDepartmentsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-public-account-of-departments");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量离职用户
	 * @description 批量离职用户。离职操作会进行以下操作：
 * 
 * - 离职后该成员授权、部门、角色、分组、岗位关系将被删除；
 * - 离职后将保留用户基本信息，同时账号将被禁用，无法登录应用；如果需要彻底删除账号，请调用删除接口。
 * 
 * 该操作不可恢复，请谨慎操作！
 * 
	**/
	public ResignUserRespDto resignPublicAccountBatch(ResignUserBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/resign-public-account-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResignUserRespDto.class);
	}
	/**
	 * @summary 获取公共账号的岗位
	 * @description 获取公共账号的岗位
	**/
	public CreatePostDto getPostOfPublicUser(GetPostOfPublicAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-post-of-public-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CreatePostDto.class);
	}
	/**
	 * @summary 获取岗位的公共账号列表
	 * @description 通过岗位 ID，获取用户的公共账号列表。
	**/
	public PublicAccountPaginatedRespDto getPublicAccountsOfPost(GetPublicAccountsOfPostDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-public-accounts-of-post");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PublicAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 设置公共账号的岗位
	 * @description 设置公共账号关联的岗位
	**/
	public CommonResponseDto setPublicAccountOfnPost(UserConnectionPostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-public-account-of-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 解绑公共账号关联岗位
	 * @description 解绑公共账号关联岗位
	**/
	public IsSuccessRespDto unbindPublicAccountOfPost(UserConnectionPostDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/unbind-public-account-of-post");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取同步任务详情
	 * @description 获取同步任务详情
	**/
	public SyncTaskSingleRespDto getSyncTask(GetSyncTaskDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-sync-task");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncTaskSingleRespDto.class);
	}
	/**
	 * @summary 获取同步任务列表
	 * @description 获取同步任务列表
	**/
	public SyncTaskPaginatedRespDto listSyncTasks(ListSyncTasksDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-sync-tasks");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncTaskPaginatedRespDto.class);
	}
	/**
	 * @summary 创建同步任务
	 * @description 创建同步任务
	**/
	public SyncTaskPaginatedRespDto createSyncTask(CreateSyncTaskDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-sync-task");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SyncTaskPaginatedRespDto.class);
	}
	/**
	 * @summary 修改同步任务
	 * @description 修改同步任务
	**/
	public SyncTaskPaginatedRespDto updateSyncTask(UpdateSyncTaskDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-sync-task");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SyncTaskPaginatedRespDto.class);
	}
	/**
	 * @summary 执行同步任务
	 * @description 执行同步任务
	**/
	public TriggerSyncTaskRespDto triggerSyncTask(TriggerSyncTaskDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/trigger-sync-task");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TriggerSyncTaskRespDto.class);
	}
	/**
	 * @summary 获取同步作业详情
	 * @description 获取同步作业详情
	**/
	public SyncJobSingleRespDto getSyncJob(GetSyncJobDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-sync-job");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncJobSingleRespDto.class);
	}
	/**
	 * @summary 获取同步作业详情
	 * @description 获取同步作业详情
	**/
	public SyncJobPaginatedRespDto listSyncJobs(ListSyncJobsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-sync-jobs");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncJobPaginatedRespDto.class);
	}
	/**
	 * @summary 获取同步作业详情
	 * @description 获取同步作业详情
	**/
	public TriggerSyncTaskRespDto listSyncJobLogs(ListSyncJobLogsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-sync-job-logs");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TriggerSyncTaskRespDto.class);
	}
	/**
	 * @summary 获取同步风险操作列表
	 * @description 获取同步风险操作列表
	**/
	public SyncRiskOperationPaginatedRespDto listSyncRiskOperations(ListSyncRiskOperationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-sync-risk-operations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SyncRiskOperationPaginatedRespDto.class);
	}
	/**
	 * @summary 执行同步风险操作
	 * @description 执行同步风险操作
	**/
	public TriggerSyncRiskOperationsRespDto triggerSyncRiskOperations(TriggerSyncRiskOperationDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/trigger-sync-risk-operations");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TriggerSyncRiskOperationsRespDto.class);
	}
	/**
	 * @summary 取消同步风险操作
	 * @description 取消同步风险操作
	**/
	public CancelSyncRiskOperationsRespDto cancelSyncRiskOperation(CancelSyncRiskOperationDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/cancel-sync-risk-operation");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CancelSyncRiskOperationsRespDto.class);
	}
	/**
	 * @summary 获取分组详情
	 * @description 通过分组 code，获取分组详情。
	**/
	public GroupSingleRespDto getGroup(GetGroupDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
	}
	/**
	 * @summary 获取分组列表
	 * @description 获取分组列表，支持分页。
	**/
	public GroupPaginatedRespDto listGroups(ListGroupsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-groups");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupPaginatedRespDto.class);
	}
	/**
	 * @summary 获取所有分组
	 * @description 获取所有分组
	**/
	public GroupListRespDto getAllGroups(GetAllGroupsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-all-groups");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupListRespDto.class);
	}
	/**
	 * @summary 创建分组
	 * @description 创建分组，一个分组必须包含分组名称与唯一标志符 code，且必须为一个合法的英文标志符，如 developers。
	**/
	public GroupSingleRespDto createGroup(CreateGroupReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-group");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
	}
	/**
	 * @summary 创建或修改分组
	 * @description 不存在时则创建，存在时则进行更新。
	**/
	public CreateOrUpdateGroupRespDto createOrUpdateGroup(CreateOrUpdateGroupReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-or-update-group");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateOrUpdateGroupRespDto.class);
	}
	/**
	 * @summary 批量创建分组
	 * @description 批量创建分组，一个分组必须包含分组名称与唯一标志符 code，且必须为一个合法的英文标志符，如 developers。
	**/
	public GroupListRespDto createGroupsBatch(CreateGroupBatchReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-groups-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupListRespDto.class);
	}
	/**
	 * @summary 修改分组
	 * @description 通过分组 code，修改分组，可以修改此分组的 code。
	**/
	public GroupSingleRespDto updateGroup(UpdateGroupReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-group");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
	}
	/**
	 * @summary 批量删除分组
	 * @description 通过分组 code，批量删除分组。
	**/
	public IsSuccessRespDto deleteGroupsBatch(DeleteGroupsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-groups-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 添加分组成员
	 * @description 添加分组成员，成员以用户 ID 数组形式传递。
	**/
	public IsSuccessRespDto addGroupMembers(AddGroupMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-group-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量移除分组成员
	 * @description 批量移除分组成员，成员以用户 ID 数组形式传递。
	**/
	public IsSuccessRespDto removeGroupMembers(RemoveGroupMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-group-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取分组成员列表
	 * @description 通过分组 code，获取分组成员列表，支持分页，可以获取自定义数据、identities、部门 ID 列表。
	**/
	public UserPaginatedRespDto listGroupMembers(ListGroupMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-group-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 获取分组被授权的资源列表
	 * @description 通过分组 code，获取分组被授权的资源列表，可以通过资源类型、权限分组 code 筛选。
	**/
	public AuthorizedResourceListRespDto getGroupAuthorizedResources(GetGroupAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourceListRespDto.class);
	}
	/**
	 * @summary 获取角色详情
	 * @description 通过权限分组内角色 code，获取角色详情。
	**/
	public RoleSingleRespDto getRole(GetRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleSingleRespDto.class);
	}
	/**
	 * @summary 单个角色批量授权
	 * @description 通过权限分组内角色 code，分配角色，被分配者可以是用户或部门。
	**/
	public IsSuccessRespDto assignRole(AssignRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/assign-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量分配角色
	 * @description 批量分配角色，被分配者可以是用户，可以是部门
	**/
	public IsSuccessRespDto assignRoleBatch(AssignRoleBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/assign-role-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 移除分配的角色
	 * @description 通过权限分组内角色 code，移除分配的角色，被分配者可以是用户或部门。
	**/
	public IsSuccessRespDto revokeRole(RevokeRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量移除分配的角色
	 * @description 批量移除分配的角色，被分配者可以是用户，可以是部门
	**/
	public IsSuccessRespDto revokeRoleBatch(RevokeRoleBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-role-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取角色被授权的资源列表
	 * @description 通过权限分组内角色 code，获取角色被授权的资源列表。
	**/
	public RoleAuthorizedResourcePaginatedRespDto getRoleAuthorizedResources(GetRoleAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleAuthorizedResourcePaginatedRespDto.class);
	}
	/**
	 * @summary 获取角色成员列表
	 * @description 通过权限分组内内角色 code，获取角色成员列表，支持分页，可以选择或获取自定义数据、identities 等。
	**/
	public UserPaginatedRespDto listRoleMembers(ListRoleMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 获取角色的部门列表
	 * @description 通过权限分组内角色 code，获取角色的部门列表，支持分页。
	**/
	public RoleDepartmentListPaginatedRespDto listRoleDepartments(ListRoleDepartmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleDepartmentListPaginatedRespDto.class);
	}
	/**
	 * @summary 创建角色
	 * @description 通过权限分组（权限空间）内角色 code，创建角色，可以选择权限分组、角色描述、角色名称等。
	**/
	public RoleSingleRespDto createRole(CreateRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RoleSingleRespDto.class);
	}
	/**
	 * @summary 获取角色列表
	 * @description 获取角色列表，支持分页、支持根据权限分组（权限空间）筛选
	**/
	public RolePaginatedRespDto listRoles(ListRolesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
	}
	/**
	 * @summary 单个权限分组（权限空间）内删除角色
	 * @description 单个权限分组（权限空间）内删除角色，可以批量删除。
	**/
	public IsSuccessRespDto deleteRolesBatch(DeleteRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-roles-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量创建角色
	 * @description 批量创建角色，可以选择权限分组、角色描述等。
	**/
	public IsSuccessRespDto createRolesBatch(CreateRolesBatch reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-roles-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 修改角色
	 * @description 通过权限分组(权限空间）内角色新旧 Code，修改角色，可以选择角色名称、角色描述等。
	**/
	public IsSuccessRespDto updateRole(UpdateRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 跨权限分组（空间）删除角色
	 * @description 跨权限分组（空间）删除角色，可以批量删除。
	**/
	public IsSuccessRespDto deleteRoles(DeleteRoleBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/multiple-namespace-delete-roles-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 校验角色 Code 或者名称是否可用
	 * @description 通过用户池 ID、权限空间 Code和角色 Code,或者用户池 ID、权限空间名称和角色名称查询是否可用。
	**/
	public RoleCheckParamsRespDto checkParamsNamespace(CheckRoleParamsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-role-params");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RoleCheckParamsRespDto.class);
	}
	/**
	 * @summary 获取角色授权列表
	 * @description 获取角色授权列表。
	**/
	public RoleListPageRespDto listRoleAssignments(ListRoleAssignmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-assignments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleListPageRespDto.class);
	}
	/**
	 * @summary 创建管理员角色
	 * @description 通过角色 code、角色名称进行创建管理员角色，可以选择角色描述
	**/
	public RoleCheckParamsRespDto createAdminRole(CreateAdminRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-admin-role");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RoleCheckParamsRespDto.class);
	}
	/**
	 * @summary 删除管理员自定义角色
	 * @description 删除管理员自定义角色，支持批量删除。
	**/
	public IsSuccessRespDto deleteAdminRolesBatch(DeleteAdminRoleDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-admin-roles");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 检测角色互斥
	 * @description 检测一组角色是否存在互斥关系
	**/
	public CheckRoleMutualExclusionRespDto checkMutualExclusion(CheckRoleMutualExclusionReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-role-mutual-exclusion");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckRoleMutualExclusionRespDto.class);
	}
	/**
	 * @summary 获取身份源列表
	 * @description 获取身份源列表，可以指定 租户 ID 筛选。
	**/
	public ExtIdpListPaginatedRespDto listExtIdp(ListExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
	}
	/**
	 * @summary 获取身份源详情
	 * @description 通过 身份源 ID，获取身份源详情，可以指定 租户 ID 筛选。
	**/
	public ExtIdpDetailSingleRespDto getExtIdp(GetExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpDetailSingleRespDto.class);
	}
	/**
	 * @summary 创建身份源
	 * @description 创建身份源，可以设置身份源名称、连接类型、租户 ID 等。
	**/
	public ExtIdpSingleRespDto createExtIdp(CreateExtIdpDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpSingleRespDto.class);
	}
	/**
	 * @summary 更新身份源配置
	 * @description 更新身份源配置，可以设置身份源 ID 与 名称。
	**/
	public ExtIdpSingleRespDto updateExtIdp(UpdateExtIdpDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpSingleRespDto.class);
	}
	/**
	 * @summary 删除身份源
	 * @description 通过身份源 ID，删除身份源。
	**/
	public IsSuccessRespDto deleteExtIdp(DeleteExtIdpDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-ext-idp");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 在某个已有身份源下创建新连接
	 * @description 在某个已有身份源下创建新连接，可以设置身份源图标、是否只支持登录等。
	**/
	public ExtIdpConnDetailSingleRespDto createExtIdpConn(CreateExtIdpConnDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp-conn");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetailSingleRespDto.class);
	}
	/**
	 * @summary 更新身份源连接
	 * @description 更新身份源连接，可以设置身份源图标、是否只支持登录等。
	**/
	public ExtIdpConnDetailSingleRespDto updateExtIdpConn(UpdateExtIdpConnDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp-conn");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetailSingleRespDto.class);
	}
	/**
	 * @summary 删除身份源连接
	 * @description 通过身份源连接 ID，删除身份源连接。
	**/
	public IsSuccessRespDto deleteExtIdpConn(DeleteExtIdpConnDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-ext-idp-conn");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 身份源连接开关
	 * @description 身份源连接开关，可以打开或关闭身份源连接。
	**/
	public IsSuccessRespDto changeExtIdpConnState(ChangeExtIdpConnStateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/change-ext-idp-conn-state");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 租户关联身份源
	 * @description 租户可以关联或取消关联身份源连接。
	**/
	public IsSuccessRespDto changeExtIdpConnAssociationState(ChangeExtIdpAssociationStateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/change-ext-idp-conn-association-state");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 租户控制台获取身份源列表
	 * @description 在租户控制台内获取身份源列表，可以根据 应用 ID 筛选。
	**/
	public ExtIdpListPaginatedRespDto listTenantExtIdp(ListTenantExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
	}
	/**
	 * @summary 身份源下应用的连接详情
	 * @description 在身份源详情页获取应用的连接情况
	**/
	public ExtIdpListPaginatedRespDto extIdpConnStateByApps(ExtIdpConnAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/ext-idp-conn-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
	}
	/**
	 * @summary 获取用户内置字段列表
	 * @description 获取用户内置的字段列表
	**/
	public CustomFieldListRespDto getUserBaseFields() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-base-fields");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
	}
	/**
	 * @summary 获取用户内置字段列表
	 * @description 获取用户内置的字段列表
	**/
	public ListCistomFieldsResDto listUserBaseFields(ListUserBaseFieldsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-user-base-fields");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListCistomFieldsResDto.class);
	}
	/**
	 * @summary 修改用户内置字段配置
	 * @description 修改用户内置字段配置，内置字段不允许修改数据类型、唯一性。
	**/
	public CustomFieldListRespDto setUserBaseFields(SetUserBaseFieldsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-base-fields");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
	}
	/**
	 * @summary 获取自定义字段列表
	 * @description 通过主体类型，获取用户、部门或角色的自定义字段列表。
	**/
	public CustomFieldListRespDto getCustomFields(GetCustomFieldsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-custom-fields");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
	}
	/**
	 * @summary 获取自定义字段列表
	 * @description 通过主体类型，获取用户、部门或角色的自定义字段列表。
	**/
	public ListCistomFieldsResDto listCustFields(ListCustomFieldsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-custom-fields");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListCistomFieldsResDto.class);
	}
	/**
	 * @summary 创建/修改自定义字段定义
	 * @description 创建/修改用户、部门或角色自定义字段定义，如果传入的 key 不存在则创建，存在则更新。
	**/
	public CustomFieldListRespDto setCustomFields(SetCustomFieldsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-custom-fields");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
	}
	/**
	 * @summary 删除自定义字段定义
	 * @description 删除用户、部门或角色自定义字段定义。
	**/
	public IsSuccessRespDto deleteCustomFields(DeleteCustomFieldsReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-custom-fields");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 设置自定义字段的值
	 * @description 给用户、角色或部门设置自定义字段的值，如果存在则更新，不存在则创建。
	**/
	public IsSuccessRespDto setCustomData(SetCustomDataReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-custom-data");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户、分组、角色、组织机构的自定义字段值
	 * @description 通过筛选条件，获取用户、分组、角色、组织机构的自定义字段值。
	**/
	public GetCustomDataRespDto getCustomData(GetCustomDataDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-custom-data");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetCustomDataRespDto.class);
	}
	/**
	 * @summary 创建资源
	 * @description 创建资源，可以设置资源的描述、定义的操作类型、URL 标识等。
	**/
	public ResourceRespDto createResource(CreateResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
	}
	/**
	 * @summary 批量创建资源
	 * @description 批量创建资源，可以设置资源的描述、定义的操作类型、URL 标识等。
	**/
	public IsSuccessRespDto createResourcesBatch(CreateResourcesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-resources-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取资源详情
	 * @description 根据筛选条件，获取资源详情。
	**/
	public ResourceRespDto getResource(GetResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resource");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
	}
	/**
	 * @summary 批量获取资源详情
	 * @description 根据筛选条件，批量获取资源详情。
	**/
	public ResourceListRespDto getResourcesBatch(GetResourcesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resources-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourceListRespDto.class);
	}
	/**
	 * @summary 分页获取常规资源列表
	 * @description 根据筛选条件，分页获取常规资源详情列表。
	**/
	public CommonResourcePaginatedRespDto listCommonResource(ListCommonResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-common-resource");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CommonResourcePaginatedRespDto.class);
	}
	/**
	 * @summary 分页获取资源列表
	 * @description 根据筛选条件，分页获取资源详情列表。
	**/
	public ResourcePaginatedRespDto listResources(ListResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourcePaginatedRespDto.class);
	}
	/**
	 * @summary 修改资源
	 * @description 修改资源，可以设置资源的描述、定义的操作类型、URL 标识等。
	**/
	public ResourceRespDto updateResource(UpdateResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
	}
	/**
	 * @summary 删除资源
	 * @description 通过资源唯一标志符以及所属权限分组，删除资源。
	**/
	public IsSuccessRespDto deleteResource(DeleteResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除资源
	 * @description 通过资源唯一标志符以及所属权限分组，批量删除资源
	**/
	public IsSuccessRespDto deleteResourcesBatch(DeleteResourcesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-resources-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除资源
	 * @description 通过资源id批量删除资源
	**/
	public IsSuccessRespDto batchDeleteCommonResource(DeleteCommonResourcesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-common-resources-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 关联/取消关联应用资源到租户
	 * @description 通过资源唯一标识以及权限分组，关联或取消关联资源到租户
	**/
	public IsSuccessRespDto associateTenantResource(AssociateTenantResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/associate-tenant-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 创建权限分组
	 * @description 创建权限分组，可以设置权限分组名称、Code 和描述信息。
	**/
	public NamespaceRespDto createNamespace(CreateNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, NamespaceRespDto.class);
	}
	/**
	 * @summary 批量创建权限分组
	 * @description 批量创建权限分组，可以分别设置权限分组名称、Code 和描述信息。
	**/
	public IsSuccessRespDto createNamespacesBatch(CreateNamespacesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-namespaces-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取权限分组详情
	 * @description 通过权限分组唯一标志符(Code)，获取权限分组详情。
	**/
	public NamespaceRespDto getNamespace(GetNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-namespace");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceRespDto.class);
	}
	/**
	 * @summary 批量获取权限分组详情
	 * @description 分别通过权限分组唯一标志符(Code)，批量获取权限分组详情。
	**/
	public NamespaceListRespDto getNamespacesBatch(GetNamespacesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceListRespDto.class);
	}
	/**
	 * @summary 修改权限分组信息
	 * @description 修改权限分组信息，可以修改名称、描述信息以及新的唯一标志符(NewCode)。
	**/
	public UpdateNamespaceRespDto updateNamespace(UpdateNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateNamespaceRespDto.class);
	}
	/**
	 * @summary 删除权限分组信息
	 * @description 通过权限分组唯一标志符(Code)，删除权限分组信息。
	**/
	public IsSuccessRespDto deleteNamespace(DeleteNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除权限分组
	 * @description 分别通过权限分组唯一标志符(Code)，批量删除权限分组。
	**/
	public IsSuccessRespDto deleteNamespacesBatch(DeleteNamespacesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-namespaces-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 分页获取权限分组列表
	 * @description 根据筛选条件，分页获取权限分组列表。
	**/
	public NamespaceListPaginatedRespDto listNamespaces(ListNamespacesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-namespaces");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceListPaginatedRespDto.class);
	}
	/**
	 * @summary 分页权限分组下所有的角色列表
	 * @description 根据筛选条件，分页获取权限分组下所有的角色列表。
	**/
	public NamespaceRolesListPaginatedRespDto listNamespaceRoles(ListNamespaceRolesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-namespace-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceRolesListPaginatedRespDto.class);
	}
	/**
	 * @summary 授权资源
	 * @description 将一个/多个资源授权给用户、角色、分组、组织机构等主体，且可以分别指定不同的操作权限。
	**/
	public IsSuccessRespDto authorizeResources(AuthorizeResourcesDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/authorize-resources");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取某个主体被授权的资源列表
	 * @description 根据筛选条件，获取某个主体被授权的资源列表。
	**/
	public AuthorizedResourcePaginatedRespDto getAuthorizedResources(GetAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
	}
	/**
	 * @summary 判断用户是否对某个资源的某个操作有权限
	 * @description 判断用户是否对某个资源的某个操作有权限。
	**/
	public IsActionAllowedRespDtp isActionAllowed(IsActionAllowedDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-action-allowed");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsActionAllowedRespDtp.class);
	}
	/**
	 * @summary 获取资源被授权的主体
	 * @description 获取资源被授权的主体
	**/
	public GetResourceAuthorizedTargetRespDto getResourceAuthorizedTargets(GetResourceAuthorizedTargetsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resource-authorized-targets");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetResourceAuthorizedTargetRespDto.class);
	}
	/**
	 * @summary 获取用户行为日志
	 * @description 可以选择请求 ID、客户端 IP、用户 ID、应用 ID、开始时间戳、请求是否成功、分页参数来获取用户行为日志
	**/
	public UserActionLogRespDto getUserActionLogs(GetUserActionLogsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-action-logs");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserActionLogRespDto.class);
	}
	/**
	 * @summary 获取管理员操作日志
	 * @description 可以选择请求 ID、客户端 IP、操作类型、资源类型、管理员用户 ID、请求是否成功、开始时间戳、结束时间戳、分页来获取管理员操作日志接口
	**/
	public AdminAuditLogRespDto getAdminAuditLogs(GetAdminAuditLogsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-admin-audit-logs");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AdminAuditLogRespDto.class);
	}
	/**
	 * @summary 获取邮件模版列表
	 * @description 获取邮件模版列表
	**/
	public GetEmailTemplatesRespDto getEmailTemplates() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-email-templates");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetEmailTemplatesRespDto.class);
	}
	/**
	 * @summary 修改邮件模版
	 * @description 修改邮件模版
	**/
	public EmailTemplateSingleItemRespDto updateEmailTemplate(UpdateEmailTemplateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-email-template");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, EmailTemplateSingleItemRespDto.class);
	}
	/**
	 * @summary 预览邮件模版
	 * @description 预览邮件模版
	**/
	public PreviewEmailTemplateRespDto previewEmailTemplate(PreviewEmailTemplateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/preview-email-template");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PreviewEmailTemplateRespDto.class);
	}
	/**
	 * @summary 获取第三方邮件服务配置
	 * @description 获取第三方邮件服务配置
	**/
	public EmailProviderRespDto getEmailProvider() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-email-provider");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, EmailProviderRespDto.class);
	}
	/**
	 * @summary 配置第三方邮件服务
	 * @description 配置第三方邮件服务
	**/
	public EmailProviderRespDto configEmailProvider(ConfigEmailProviderDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/config-email-provider");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, EmailProviderRespDto.class);
	}
	/**
	 * @summary 获取应用详情
	 * @description 通过应用 ID，获取应用详情。
	**/
	public ApplicationSingleRespDto getApplication(GetApplicationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSingleRespDto.class);
	}
	/**
	 * @summary 主体授权详情
	 * @description 主体授权详情
	**/
	public GetSubjectAuthRespDto detailAuthSubject(GetSubjectAuthDetailDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-subject-auth-detail");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetSubjectAuthRespDto.class);
	}
	/**
	 * @summary 主体授权列表
	 * @description 主体授权列表
	**/
	public ListApplicationSubjectRespDto listAuthSubject(ListAuthSubjectDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-subject-auth");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListApplicationSubjectRespDto.class);
	}
	/**
	 * @summary 应用授权列表
	 * @description 应用授权列表
	**/
	public ListApplicationAuthPaginatedRespDto listAuthApplication(ListApplicationAuthDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-applications-auth");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListApplicationAuthPaginatedRespDto.class);
	}
	/**
	 * @summary 更新授权开关
	 * @description 更新授权开关
	**/
	public IsSuccessRespDto enabledAuth(UpdateAuthEnabledDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-auth-enabled");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除应用授权
	 * @description 批量删除应用授权
	**/
	/**
	 * @summary 获取应用列表
	 * @description 获取应用列表
	**/
	public ApplicationPaginatedRespDto listApplications(ListApplicationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-applications");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationPaginatedRespDto.class);
	}
	/**
	 * @summary 获取应用简单信息
	 * @description 通过应用 ID，获取应用简单信息。
	**/
	public ApplicationSimpleInfoSingleRespDto getApplicationSimpleInfo(GetApplicationSimpleInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-simple-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSimpleInfoSingleRespDto.class);
	}
	/**
	 * @summary 获取应用简单信息列表
	 * @description 获取应用简单信息列表
	**/
	public ApplicationSimpleInfoPaginatedRespDto listApplicationSimpleInfo(ListApplicationSimpleInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-application-simple-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSimpleInfoPaginatedRespDto.class);
	}
	/**
	 * @summary 创建应用
	 * @description 创建应用
	**/
	public CreateApplicationRespDto createApplication(CreateApplicationDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-application");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateApplicationRespDto.class);
	}
	/**
	 * @summary 删除应用
	 * @description 通过应用 ID，删除应用。
	**/
	public IsSuccessRespDto deleteApplication(DeleteApplicationDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-application");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取应用密钥
	 * @description 获取应用密钥
	**/
	public GetApplicationSecretRespDto getApplicationSecret(GetApplicationSecretDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-secret");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetApplicationSecretRespDto.class);
	}
	/**
	 * @summary 刷新应用密钥
	 * @description 刷新应用密钥
	**/
	public RefreshApplicationSecretRespDto refreshApplicationSecret(RefreshApplicationSecretDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/refresh-application-secret");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RefreshApplicationSecretRespDto.class);
	}
	/**
	 * @summary 获取应用当前登录用户
	 * @description 获取应用当前处于登录状态的用户
	**/
	public UserPaginatedRespDto listApplicationActiveUsers(ListApplicationActiveUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-application-active-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
	}
	/**
	 * @summary 获取应用默认访问授权策略
	 * @description 获取应用默认访问授权策略
	**/
	public GetApplicationPermissionStrategyRespDto getApplicationPermissionStrategy(GetApplicationPermissionStrategyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-permission-strategy");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetApplicationPermissionStrategyRespDto.class);
	}
	/**
	 * @summary 更新应用默认访问授权策略
	 * @description 更新应用默认访问授权策略
	**/
	public IsSuccessRespDto updateApplicationPermissionStrategy(UpdateApplicationPermissionStrategyDataDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-application-permission-strategy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 授权应用访问权限
	 * @description 给用户、分组、组织或角色授权应用访问权限，如果用户、分组、组织或角色不存在，则跳过，进行下一步授权，不返回报错
	**/
	public IsSuccessRespDto authorizeApplicationAccess(AuthorizeApplicationAccessDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/authorize-application-access");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 删除应用访问授权记录
	 * @description 取消给用户、分组、组织或角色的应用访问权限授权,如果传入数据不存在，则返回数据不报错处理。
	**/
	public IsSuccessRespDto revokeApplicationAccess(RevokeApplicationAccessDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-application-access");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 检测域名是否可用
	 * @description 检测域名是否可用于创建新应用或更新应用域名
	**/
	public CheckDomainAvailableSecretRespDto checkDomainAvailable(CheckDomainAvailable reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-domain-available");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckDomainAvailableSecretRespDto.class);
	}
	/**
	 * @summary 获取租户应用列表
	 * @description 获取应用列表，可以指定 租户 ID 筛选。
	**/
	public TenantApplicationListPaginatedRespDto listTenantApplications(ListTenantApplicationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-applications");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantApplicationListPaginatedRespDto.class);
	}
	/**
	 * @summary 更新应用登录页配置
	 * @description 通过应用 ID 更新登录页配置。
	**/
	public IsSuccessRespDto updateLoginPageConfig(UpdateLoginConfigDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-login-page-config");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取用户池租户配置信息
	 * @description 根据用户池 ID 获取用户池多租户配置信息
	**/
	public UserPoolTenantConfigDtoRespDto userpollTenantConfig() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/userpool-tenant-config");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPoolTenantConfigDtoRespDto.class);
	}
	/**
	 * @summary 更新用户池租户配置信息
	 * @description 更新用户池多租户配置内登录信息
	**/
	public IsSuccessRespDto updateUserPoolTenantConfig(UpdateUserPoolTenantLoginConfigDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-userpool-tenant-config");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 更新租户控制台扫码登录状态
	 * @description 更新租户控制台扫码登录状态
	**/
	public IsSuccessRespDto updateTenantQrCodeState(UpdateTenantAppqrcodeState reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-userpool-tenant-appqrcode-state");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 设置用户池多租户身份源连接
	 * @description 设置用户池多租户身份源连接，支持同时设置多个身份源连接，支持设置连接和取消连接
	**/
	public IsSuccessRespDto changeUserpoolTenanExtIdpConnState(ChangeUserPoolTenantExtIdpConnDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/change-userpool-tenant-ext-idp-conn-state");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 修改应用多因素认证配置
	 * @description 传入 MFA 认证因素列表进行开启或关闭
	**/
	public MFASettingsRespDto updateApplicationMfaSettings(UpdateApplicationMfaSettingsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-application-mfa-settings");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, MFASettingsRespDto.class);
	}
	/**
	 * @summary 获取应用下用户 MFA 触发数据
	 * @description 获取应用下用户 MFA 触发数据。
	**/
	public GetMapInfoRespDto getMfaTriggerData(GetMfaTriggerDataDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-mfa-trigger-data");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetMapInfoRespDto.class);
	}
	/**
	 * @summary 创建 ASA 账号
	 * @description 在某一应用下创建 ASA 账号
	**/
	public AsaAccountSingleRespDto createAsaAccount(CreateAsaAccountDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-asa-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AsaAccountSingleRespDto.class);
	}
	/**
	 * @summary 批量创建 ASA 账号
	 * @description 在某一应用下批量创建 ASA 账号
	**/
	public IsSuccessRespDto createAsaAccountBatch(CreateAsaAccountsBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-asa-accounts-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 更新 ASA 账号
	 * @description 更新某个 ASA 账号信息
	**/
	public AsaAccountSingleRespDto updateAsaAccount(UpdateAsaAccountDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-asa-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AsaAccountSingleRespDto.class);
	}
	/**
	 * @summary 获取 ASA 账号列表
	 * @description 分页获取某一应用下的 ASA 账号列表
	**/
	public AsaAccountPaginatedRespDto listAsaAccount(ListAsaAccountsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-asa-accounts");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AsaAccountPaginatedRespDto.class);
	}
	/**
	 * @summary 获取 ASA 账号
	 * @description 根据 ASA 账号 ID 获取账号详细信息
	**/
	public AsaAccountSingleRespDto getAsaAccount(GetAsaAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-asa-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AsaAccountSingleRespDto.class);
	}
	/**
	 * @summary 批量获取 ASA 账号
	 * @description 根据 ASA 账号 ID 列表批量获取账号详细信息
	**/
	public AsaAccountListRespDto getAsaAccountBatch(GetAsaAccountBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-asa-accounts-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AsaAccountListRespDto.class);
	}
	/**
	 * @summary 删除 ASA 账号
	 * @description 通过 ASA 账号 ID 删除 ASA 账号
	**/
	public IsSuccessRespDto deleteAsaAccount(DeleteAsaAccountDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-asa-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除 ASA 账号
	 * @description 通过 ASA 账号 ID 批量删除 ASA 账号
	**/
	public IsSuccessRespDto deleteAsaAccountBatch(DeleteAsaAccountBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-asa-accounts-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 分配 ASA 账号
	 * @description 分配 ASA 账号给用户、组织、分组或角色
	**/
	public IsSuccessRespDto assignAsaAccount(AssignAsaAccountsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/assign-asa-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 取消分配 ASA 账号
	 * @description 取消分配给用户、组织、分组或角色的  ASA 账号
	**/
	public IsSuccessRespDto unassignAsaAccount(AssignAsaAccountsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/unassign-asa-account");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取 ASA 账号分配的主体列表
	 * @description 根据 ASA 账号 ID 分页获取账号被分配的主体列表
	**/
	public GetAsaAccountAssignedTargetRespDto getAsaAccountAssignedTargets(GetAsaAccountAssignedTargetsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-asa-account-assigned-targets");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetAsaAccountAssignedTargetRespDto.class);
	}
	/**
	 * @summary 获取主体被分配的 ASA 账号
	 * @description 根据主体类型和标识获取直接分配给主体的 ASA 账号
	**/
	public AsaAccountSingleNullableRespDto getAssignedAccount(GetAssignedAccountDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-assigned-account");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AsaAccountSingleNullableRespDto.class);
	}
	/**
	 * @summary 获取安全配置
	 * @description 无需传参获取安全配置
	**/
	public SecuritySettingsRespDto getSecuritySettings() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-security-settings");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, SecuritySettingsRespDto.class);
	}
	/**
	 * @summary 修改安全配置
	 * @description 可选安全域、Authing Token 有效时间（秒）、验证码长度、验证码尝试次数、用户修改邮箱的安全策略、用户修改手机号的安全策略、Cookie 过期时间设置、是否禁止用户注册、频繁注册检测配置、验证码注册后是否要求用户设置密码、未验证的邮箱登录时是否禁止登录并发送认证邮件、用户自助解锁配置、Authing 登录页面是否开启登录账号选择、APP 扫码登录安全配置进行修改安全配置
	**/
	public SecuritySettingsRespDto updateSecuritySettings(UpdateSecuritySettingsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-security-settings");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SecuritySettingsRespDto.class);
	}
	/**
	 * @summary 获取全局多因素认证配置
	 * @description 无需传参获取全局多因素认证配置
	**/
	public MFASettingsRespDto getGlobalMfaSettings() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-global-mfa-settings");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, MFASettingsRespDto.class);
	}
	/**
	 * @summary 修改全局多因素认证配置
	 * @description 传入 MFA 认证因素列表进行开启,
	**/
	public MFASettingsRespDto updateGlobalMfaSettings(MFASettingsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-global-mfa-settings");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, MFASettingsRespDto.class);
	}
	/**
	 * @summary 创建租户
	**/
	public CreateTenantRespDto createTenant(CreateTenantDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-tenant");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateTenantRespDto.class);
	}
	/**
	 * @summary 更新租户数据
	 * @description 此接口用于更新租户基本信息。
	**/
	public IsSuccessRespDto updateTenant(UpdateTenantDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-tenant");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 删除租户
	 * @description 此接口用于删除租户。
	**/
	public IsSuccessRespDto deleteTenant(DeleteTenantDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-tenant");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取/搜索租户列表
	 * @description 此接口用于获取租户列表，支持模糊搜索。
	**/
	public TenantListPaginatedRespDto listTenants(ListTenantsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenants");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantListPaginatedRespDto.class);
	}
	/**
	 * @summary 获取租户一点点的信息
	 * @description 根据租户 ID 获取租户一点点的详情
	**/
	public TenantSingleRespDto getTenantLittleInfo(GetTenantLittleInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant-little-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantSingleRespDto.class);
	}
	/**
	 * @summary 获取租户详情
	 * @description 根据租户 ID 获取租户详情
	**/
	public TenantSingleRespDto getTenant(GetTenantDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantSingleRespDto.class);
	}
	/**
	 * @summary 导入租户
	 * @description 此接口用于 Excel 导入租户。
	**/
	public ImportTenantRespDto importTenant(ImportTenantDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/import-tenant");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ImportTenantRespDto.class);
	}
	/**
	 * @summary 导入租户历史
	 * @description 此接口用于 Excel 导入租户的历史查询。
	**/
	public ImportTenantHistoryRespDto importTenantHistory(ImportTenantHistoryDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/import-tenant-history");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ImportTenantHistoryRespDto.class);
	}
	/**
	 * @summary 导入租户通知用户列表
	 * @description 此接口用于查询导入租户通知用户列表。
	**/
	public ImportTenantNotifyUserRespDto importTenantNotifyUser(ImportTenantNotifyUserDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/import-tenant-notify-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ImportTenantNotifyUserRespDto.class);
	}
	/**
	 * @summary 导入租户通知邮箱用户
	 * @description 此接口用于批量发送邮件通知。
	**/
	public SendEmailBatchDataDto sendEmailBatch(SendManyTenantEmailDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/send-email-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SendEmailBatchDataDto.class);
	}
	/**
	 * @summary 导入租户短信通知用户
	 * @description 此接口用于批量发送短信通知。
	**/
	public SendSmsBatchRespDto sendSmsBatch(SendManyTenantSmsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/send-sms-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SendSmsBatchRespDto.class);
	}
	/**
	 * @summary 获取租户管理员列表
	 * @description 此接口用于获取租户成员列表，支持模糊搜索。
	**/
	public TenantUserListPaginatedRespDto listTenantAdmin(ListTenantAdminDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-admin");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TenantUserListPaginatedRespDto.class);
	}
	/**
	 * @summary 设置租户管理员
	 * @description 此接口用于根据用户 ID 或租户成员 ID 设置租户管理员。
	**/
	public CommonResponseDto setTenantAdmin(RemoveTenantUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-tenant-admin");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 取消设置租户管理员
	 * @description 此接口用于根据用户 ID 或租户成员 ID 取消设置租户管理员。
	**/
	public CommonResponseDto deleteTenantAdmin(GetTenantUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-tenant-admin");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 批量移除租户成员
	 * @description 此接口用于根据用户 ID 或租户成员 ID 批量移除租户成员。
	**/
	public CommonResponseDto deleteTenantUser(RemoveTenantUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-tenant-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 生成一个邀请租户成员的链接
	 * @description 此接口用于生成一个邀请租户成员的链接。appId 为用户注册成功后要访问的应用 ID
	**/
	public InviteTenantUsersRespDto generateInviteTenantUserLink(GenerateInviteTenantUserLink reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/generate-invite-tenant-user-link");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, InviteTenantUsersRespDto.class);
	}
	/**
	 * @summary 获取可访问的租户控制台列表
	 * @description 根据用户 ID 获取可访问的租户控制台列表
	**/
	public InviteTenantUserRecordListRespDto listInviteTennatUserRecords(ListInviteTenantUserRecordsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-invite-tenant-user-records");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, InviteTenantUserRecordListRespDto.class);
	}
	/**
	 * @summary 获取多租户管理员用户列表
	 * @description 根据用户池 ID 获取某个用户池内拥有多租户管理权限的用户列表
	**/
	public MultipleTenantAdminPaginatedRespDto listMultipleTenantAdmin(ListMultipleTenantAdminsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-multiple-tenant-admins");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, MultipleTenantAdminPaginatedRespDto.class);
	}
	/**
	 * @summary 创建多租户管理员用户
	 * @description 根据用户 ID 创建一个用户池内拥有多租户管理权限的用户
	**/
	public CommonResponseDto createMultipleTenantAdmin(CreateMultipleTenantAdminDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-multiple-tenant-admin");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取多租户管理员用户列表
	 * @description 根据用户池 ID 获取某个用户池内拥有多租户管理权限的用户列表
	**/
	public MultipleTenantAdminPaginatedRespDto getMultipleTenantAdmin(GetMultipleTenantAdminDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-multiple-tenant-admin");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, MultipleTenantAdminPaginatedRespDto.class);
	}
	/**
	 * @summary 获取协作管理员用户列表
	 * @description 根据用户池 ID 获取某个用户池内拥有协作管理员能力的用户列表
	**/
	public TenantCooperatorPaginatedRespDto listTenantCooperators(ListTenantCooperatorsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-cooperators");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantCooperatorPaginatedRespDto.class);
	}
	/**
	 * @summary 获取一个协调管理员
	 * @description 根据用户池 ID 获取某个协调管理员的列表
	**/
	public TenantCooperatorSingleRespDto getTenantCooperator(GetTenantCooperatorDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant-cooperator");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantCooperatorSingleRespDto.class);
	}
	/**
	 * @summary 获取一个协调管理员拥有的列表
	 * @description 根据用户池 ID 获取某个协调管理员的列表
	**/
	public TenantCooperatorSingleRespDto getTenantCooperatorMenu(GetTenantCooperatorMenuDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant-cooperator-menu");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantCooperatorSingleRespDto.class);
	}
	/**
	 * @summary 创建协调管理员
	 * @description 创建一个协调管理员
	**/
	public CommonResponseDto createTenantCooperator(CreateTenantCooperatorDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-tenant-cooperator");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取租户详情
	 * @description 根据租户 Code 获取租户详情
	**/
	public TenantSingleRespDto getTenantByCode(GetTenantByCodeDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant-by-code");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantSingleRespDto.class);
	}
	/**
	 * @summary 发送邀请租户用户邮件
	 * @description 向多个邮箱发送邀请成为租户用户的邮件
	**/
	public CommonResponseDto sendInviteTenantUserEmail(SendInviteTenantUserEmailDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/send-invite-tenant-user-email");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 添加租户成员
	 * @description 根据用户 ID 批量添加租户成员
	**/
	public CommonResponseDto addTenantUsers(AddTenantUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-tenant-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 批量移除租户成员
	 * @description 此接口用于根据用户 ID 或租户成员 ID 批量移除租户成员。
	**/
	public CommonResponseDto removeTenantUsers(RemoveTenantUsersDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-tenant-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 更新租户成员
	 * @description 此接口用于根据用户 ID 或租户成员 ID 更新租户成员。
	**/
	public CommonResponseDto updateTenantUser(UpdateTenantUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-tenant-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 创建租户成员
	 * @description 创建租户成员，邮箱、手机号、用户名必须包含其中一个，邮箱、手机号、用户名、externalId 用户池内唯一，此接口将以管理员身份创建用户因此不需要进行手机号验证码检验等安全检测。
	**/
	public TenantUserDto createTenantUser(CreateTenantUserReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-tenant-user");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TenantUserDto.class);
	}
	/**
	 * @summary 获取/搜索租户成员列表
	 * @description 
 * 此接口用于获取用户列表，支持模糊搜索，以及通过用户基础字段、用户自定义字段、用户所在部门、用户历史登录应用等维度筛选用户。
 * 
 * ### 模糊搜素示例
 * 
 * 模糊搜索默认会从 `phone`, `email`, `name`, `username`, `nickname` 五个字段对用户进行模糊搜索，你也可以通过设置 `options.fuzzySearchOn`
 * 决定模糊匹配的字段范围：
 * 
 * ```json
 * {
 * "keywords": "北京",
 * "options": {
 * "fuzzySearchOn": [
 * "address"
 * ]
 * }
 * }
 * ```
 * 
 * ### 高级搜索示例
 * 
 * 你可以通过 `advancedFilter` 进行高级搜索，高级搜索支持通过用户的基础信息、自定义数据、所在部门、用户来源、登录应用、外部身份源信息等维度对用户进行筛选。
 * **且这些筛选条件可以任意组合。**
 * 
 * #### 筛选邮箱中包含 `@example.com` 的用户
 * 
 * 用户邮箱（`email`）为字符串类型，可以进行模糊搜索：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "email",
 * "operator": "CONTAINS",
 * "value": "@example.com"
 * }
 * ]
 * }
 * ```
 * 
 * 
 * #### 根据用户登录次数筛选
 * 
 * 筛选登录次数大于 10 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "GREATER",
 * "value": 10
 * }
 * ]
 * }
 * ```
 * 
 * 筛选登录次数在 10 - 100 次的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loginsCount",
 * "operator": "BETWEEN",
 * "value": [10, 100]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户上次登录时间进行筛选
 * 
 * 筛选最近 7 天内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLoginTime",
 * "operator": "GREATER",
 * "value": new Date(Date.now() - 7 * 24 * 60 * 60 * 1000)
 * }
 * ]
 * }
 * ```
 * 
 * 筛选在某一段时间内登录过的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "lastLoginTime",
 * "operator": "BETWEEN",
 * "value": [
 * Date.now() - 14 * 24 * 60 * 60 * 1000,
 * Date.now() - 7 * 24 * 60 * 60 * 1000
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户曾经登录过的应用筛选
 * 
 * 筛选出曾经登录过应用 `appId1` 或者 `appId2` 的用户：
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "loggedInApps",
 * "operator": "IN",
 * "value": [
 * "appId1",
 * "appId2"
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * #### 根据用户所在部门进行筛选
 * 
 * ```json
 * {
 * "advancedFilter": [
 * {
 * "field": "department",
 * "operator": "IN",
 * "value": [
 * {
 * "organizationCode": "steamory",
 * "departmentId": "root",
 * "departmentIdType": "department_id",
 * "includeChildrenDepartments": true
 * }
 * ]
 * }
 * ]
 * }
 * ```
 * 
 * 
	**/
	public TenantUserListPaginatedRespDto listTenantUsers(ListTenantUserDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-users");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TenantUserListPaginatedRespDto.class);
	}
	/**
	 * @summary 获取单个租户成员
	 * @description 根据用户 ID 或租户成员 ID 获取租户成员信息
	**/
	public TenantUserSingleRespDto getTenantUser(GetTenantUserDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-tenant-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, TenantUserSingleRespDto.class);
	}
	/**
	 * @summary 租户部门下添加成员
	 * @description 通过部门 ID、组织 code，添加部门下成员。
	**/
	public IsSuccessRespDto addTenantDepartmentMembers(AddTenantDepartmentMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-tenant-department-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 租户部门下删除成员
	 * @description 通过部门 ID、组织 code，删除部门下成员。
	**/
	public IsSuccessRespDto removeTenantDepartmentMembers(RemoveTenantDepartmentMembersReqDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-tenant-department-members");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 创建权限空间
	 * @description 创建权限空间,可以设置权限空间名称、Code 和描述信息。
	**/
	public CreatePermissionNamespaceResponseDto createPermissionNamespace(CreatePermissionNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-permission-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreatePermissionNamespaceResponseDto.class);
	}
	/**
	 * @summary 批量创建权限空间
	 * @description 批量创建权限空间，可以分别设置权限空间名称、Code 和描述信息。
	**/
	public IsSuccessRespDto createPermissionNamespacesBatch(CreatePermissionNamespacesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-permission-namespaces-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取权限空间详情
	 * @description 通过权限空间唯一标志符(Code)，获取权限空间详情。
	**/
	public GetPermissionNamespaceResponseDto getPermissionNamespace(GetPermissionNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-permission-namespace");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetPermissionNamespaceResponseDto.class);
	}
	/**
	 * @summary 批量获取权限空间详情列表
	 * @description 分别通过权限空间唯一标志符(Code)，获取权限空间详情。
	**/
	public GetPermissionNamespaceListResponseDto getPermissionNamespacesBatch(GetPermissionNamespacesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-permission-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetPermissionNamespaceListResponseDto.class);
	}
	/**
	 * @summary 分页获取权限空间列表
	 * @description 分页获取权限空间列表。
	**/
	public PermissionNamespaceListPaginatedRespDto listPermissionNamespaces(ListPermissionNamespacesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-permission-namespaces");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PermissionNamespaceListPaginatedRespDto.class);
	}
	/**
	 * @summary 修改权限空间
	 * @description 修改权限空间，可以修改权限空间名称、权限空间描述信息以及权限空间新的唯一标志符(Code)。
	**/
	public UpdatePermissionNamespaceResponseDto updatePermissionNamespace(UpdatePermissionNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-permission-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdatePermissionNamespaceResponseDto.class);
	}
	/**
	 * @summary 删除权限空间
	 * @description 通过权限空间唯一标志符(Code)，删除权限空间信息。
	**/
	public IsSuccessRespDto deletePermissionNamespace(DeletePermissionNamespaceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-permission-namespace");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 批量删除权限空间
	 * @description 分别通过权限空间唯一标志符(Code)，批量删除权限空间信息。
	**/
	public IsSuccessRespDto deletePermissionNamespacesBatch(DeletePermissionNamespacesBatchDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-permission-namespaces-batch");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 校验权限空间 Code 或者名称是否可用
	 * @description 通过用户池 ID 和权限空间 Code,或者用户池 ID 和权限空间名称查询是否可用。
	**/
	public PermissionNamespaceCheckExistsRespDto checkPermissionNamespaceExists(CheckPermissionNamespaceExistsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-permission-namespace-exists");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PermissionNamespaceCheckExistsRespDto.class);
	}
	/**
	 * @summary 分页查询权限空间下所有的角色列表
	 * @description 分页查询权限空间下所有的角色列表，分页获取权限空间下所有的角色列表。
	**/
	public PermissionNamespaceRolesListPaginatedRespDto listPermissionNamespaceRoles(ListPermissionNamespaceRolesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-permission-namespace-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PermissionNamespaceRolesListPaginatedRespDto.class);
	}
	/**
	 * @summary 创建数据资源（推荐、重点）
	 * @description 
 * ## 描述
 * 该接口用于创建数据资源，当你存在需要被设置权限的数据，根据它们的数据类型，创建对应类型的数据资源，目前我们支持：字符串、数组、树三种类型。
 * ## 注意
 * 请求体中的 `struct` 字段需要根据不同的资源类型传入不同的数据结构，具体请参考下面的示例
 * ## 请求示例
 * ### 创建字符串类型数据资源示例
 * 当你的数据仅用一个字符串就可以表示时，可以使用此类型，例如：一个 API、一个用户 ID 等。
 * 以下是创建一个表示 '/resource/create' API 的数据资源示例：
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "createResource API",
 * "description": "这是 createResource API",
 * "resourceCode": "createResourceAPI",
 * "type": "STRING",
 * "struct": "/resource/create",
 * "actions": ["access"]
 * }
 * ```
 * 
 * ### 创建数组类型数据资源示例
 * 当你的数据是一组同类型的数据时，可以使用此类型，例如：一组文档链接、一组门禁卡号等。
 * 以下是创建一个表示一组门禁卡号的数据资源示例：
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "一组门禁卡号",
 * "description": "这是一组门禁卡号",
 * "resourceCode": "accessCardNumber",
 * "type": "ARRAY",
 * "struct": ["accessCardNumber1", "accessCardNumber2", "accessCardNumber3"],
 * "actions": ["get", "update"]
 * }
 * ```
 * 
 * ### 创建树类型数据资源示例
 * 当你的数据是具备层级关系时，可以使用此类型，例如：组织架构、文件夹结构等。
 * 以下是创建一个表示公司组织架构的数据资源示例：
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "Authing",
 * "description": "这是 Authing 的组织架构",
 * "resourceCode": "authing",
 * "type": "TREE",
 * "struct": [
 * {
 * "name": "产品",
 * "code": "product",
 * "value": "product",
 * "children": [
 * {
 * "name": "产品经理",
 * "code": "productManager",
 * "value": "pm"
 * },
 * {
 * "name": "设计",
 * "code": "design",
 * "value": "ui"
 * }
 * ]
 * },
 * {
 * "name": "研发",
 * "code": "researchAndDevelopment",
 * "value": "rd"
 * }
 * ],
 * "actions": ["get", "update", "delete"]
 * }
 * ```
 * 
	**/
	public CreateDataResourceResponseDto createDataResource(CreateDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateDataResourceResponseDto.class);
	}
	/**
	 * @summary 创建字符串数据资源
	 * @description 当你仅需要创建字符串类型数据资源时，可以使用此 API，我们固定了数据资源类型，你无需在传入 `type` 字符段，注意：`struct` 字段只能够传入字符串类型数据。
	**/
	public CreateStringDataResourceResponseDto createDataResourceByString(CreateStringDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-string-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateStringDataResourceResponseDto.class);
	}
	/**
	 * @summary 创建数组数据资源
	 * @description 当你仅需要创建数组类型数据资源时，可以使用此 API，我们固定了数据资源类型，你无需在传入 `type` 字符段，注意：`struct` 字段只能够传入数组类型数据。
	**/
	public CreateArrayDataResourceResponseDto createDataResourceByArray(CreateArrayDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-array-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateArrayDataResourceResponseDto.class);
	}
	/**
	 * @summary 创建树数据资源
	 * @description 当你仅需要创建树类型数据资源时，可以使用此 API，我们固定了数据资源类型，你无需在传入 `type` 字符段，注意：`struct` 要按照树类型数据资源结构进行传入，请参考示例。
	**/
	public CreateTreeDataResourceResponseDto createDataResourceByTree(CreateTreeDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-tree-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateTreeDataResourceResponseDto.class);
	}
	/**
	 * @summary 获取数据资源列表
	 * @description 获取数据资源列表,可通过数据资源名称、数据资源 Code 和数据资源所属权限空间 Code 列表进行指定筛选。
	**/
	public ListDataResourcesPaginatedRespDto listDataResources(ListDataResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-data-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListDataResourcesPaginatedRespDto.class);
	}
	/**
	 * @summary 获取数据资源详情
	 * @description 获取数据资源,通过数据资源 ID 查询对应的数据资源信息,包含数据资源名称、数据资源 Code、数据资源类型（TREE、STRING、ARRAY）、数据资源所属权限空间 ID、数据资源所属权限空间 Code 以及数据资源操作列表等基本信息。
	**/
	public GetDataResourceResponseDto getDataResource(GetDataResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-data-resource");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetDataResourceResponseDto.class);
	}

	/**
	 * @summary 修改数据资源
	 * @description 修改数据资源,根据权限空间 Code 和数据资源 Code 查询原始信息,只允许修改数据资源名称、描述和数据资源节点。
	**/
	public UpdateDataResourceResponseDto updateDataResource(UpdateDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateDataResourceResponseDto.class);
	}

	/**
	 * @summary 删除数据资源
	 * @description 删除数据资源,根据数据资源 ID 删除对应的数据资源信息。
	**/
	public CommonResponseDto deleteDataResource(DeleteDataResourceDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-data-resource");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}

	/**
	 * @summary 检查数据资源 Code 或者名称是否可用
	 * @description 检查数据资源名称或者 Code 在权限空间内是否有效,通过数据资源名称或者数据资源 Code 以及所属权限空间 Code,判断在指定的权限空间内是否可用。
 * 
 * ### 数据资源 Code 有效示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceCode": "test"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 0,
 * "data": {
 * "isValid": "true"
 * }
 * }
 * ```
 * 
 * ### 数据资源名称有效示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "test"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 0,
 * "data": {
 * "isValid": "true"
 * }
 * }
 * ```
 * 
 * ### 数据资源 Code 无效示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceCode": "test"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 0,
 * "requestId": "934108e5-9fbf-4d24-8da1-c330328abd6c",
 * "data": {
 * "isValid": "false",
 * "message": "data resource code already exist"
 * }
 * }
 * ```
 * 
	**/
	public CheckParamsDataResourceResponseDto checkDataResourceExists(CheckDataResourceExistsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-data-resource-exists");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CheckParamsDataResourceResponseDto.class);
	}

	/**
	 * @summary 创建数据资源扩展字段
	 */
	public IsSuccessRespDto createDnef(CreateDenfDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
		config.setUrl("/api/v3/create-dnef");
		config.setBody(reqDto);
		config.setMethod("POST");
		String response = request(config);
		return deserialize(response, IsSuccessRespDto.class);
	}

	/**
	 * @summary 批量创建数据资源扩展字段
	 */
	public IsSuccessRespDto batchCreateDnef(BatchCreateDenfDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
		config.setUrl("/api/v3/batch-create-dnef");
		config.setBody(reqDto);
		config.setMethod("POST");
		String response = request(config);
		return deserialize(response, IsSuccessRespDto.class);
	}

	/**
	 * @summary 删除数据资源扩展字段
	 */
	public IsSuccessRespDto deleteDnef(DeleteDenfDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
		config.setUrl("/api/v3/delete-dnef");
		config.setBody(reqDto);
		config.setMethod("POST");
		String response = request(config);
		return deserialize(response, IsSuccessRespDto.class);
	}

	/**
	 * @summary 修改数据资源扩展字段
	 */
	public IsSuccessRespDto updateDnef(UpdateDenfDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
		config.setUrl("/api/v3/update-dnef");
		config.setBody(reqDto);
		config.setMethod("POST");
		String response = request(config);
		return deserialize(response, IsSuccessRespDto.class);
	}

	/**
	 * @summary 获取数据资源扩展字段列表
	 */
	public GetDenfListResponseDto getDnefList(GetDenfListDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
		config.setUrl("/api/v3/list-dnef");
		config.setBody(reqDto);
		config.setMethod("GET");
		String response = request(config);
		return deserialize(response, GetDenfListResponseDto.class);
	}


	/**
	 * @summary 创建数据策略（重点）
	 * @description 
 * ## 描述
 * 该接口用于创建数据策略，通过数据策略你可以将一组数据资源及其指定的操作进行绑定到一起，共同授权给主体。
 * ## 注意
 * 为了方便使用，`permissions` 字段我们基于路径的方式提供了快捷的写法，如：
 * - 数组、字符串资源：权限空间 code/数据资源 code/数据资源某一 action（如果表示所有操作，则使用`*`替代action）
 * - 树类型资源：权限空间 code/数据资源 code/node code 1/node code 1_1/.../数据资源某一 action
 * 
 * ## 请求示例
 * 假设我们要对一名研发人员进行授权，首先创建 3 个数据资源如下：
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "服务器",
 * "resourceCode": "server_2023",
 * "type": "STRING",
 * "struct": "server_2023",
 * "actions": ["read", "write"]
 * }
 * ```
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "研发知识库",
 * "description": "",
 * "resourceCode": "rd_document",
 * "type": "STRING",
 * "struct": "https://www.authing.com/rd_document",
 * "actions": ["read", "write", "share"]
 * }
 * ```
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceName": "研发内部平台菜单",
 * "description": "这是研发使用的内部平台菜单",
 * "resourceCode": "rd_internal_platform",
 * "type": "TREE",
 * "struct": [
 * {
 * "name": "部署",
 * "code": "deploy",
 * "children": [
 * {
 * "name": "生产环境",
 * "code": "prod"
 * },
 * {
 * "name": "测试环境",
 * "code": "test"
 * }
 * ]
 * },
 * {
 * "name": "数据库",
 * "code": "db"
 * "children": [
 * {
 * "name": "查询",
 * "code": "query"
 * },
 * {
 * "name": "导出",
 * "code": "export"
 * }
 * ]
 * }
 * ],
 * "actions": ["access", "execute"]
 * }
 * ```
 * 我们分配一台服务器：server_2023 给他使用，他可以在上面进行任意操作，同时他可以阅读、编辑研发知识库，最后他可以在研发内部平台中进行部署测试环境，但是不能够导出数据库数据。
 * ```json
 * {
 * "policyName": "研发人员策略",
 * "description": "这是一个示例数据策略",
 * "statementList": [
 * {
 * "effect": "ALLOW",
 * "permissions": [
 * "examplePermissionNamespaceCode/server_2023*",
 * "examplePermissionNamespaceCode/rd_document/read",
 * "examplePermissionNamespaceCode/rd_document/write",
 * "examplePermissionNamespaceCode/rd_internal_platform/deploy/test/execute"
 * ]
 * },
 * {
 * "effect": "DENY",
 * "permissions": [
 * "examplePermissionNamespaceCode/rd_internal_platform/db/export/execute"
 * ]
 * }
 * ]
 * }
 * ```
 * 
	**/
	public CreateDataPolicyResponseDto createDataPolicy(CreateDataPolicyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-data-policy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateDataPolicyResponseDto.class);
	}
	/**
	 * @summary 获取数据策略列表
	 * @description 分页查询数据策略列表，也可通过关键字搜索数据策略名称或者数据策略 Code 进行模糊查找。
	**/
	public ListDataPoliciesPaginatedRespDto listDataPolices(ListDataPoliciesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-data-policies");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListDataPoliciesPaginatedRespDto.class);
	}
	/**
	 * @summary 获取数据策略简略信息列表
	 * @description 分页获取数据策略简略信息列表，通过关键字搜索数据策略名称或者数据策略 Code 进行模糊查找出数据策略 ID、数据策略名称和数据策略描述信息。
	**/
	public ListSimpleDataPoliciesPaginatedRespDto listSimpleDataPolices(ListSimpleDataPoliciesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-simple-data-policies");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListSimpleDataPoliciesPaginatedRespDto.class);
	}
	/**
	 * @summary 获取数据策略详情
	 * @description 获取数据策略详情，通过数据策略 ID 获取对应数据策略信息,包含数据策略 ID、数据策略名称、数据策略描述、数据策略下所有的数据权限列表等信息。
	**/
	public GetDataPolicyResponseDto getDataPolicy(GetDataPolicyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-data-policy");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetDataPolicyResponseDto.class);
	}
	/**
	 * @summary 修改数据策略
	 * @description 修改数据策略，通过数据策略名称、数据策略描述和相关的数据资源等字段修改数据策略信息。
	**/
	public UpdateDataPolicyResponseDto updateDataPolicy(UpdateDataPolicyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-data-policy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateDataPolicyResponseDto.class);
	}
	/**
	 * @summary 删除数据策略
	 * @description 删除数据策略，通过数据策略 ID 删除对应的策略,同时也删除数据策略和对应的数据资源等关系数据。
	**/
	public CommonResponseDto deleteDataPolicy(DeleteDataPolicyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-data-policy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 检查数据策略名称是否可用
	 * @description 通过数据策略名称查询用户池内是否有效。
	**/
	public CheckParamsDataPolicyResponseDto checkDataPolicyExists(CheckDataPolicyExistsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-data-policy-exists");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CheckParamsDataPolicyResponseDto.class);
	}
	/**
	 * @summary 获取数据策略授权的主体列表
	 * @description 获取数据策略授权的主体列表，通过授权主体类型、数据策略 ID 和数据资源 ID 查找授权主体列表。
	**/
	public ListDataPolicySubjectPaginatedRespDto listDataPolicyTargets(ListDataPolicyTargetsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-data-policy-targets");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListDataPolicySubjectPaginatedRespDto.class);
	}
	/**
	 * @summary 授权数据策略
	 * @description 数据策略创建主体授权，通过授权主体和数据策略进行相互授权。
	**/
	public CommonResponseDto authorizeDataPolicies(CreateAuthorizeDataPolicyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/authorize-data-policies");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 删除数据策略授权
	 * @description 删除数据策略授权，通过授权主体 ID、授权主体类型和数据策略 ID 进行删除。
	**/
	public CommonResponseDto revokeDataPolicy(DeleteAuthorizeDataPolicyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-data-policy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取用户权限列表
	 * @description 
 * ## 描述
 * 该接口用于查询某些用户在某些权限空间的数据资源的权限数据。
 * 我们的鉴权接口针对不同的鉴权场景有多种，区别在于在所处的场景下能够传递的参数列表以及不同形式的出参，**当你需要查询某些用户的所有权限时**可以使用此接口，
 * ## 注意
 * 接口提供了两个数组类型的入参`userIds`和`namespaceCodes`来支持批量查询（注意：namespaceCodes 是可选的）。
 * ## 场景举例
 * 假如你的业务场景是用户登录后能看到他所有可以访问或者进行其他操作的文档、人员信息、设备信息等资源，那么你可以在用户登录后调用此接口查询用户的所有权限。
 * ## 请求示例
 * ### 查询单个用户权限列表示例
 * 注意：在此接口的返回参数中，树类型的数据资源权限返回是按照**路径**的方式返回的
 * - 入参
 * 
 * ```json
 * {
 * "userIds": [
 * "6301ceaxxxxxxxxxxx27478"
 * ]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data": {
 * "userPermissionList": [
 * {
 * "userId": "6301ceaxxxxxxxxxxx27478",
 * "namespaceCode": "examplePermissionNamespace",
 * "resourceList": [
 * {
 * "resourceCode": "strCode",
 * "resourceType": "STRING",
 * "strAuthorize": {
 * "value": "示例字符串资源",
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * },
 * {
 * "resourceCode": "arrayCode",
 * "resourceType": "ARRAY",
 * "arrAuthorize": {
 * "values": [
 * "示例数据资源1",
 * "示例数据资源2"
 * ],
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * },
 * {
 * "resourceCode": "treeCode",
 * "resourceType": "TREE",
 * "treeAuthorize": {
 * "authList": [
 * {
 * "nodePath": "/treeChildrenCode/treeChildrenCode1",
 * "nodeActions": [
 * "read",
 * "get"
 * ],
 * "nodeName": "treeChildrenName1",
 * "nodeValue": "treeChildrenValue1"
 * },
 * {
 * "nodePath": "/treeChildrenCode/treeChildrenCode2",
 * "nodeActions": [
 * "read",
 * "get"
 * ],
 * "nodeName": "treeChildrenName2",
 * "nodeValue": "treeChildrenValue2"
 * },
 * {
 * "nodePath": "/treeChildrenCode/treeChildrenCode3",
 * "nodeActions": [
 * "read"
 * ],
 * "nodeName": "treeChildrenName3",
 * "nodeValue": "treeChildrenValue3"
 * }
 * ]
 * }
 * }
 * ]
 * }
 * ]
 * }
 * }
 * ```
 * 
 * ### 查询多个用户权限列表示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "userIds": [
 * "6301ceaxxxxxxxxxxx27478",
 * "6121ceaxxxxxxxxxxx27312"
 * ]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data": {
 * "userPermissionList": [
 * {
 * "userId": "6301ceaxxxxxxxxxxx27478",
 * "namespaceCode": "examplePermissionNamespace1",
 * "resourceList": [
 * {
 * "resourceCode": "strCode",
 * "resourceType": "STRING",
 * "strAuthorize": {
 * "value": "示例字符串资源",
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * }
 * ]
 * },
 * {
 * "userId": "6121ceaxxxxxxxxxxx27312",
 * "namespaceCode": "examplePermissionNamespace2",
 * "resourceList": [
 * {
 * "resourceCode": "arrayCode",
 * "resourceType": "ARRAY",
 * "arrAuthorize": {
 * "values": [
 * "示例数组资源1",
 * "示例数组资源2"
 * ],
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * }
 * ]
 * }
 * ]
 * }
 * }
 * ```
 * 
 * ### 查询多个用户在多个权限空间下权限列表示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "userIds": [
 * "6301ceaxxxxxxxxxxx27478",
 * "6121ceaxxxxxxxxxxx27312"
 * ],
 * "namespaceCodes": [
 * "examplePermissionNamespace1",
 * "examplePermissionNamespace2"
 * ]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data": {
 * "userPermissionList": [
 * {
 * "userId": "6301ceaxxxxxxxxxxx27478",
 * "namespaceCode": "examplePermissionNamespace1",
 * "resourceList": [
 * {
 * "resourceCode": "strCode1",
 * "resourceType": "STRING",
 * "strAuthorize": {
 * "value": "示例字符串资源",
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * }
 * ]
 * },
 * {
 * "userId": "6121ceaxxxxxxxxxxx27312",
 * "namespaceCode": "examplePermissionNamespace2",
 * "resourceList": [
 * {
 * "resourceCode": "arrayCode",
 * "resourceType": "ARRAY",
 * "arrAuthorize": {
 * "values": [
 * "示例数组资源1",
 * "示例数组资源2"
 * ],
 * "actions": [
 * "read",
 * "post",
 * "get",
 * "write"
 * ]
 * }
 * }
 * ]
 * }
 * ]
 * }
 * }
 * ```
 * 
	**/
	public GetUserPermissionListRespDto getUserPermissionList(GetUserPermissionListDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-permission-list");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetUserPermissionListRespDto.class);
	}
	/**
	 * @summary 判断用户权限（重点）
	 * @description 
 * ## 描述
 * 当你需要判断用户是否拥有某些资源的指定权限时可以使用此接口
 * ## 注意
 * - 该接口通过传递资源 code 定位对应的数据资源（如果是树类型，则需要传递节点的完整 code 路径）。
 * - 如果你在配置数据策略时配置了**环境属性**的条件判断，那么需要设置参数`judgeConditionEnabled`为`true`（默认为 false），并且通过参数`authEnvParams`传递请求时所处的环境信息（如 IP、设备类型、系统类型等），否则条件判断会不生效，导致数据策略不生效。
 * 
 * ## 场景举例
 * 用户在删除某条数据时，需要判断他是否拥有此资源的删除权限，则可以使用此接口。
 * 
 * ## 请求示例
 * ### 判断用户对字符串和数组资源权限示例（无条件判断）
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "action": "get",
 * "resources":["strResourceCode1", "arrayResourceCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data": {
 * "checkResultList": [
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resource": "strResourceCode1",
 * "action": "get",
 * "enabled": true
 * },
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resource": "arrayResourceCode1",
 * "action": "get",
 * "enabled": true
 * }
 * ]
 * }
 * }
 * ```
 * 
 * ### 判断用户对字符串和数组资源权限示例（开启条件判断）
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "action": "get",
 * "resources": ["strResourceCode1", "arrayResourceCode1"],
 * "judgeConditionEnabled": true,
 * "authEnvParams":{
 * "ip":"110.96.0.0",
 * "city":"北京",
 * "province":"北京",
 * "country":"中国",
 * "deviceType":"PC",
 * "systemType":"ios",
 * "browserType":"IE",
 * "requestDate":"2022-12-26 17:40:00"
 * }
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data": {
 * "checkResultList": [
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resource": "strResourceCode1",
 * "action": "get",
 * "enabled": false
 * },
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "resource": "arrayResourceCode1",
 * "action": "get",
 * "enabled": false
 * }
 * ]
 * }
 * }
 * ```
 * 
 * ### 判断用户对树资源权限示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "action": "get",
 * "resources":["treeResourceCode1/StructCode1/resourceStructChildrenCode1", "treeResourceCode2/StructCode1/resourceStructChildrenCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "checkResultList": [{
 * "namespaceCode": "examplePermissionNamespace",
 * "action": "get",
 * "resource": "treeResourceCode1/StructCode1/resourceStructChildrenCode1",
 * "enabled": true
 * },{
 * "namespaceCode": "examplePermissionNamespace",
 * "action": "get",
 * "resource": "treeResourceCode2/StructCode1/resourceStructChildrenCode1",
 * "enabled": true
 * }]
 * }
 * }
 * ```
 * 
	**/
	public CheckPermissionRespDto checkPermission(CheckPermissionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-permission");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckPermissionRespDto.class);
	}
	/**
	 * @summary 判断外部用户权限
	 * @description 
 * ## 描述
 * 当你的用户是外部用户，需要判断其是否拥有某资源的某一权限时，可以使用此接口，通过`externalId`来传递用户的 ID
 * 
	**/
	public CheckExternalUserPermissionRespDto checkExternalUserPermission(CheckExternalUserPermissionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-external-user-permission");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckExternalUserPermissionRespDto.class);
	}
	/**
	 * @summary 获取用户拥有某些资源的权限列表（推荐）
	 * @description 
 * ## 描述
 * 当你需要查询某一用户拥有指定的资源列表的权限时，可以使用此接口。
 * ## 注意
 * 该接口需要你传递指定的资源 code（如果是树类型资源则需要传递节点的完整 code 路径），此接口性能更佳，推荐使用。
 * ## 请求示例
 * ### 获取用户字符串和数组资源权限示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "resources":["strResourceCode1", "arrayResourceCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * 
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "permissionList": [{
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["read","get"],
 * "resource": "strResourceCode1"
 * },{
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["read","update","delete"],
 * "resource": "arrayResourceCode1"
 * }]
 * }
 * }
 * ```
 * 
 * ### 获取用户树资源权限示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "resources":["treeResourceCode1/StructCode1/resourceStructChildrenCode1", "treeResourceCode2/StructCode1/resourceStructChildrenCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "permissionList": [{
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["read", "update", "delete"],
 * "resource": "treeResourceCode1/StructCode1/resourceStructChildrenCode1"
 * },{
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["read", "get", "delete"],
 * "resource": "treeResourceCode2/StructCode1/resourceStructChildrenCode1"
 * }]
 * }
 * }
 * ```
 * 
	**/
	public GetUserResourcePermissionListRespDto getUserResourcePermissionList(GetUserResourcePermissionListDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-resource-permission-list");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetUserResourcePermissionListRespDto.class);
	}
	/**
	 * @summary 获取拥有某些资源权限的用户列表
	 * @description 
 * ## 描述
 * 当你需要获取拥有指定资源的权限的用户时，可以使用此接口。
 * ## 场景举例
 * 假如你的业务场景是：想看看当前文档能够编辑的用户列表，那么你可以使用此接口。
 * ## 请求示例
 * ### 获取字符串和数组资源被授权的用户列表示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["get", "update", "read"],
 * "resources":["strResourceCode1", "arrayResourceCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "authUserList": [{
 * "resource": "strResourceCode1",
 * "actionAuthList": [{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "get"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "update"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "read"
 * }]
 * },{
 * "resource": "arrayResourceCode1",
 * "actionAuthList": [{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "get"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "update"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "read"
 * }]
 * }]
 * }
 * }
 * ```
 * 
 * ### 获取树资源被授权的用户列表示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "actions": ["get", "update", "delete"],
 * "resources":["treeResourceCode1/StructCode1/resourceStructChildrenCode1", "treeResourceCode2/StructCode1/resourceStructChildrenCode1"]
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "authUserList": [{
 * "resource": "treeResourceCode1/StructCode1/resourceStructChildrenCode1",
 * "actionAuthList": [{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "get"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "update"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "delete"
 * }]
 * },{
 * "resource": "treeResourceCode2/StructCode1/resourceStructChildrenCode1",
 * "actionAuthList": [{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "get"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "update"
 * },{
 * "userIds": ["63721xxxxxxxxxxxxdde14a3"],
 * "action": "delete"
 * }]
 * }]
 * }
 * }
 * ```
 * 
	**/
	public ListResourceTargetsRespDto listResourceTargets(ListResourceTargetsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-resource-targets");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListResourceTargetsRespDto.class);
	}
	/**
	 * @summary 获取用户拥有指定资源的权限及资源结构信息
	 * @description 
 * ## 描述
 * 当你需要获取用户拥有某一资源的权限并且需要这个资源的结构信息（树类型资源返回树结构，数组类型资源返回数组、字符串类型返回字符串）则可以使用此接口。
 * ## 注意
 * 由于其他接口对树类型资源的返回参数格式是按照路径的方式返回的，所以我们提供此此接口，按照完整的树结构形式返回。
 * ## 请求示例
 * ### 获取用户授权字符串数据资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleStrResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleStrResourceCode",
 * "resourceType": "STRING",
 * "strResourceAuthAction":{
 * "value": "strTestValue",
 * "actions": ["get","delete"]
 * }
 * }
 * }
 * ```
 * 
 * 
 * ### 获取用户授权数据数组资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleArrResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleArrResourceCode",
 * "resourceType": "ARRAY",
 * "arrResourceAuthAction":{
 * "values": ["arrTestValue1","arrTestValue2","arrTestValue3"],
 * "actions": ["get","delete"]
 * }
 * }
 * }
 * ```
 * 
 * 
 * ### 获取用户授权树数据资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleTreeResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleArrResourceCode",
 * "resourceType": "TREE",
 * "treeResourceAuthAction":{
 * "nodeAuthActionList":[{
 * "code": "tree11",
 * "name": "tree11",
 * "value": "test11Value",
 * "actions": ["get","delete"],
 * "children": [{
 * "code": "tree111",
 * "name": "tree111",
 * "value": "test111Value",
 * "actions": ["update","read"],
 * }]
 * },{
 * "code": "tree22",
 * "name": "tree22",
 * "value": "test22Value",
 * "actions": ["get","delete"]
 * }]
 * }
 * }
 * }
 * ```
 * 
	**/
	public GetUserResourceStructRespDto getUserResourceStruct(GetUserResourceStructDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-resource-struct");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetUserResourceStructRespDto.class);
	}
	/**
	 * @summary 获取外部用户拥有指定资源的权限及资源结构信息
	 * @description 
 * ## 描述
 * 当你需要获取外部用户（通过参数`externalId`参数传递外部用户 ID）拥有某一资源的权限并且需要这个资源的结构信息（树类型资源返回树结构，数组类型资源返回数组、字符串类型返回字符串）则可以使用此接口。
 * ## 请求示例
 * ### 获取用户授权字符串数据资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "externalId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleStrResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleStrResourceCode",
 * "resourceType": "STRING",
 * "strResourceAuthAction":{
 * "value": "strTestValue",
 * "actions": ["get","delete"]
 * }
 * }
 * }
 * ```
 * 
 * 
 * ### 获取用户授权数据数组资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "externalId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleArrResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleArrResourceCode",
 * "resourceType": "ARRAY",
 * "arrResourceAuthAction":{
 * "values": ["arrTestValue1","arrTestValue2","arrTestValue3"],
 * "actions": ["get","delete"]
 * }
 * }
 * }
 * ```
 * 
 * 
 * ### 获取用户授权树数据资源示例
 * 
 * - 入参
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "externalId": "63721xxxxxxxxxxxxdde14a3",
 * "resourceCode": "exampleTreeResourceCode"
 * }
 * ```
 * 
 * - 出参
 * 
 * ```json
 * {
 * "statusCode": 200,
 * "message": "操作成功",
 * "apiCode": 20001,
 * "data":{
 * "namespaceCode": "exampleNamespaceCode",
 * "resourceCode": "exampleArrResourceCode",
 * "resourceType": "TREE",
 * "treeResourceAuthAction":{
 * "nodeAuthActionList":[{
 * "code": "tree11",
 * "name": "tree11",
 * "value": "test11Value",
 * "actions": ["get","delete"],
 * "children": [{
 * "code": "tree111",
 * "name": "tree111",
 * "value": "test111Value",
 * "actions": ["update","read"],
 * }]
 * },{
 * "code": "tree22",
 * "name": "tree22",
 * "value": "test22Value",
 * "actions": ["get","delete"]
 * }]
 * }
 * }
 * }
 * ```
 * 
	**/
	public GetExternalUserResourceStructRespDto getExternalUserResourceStruct(GetExternalUserResourceStructDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-external-user-resource-struct");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetExternalUserResourceStructRespDto.class);
	}
	/**
	 * @summary 判断用户在树资源同层级下的权限（推荐）
	 * @description 
 * ## 描述
 * 此接口用于判断用户是否拥有某一树资源的**同层级下**部分的节点的某种权限。由于树类型资源比较常用，所以我们基于“判断用户是否拥有资源权限”的业务场景，新增了针对判断树这种类型资源节点权限的接口。
 * ## 注意
 * 我们通过`resource`参数定位到树类型数据资源的某一层级（所以该参数是按照`资源 code/节点 code 路径`格式进行传递的），并通过`resourceNodeCodes`参数定位到是当前曾经的哪些节点。
 * ## 场景举例
 * 假如你的业务场景是：当在一个文件系统中，用户在删除某一文件夹下某些文件，需要判断他是否拥有这些文件的删除权限，则可以使用此接口。
 * ## 请求示例
 * ### 判断用户在树资源同层级权限示例（无条件判断）
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "action": "read",
 * "resource": "treeResourceCode/structCode",
 * "resourceNodeCodes": ["resourceStructChildrenCode1","resourceStructChildrenCode2","resourceStructChildrenCode3"]
 * }
 * ```
 * 
 * ### 判断用户在树资源同层级权限示例（开启条件判断）
 * 
 * ```json
 * {
 * "namespaceCode": "examplePermissionNamespace",
 * "userId": "63721xxxxxxxxxxxxdde14a3",
 * "action": "read",
 * "resource": "treeResourceCode/structCode",
 * "resourceNodeCodes": ["resourceStructChildrenCode1","resourceStructChildrenCode2","resourceStructChildrenCode3"],
 * "judgeConditionEnabled": true,
 * "authEnvParams":{
 * "ip":"110.96.0.0",
 * "city":"北京",
 * "province":"北京",
 * "country":"中国",
 * "deviceType":"PC",
 * "systemType":"ios",
 * "browserType":"IE",
 * "requestDate":"2022-12-26 17:40:00"
 * }
 * }
 * ```
 * 
	**/
	public CheckUserSameLevelPermissionResponseDto checkUserSameLevelPermission(CheckUserSameLevelPermissionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-user-same-level-permission");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckUserSameLevelPermissionResponseDto.class);
	}
	/**
	 * @summary 获取权限视图数据列表
	 * @description 
 * ## 描述
 * 此接口用于导出菜单：权限管理 -> 数据权限 -> 权限试图列表数据，如果你需要拉取我们数据权限的授权数据（所有用户拥有的所有资源的所有权限），则可以使用此接口。
 * 
	**/
	public ListPermissionViewResponseDto listPermissionView(ListPermissionViewDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-permission-view/data");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListPermissionViewResponseDto.class);
	}
	/**
	 * @summary 获取套餐详情
	 * @description 获取当前用户池套餐详情。
	**/
	public CostGetCurrentPackageRespDto getCurrentPackageInfo() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-current-package-info");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetCurrentPackageRespDto.class);
	}
	/**
	 * @summary 获取用量详情
	 * @description 获取当前用户池用量详情。
	**/
	public CostGetCurrentUsageRespDto getUsageInfo() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-usage-info");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetCurrentUsageRespDto.class);
	}
	/**
	 * @summary 获取 MAU 使用记录
	 * @description 获取当前用户池 MAU 使用记录
	**/
	public CostGetMauPeriodUsageHistoryRespDto getMauPeriodUsageHistory(GetMauPeriodUsageHistoryDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-mau-period-usage-history");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetMauPeriodUsageHistoryRespDto.class);
	}
	/**
	 * @summary 获取所有权益
	 * @description 获取当前用户池所有权益
	**/
	public CostGetAllRightItemRespDto getAllRightsItem() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-all-rights-items");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetAllRightItemRespDto.class);
	}
	/**
	 * @summary 获取订单列表
	 * @description 获取当前用户池订单列表
	**/
	public CostGetOrdersRespDto getOrders(GetOrdersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-orders");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetOrdersRespDto.class);
	}
	/**
	 * @summary 获取订单详情
	 * @description 获取当前用户池订单详情
	**/
	public CostGetOrderDetailRespDto getOrderDetail(GetOrderDetailDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-order-detail");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetOrderDetailRespDto.class);
	}
	/**
	 * @summary 获取订单支付明细
	 * @description 获取当前用户池订单支付明细
	**/
	public CostGetOrderPayDetailRespDto getOrderPayDetail(GetOrderPayDetailDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-order-pay-detail");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CostGetOrderPayDetailRespDto.class);
	}
	/**
	 * @summary 创建自定义事件应用
	 * @description 创建自定义事件应用
	**/
	public CommonResponseDto createEventApp(CreateEventAppDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-event-app");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取事件应用列表
	 * @description 获取事件应用列表
	**/
	public EventAppPaginatedRespDto listEventApps() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-event-apps");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, EventAppPaginatedRespDto.class);
	}
	/**
	 * @summary 获取事件列表
	 * @description 获取 Authing 服务支持的所有事件列表
	**/
	public OpenEventPaginatedRespDto listEvents(ListEventsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-events");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OpenEventPaginatedRespDto.class);
	}
	/**
	 * @summary 定义自定义事件
	 * @description 在 Authing 事件中心定义自定义事件
	**/
	public CommonResponseDto defineEvent(DefineEventDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/define-event");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 推送自定义事件
	 * @description 向 Authing 事件中心推送自定义事件
	**/
	public PubEventRespDto verifyEvent(PubEventDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/pub-event");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PubEventRespDto.class);
	}
	/**
	 * @summary 认证端推送自定义事件
	 * @description 认证端向 Authing 事件中心推送自定义事件
	**/
	public PubEventRespDto pubUserEvent(PubEventDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/pub-userEvent");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PubEventRespDto.class);
	}
	/**
	 * @summary 创建注册白名单
	 * @description 你需要指定注册白名单类型以及数据，来进行创建
	**/
	public WhitelistListRespDto addWhitelist(AddWhitelistDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-whitelist");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, WhitelistListRespDto.class);
	}
	/**
	 * @summary 获取注册白名单列表
	 * @description 获取注册白名单列表，可选页数、分页大小来获取
	**/
	public WhitelistListRespDto listWhitelists(ListWhitelistDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-whitelist");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, WhitelistListRespDto.class);
	}
	/**
	 * @summary 删除注册白名单
	 * @description 通过指定多个注册白名单数据,以数组的形式进行注册白名单的删除
	**/
	public IsSuccessDto deleteWhitelist(DeleteWhitelistDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-whitelist");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessDto.class);
	}
	/**
	 * @summary 获取 ip 列表
	 * @description 分页获取 ip 列表
	**/
	public IpListPaginatedRespDto findIpList(IpListDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/ip-list");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IpListPaginatedRespDto.class);
	}
	/**
	 * @summary 创建 ip 名单
	 * @description 创建 ip 名单
	**/
	public CommonResponseDto add(IpListCreateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/ip-list");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 删除 ip 名单
	 * @description 删除 ip 名单
	**/
	/**
	 * @summary 获取用户列表
	 * @description 分页获取用户列表
	**/
	public UserListPaginatedRespDto findUserList(UserListDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/user-list");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserListPaginatedRespDto.class);
	}
	/**
	 * @summary 创建用户名单
	 * @description 创建用户名单
	**/
	public CommonResponseDto addUser(UserListCreateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/user-list");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 删除用户名单
	 * @description 删除用户 名单
	**/
	/**
	 * @summary 获取风险策略列表
	 * @description 分页获取风险策略列表
	**/
	public UserListPolicyPaginatedRespDto findRiskListPolicy(RiskListPolicyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/risk-list-policy");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserListPolicyPaginatedRespDto.class);
	}
	/**
	 * @summary 创建风险策略
	 * @description 创建风险策略
	**/
	public CommonResponseDto addRiskListPolicy(RiskListPolicyCreateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/risk-list-policy");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 删除风险策略
	 * @description 删除风险策略
	**/
	/**
	 * @summary 新增设备
	 * @description 创建新设备。
	**/
	public TerminalInfoRespDto createDevice(CreateTerminalDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-device");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TerminalInfoRespDto.class);
	}
	/**
	 * @summary 最近登录应用
	 * @description 根据设备唯一标识获取最近登录的应用列表。
	**/
	public CommonResponseDto findLastLoginAppsByDeviceIds(QueryTerminalAppsDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-last-login-apps-by-deviceIds");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 新增 verify 设备
	 * @description 创建 verify 新设备。
	**/
	public TerminalInfoRespDto createVerifyDevice(CreateTerminalDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/authing-verify/create-device");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TerminalInfoRespDto.class);
	}
	/**
	 * @summary 创建 Pipeline 函数
	 * @description 创建 Pipeline 函数
	**/
	public PipelineFunctionSingleRespDto createPipelineFunction(CreatePipelineFunctionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-pipeline-function");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
	}
	/**
	 * @summary 获取 Pipeline 函数详情
	 * @description 获取 Pipeline 函数详情
	**/
	public PipelineFunctionSingleRespDto getPipelineFunction(GetPipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
	}
	/**
	 * @summary 重新上传 Pipeline 函数
	 * @description 当 Pipeline 函数上传失败时，重新上传 Pipeline 函数
	**/
	public PipelineFunctionSingleRespDto reuploadPipelineFunction(ReUploadPipelineFunctionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/reupload-pipeline-function");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
	}
	/**
	 * @summary 修改 Pipeline 函数
	 * @description 修改 Pipeline 函数
	**/
	public PipelineFunctionSingleRespDto updatePipelineFunction(UpdatePipelineFunctionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-pipeline-function");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
	}
	/**
	 * @summary 修改 Pipeline 函数顺序
	 * @description 修改 Pipeline 函数顺序
	**/
	public CommonResponseDto updatePipelineOrder(UpdatePipelineOrderDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-pipeline-order");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 删除 Pipeline 函数
	 * @description 删除 Pipeline 函数
	**/
	public CommonResponseDto deletePipelineFunction(DeletePipelineFunctionDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-pipeline-function");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 获取 Pipeline 函数列表
	 * @description 获取 Pipeline 函数列表
	**/
	public PipelineFunctionPaginatedRespDto listPipelineFunctions(ListPipelineFunctionsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-pipeline-functions");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionPaginatedRespDto.class);
	}
	/**
	 * @summary 获取 Pipeline 日志
	 * @description 获取 Pipeline 
	**/
	public PipelineFunctionPaginatedRespDto getPipelineLogs(GetPipelineLogsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-pipeline-logs");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionPaginatedRespDto.class);
	}
	/**
	 * @summary 创建 Webhook
	 * @description 你需要指定 Webhook 名称、Webhook 回调地址、请求数据格式、用户真实名称来创建 Webhook。还可选是否启用、请求密钥进行创建
	**/
	public CreateWebhookRespDto createWebhook(CreateWebhookDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-webhook");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateWebhookRespDto.class);
	}
	/**
	 * @summary 获取 Webhook 列表
	 * @description 获取 Webhook 列表，可选页数、分页大小来获取
	**/
	public GetWebhooksRespDto listWebhooks(ListWebhooksDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-webhooks");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetWebhooksRespDto.class);
	}
	/**
	 * @summary 修改 Webhook 配置
	 * @description 需要指定 webhookId，可选 Webhook 名称、Webhook 回调地址、请求数据格式、用户真实名称、是否启用、请求密钥参数进行修改 webhook
	**/
	public UpdateWebhooksRespDto updateWebhook(UpdateWebhookDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-webhook");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateWebhooksRespDto.class);
	}
	/**
	 * @summary 删除 Webhook
	 * @description 通过指定多个 webhookId,以数组的形式进行 webhook 的删除,如果 webhookId 不存在,不提示报错
	**/
	public DeleteWebhookRespDto deleteWebhook(DeleteWebhookDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-webhook");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DeleteWebhookRespDto.class);
	}
	/**
	 * @summary 获取 Webhook 日志
	 * @description 通过指定 webhookId，可选 page 和 limit 来获取 webhook 日志,如果 webhookId 不存在,不返回报错信息
	**/
	public ListWebhookLogsRespDto getWebhookLogs(ListWebhookLogs reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook-logs");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListWebhookLogsRespDto.class);
	}
	/**
	 * @summary 手动触发 Webhook 执行
	 * @description 通过指定 webhookId，可选请求头和请求体进行手动触发 webhook 执行
	**/
	public TriggerWebhookRespDto triggerWebhook(TriggerWebhookDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/trigger-webhook");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TriggerWebhookRespDto.class);
	}
	/**
	 * @summary 获取 Webhook 详情
	 * @description 根据指定的 webhookId 获取 webhook 详情
	**/
	public GetWebhookRespDto getWebhook(GetWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetWebhookRespDto.class);
	}
	/**
	 * @summary 获取 Webhook 事件列表
	 * @description 返回事件列表和分类列表
	**/
	public WebhookEventListRespDto getWebhookEventList() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook-event-list");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, WebhookEventListRespDto.class);
	}
	/**
	 * @summary 生成 LDAP Server 管理员密码
	 * @description 生成 LDAP Server 管理员密码
	**/
	public LdapGetBindPwdRespDto getBindPwd() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ldap-server-random-pwd");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, LdapGetBindPwdRespDto.class);
	}
	/**
	 * @summary 获取 LDAP server 配置信息
	 * @description 获取 LDAP server 配置信息
	**/
	public LdapConfigInfoRespDto queryLdapConfigInfo() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ldap-server-config");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, LdapConfigInfoRespDto.class);
	}
	/**
	 * @summary 更新 LDAP server 配置信息
	 * @description 更新 LDAP server 配置信息
	**/
	public LdapOperateRespDto updateLdapConfigInfo(LdapUpdateDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ldap-server-config");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, LdapOperateRespDto.class);
	}
	/**
	 * @summary 初始化/重启 LDAP server
	 * @description 初始化/重启 LDAP server
	**/
	public LdapOperateRespDto saveLdapConfigInfo(LdapSaveDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/enable-ldap-server");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, LdapOperateRespDto.class);
	}
	/**
	 * @summary 关闭 LDAP server 服务，关闭前必须先初始化
	 * @description 关闭 LDAP server 服务，关闭前必须先初始化
	**/
	public LdapOperateRespDto disableLdapServer(LdapSetEnabledFlagDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/disable-ldap-server");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, LdapOperateRespDto.class);
	}
	/**
	 * @summary LDAP server 日志查询
	 * @description LDAP server 日志查询
	**/
	public LdapLogRespDto queryLdapLog(GetLdapServerLogDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ldap-server-log");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, LdapLogRespDto.class);
	}
	/**
	 * @summary LDAP server 根据 DN 查询下一级
	 * @description LDAP server 根据 DN 查询下一级
	**/
	public LdapLogRespDto queryLdapSubEntries(GetLdapSubEntriesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ldap-sub-entries");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, LdapLogRespDto.class);
	}
	/**
	 * @summary 获取协作管理员 AK/SK 列表
	 * @description 根据协作管理员 Id 获取协作管理员下所有的 AK/SK 列表
	**/
	public ListAccessKeyResponseDto getAccessKeyList(ListAccessKeyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-access-key");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListAccessKeyResponseDto.class);
	}
	/**
	 * @summary 获取协作管理员 AK/SK 详细信息
	 * @description 获取协作管理员 AK/SK 详细信息,根据协作管理员 ID 和 accessKeyId 获取对应 AK/SK 的详细信息。
	**/
	public GetAccessKeyResponseDto getAccessKey(GetAccessKeyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-access-key");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetAccessKeyResponseDto.class);
	}
	/**
	 * @summary 创建协作管理员的 AK/SK
	 * @description 创建协作管理员的 AK/SK,根据协作管理员 ID 生成指定的 AK/SK。
	**/
	public CreateAccessKeyResponseDto createAccessKey(CreateAccessKeyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-access-key");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateAccessKeyResponseDto.class);
	}
	/**
	 * @summary 删除协作管理员的 AK/SK
	 * @description 删除协作管理员的 AK/SK,根据所选择的 AK/SK 的 accessKeyId 进行指定删除。
	**/
	public CommonResponseDto deleteAccessKey(DeleteAccessKeyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-access-key");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
	}
	/**
	 * @summary 更新一个管理员 AccessKey
	 * @description 根据 AccessKeyId 更新一个管理员 AccessKey，目前只支持更新 status，status 支持 activated / revoked
	**/
	public IsSuccessRespDto updateAccessKey(UpdateAccessKeyDto reqDto) {
		AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-access-key");
		config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
	}
	/**
	 * @summary 获取 verify-config-app 列表
	 * @description 获取 verify-config-app 列表
	**/
	public ApplicationDto getVerifyConfigApp(VerifyConfigAppDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/verify-config-app");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationDto.class);
	}

        @Override
    public void subEvent(String eventCode, Receiver receiver) {
        if (StrUtil.isBlank(eventCode)) {
            throw new IllegalArgumentException("eventCode is required");
        }
        if (receiver == null) {
            throw new IllegalArgumentException("receiver is required");
        }
        ManagementClientOptions options = (ManagementClientOptions) this.options;
        String eventUri = options.getWebsocketHost()+options.getWebsocketEndpoint()+"?code="+eventCode;
        URI wssUri = null;
        try {
            wssUri = new URI(eventUri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        // System.out.println("eventUri:"+eventUri);
        SignatureComposer signatureComposer = new SignatureComposer();
        HashMap<String,String> query = new HashMap<String, String>();
        String signa = signatureComposer.composeStringToSign("websocket","",query,query);
        // String signa = signatureComposer.composeStringToSign("websocket",eventUri,query,query); // server 端验证不用传 uri
        // System.out.println("signa:"+signa);
        String authorization = signatureComposer.getAuthorization(options.getAccessKeyId(),options.getAccessKeySecret(),signa);
        // System.out.println(authorization);
        HashMap<String,String> headers = new HashMap();
        headers.put("Authorization",authorization);
        AuthingWebsocketClient client = new AuthingWebsocketClient(wssUri,headers,receiver);
        client.connect();
    }

    public CostGetAllRightItemRespDto pubtEvent(String eventCode,Object data){
        Assert.notNull(eventCode);
        Assert.notNull(data);
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/pub-event");
        config.setBody(new EventDto(eventCode,data));
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CostGetAllRightItemRespDto.class);
    }
}