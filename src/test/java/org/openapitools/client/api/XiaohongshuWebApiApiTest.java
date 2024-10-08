/*
 * Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 * High-performance asynchronous Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.HttpValidationError;
import org.openapitools.client.model.ResponseModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XiaohongshuWebApiApi
 */
@Ignore
public class XiaohongshuWebApiApiTest {

    private final XiaohongshuWebApiApi api = new XiaohongshuWebApiApi();

    
    /**
     * 获取笔记评论回复/Get note comment replies
     *
     * # [中文] ### 用途: - 获取笔记评论回复 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - comment_id: 评论ID - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论回复列表  # [English] ### Purpose: - Get note comment replies ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - comment_id: Comment ID - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comment replies list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; comment_id&#x3D;\&quot;6683ec5b000000000303b91a\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGetTest() throws ApiException {
        String noteId = null;
        String commentId = null;
        String lastCursor = null;
        ResponseModel response = api.getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet(noteId, commentId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 获取笔记评论回复/Get note comment replies
     *
     * # [中文] ### 用途: - 获取笔记评论回复 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - comment_id: 评论ID - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论回复列表  # [English] ### Purpose: - Get note comment replies ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - comment_id: Comment ID - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comment replies list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; comment_id&#x3D;\&quot;6683ec5b000000000303b91a\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0Test() throws ApiException {
        String noteId = null;
        String commentId = null;
        String lastCursor = null;
        ResponseModel response = api.getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0(noteId, commentId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 获取笔记评论/Get note comments
     *
     * # [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论列表  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comments list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGetTest() throws ApiException {
        String noteId = null;
        String lastCursor = null;
        ResponseModel response = api.getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet(noteId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 获取笔记评论/Get note comments
     *
     * # [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论列表  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comments list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0Test() throws ApiException {
        String noteId = null;
        String lastCursor = null;
        ResponseModel response = api.getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0(noteId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 获取笔记信息/Get note info
     *
     * # [中文] ### 用途: - 获取笔记信息V1 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V1 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGetTest() throws ApiException {
        String noteId = null;
        ResponseModel response = api.getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet(noteId);

        // TODO: test validations
    }
    
    /**
     * 获取笔记信息/Get note info
     *
     * # [中文] ### 用途: - 获取笔记信息V1 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V1 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0Test() throws ApiException {
        String noteId = null;
        ResponseModel response = api.getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0(noteId);

        // TODO: test validations
    }
    
    /**
     * 获取笔记信息/Get note info
     *
     * # [中文] ### 用途: - 获取笔记信息V2 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V2 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2GetTest() throws ApiException {
        String noteId = null;
        ResponseModel response = api.getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get(noteId);

        // TODO: test validations
    }
    
    /**
     * 获取笔记信息/Get note info
     *
     * # [中文] ### 用途: - 获取笔记信息V2 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V2 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0Test() throws ApiException {
        String noteId = null;
        ResponseModel response = api.getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0(noteId);

        // TODO: test validations
    }
    
    /**
     * 获取用户信息/Get user info
     *
     * # [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - User info  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserInfoApiV1XiaohongshuWebGetUserInfoGetTest() throws ApiException {
        String userId = null;
        ResponseModel response = api.getUserInfoApiV1XiaohongshuWebGetUserInfoGet(userId);

        // TODO: test validations
    }
    
    /**
     * 获取用户信息/Get user info
     *
     * # [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - User info  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0Test() throws ApiException {
        String userId = null;
        ResponseModel response = api.getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0(userId);

        // TODO: test validations
    }
    
    /**
     * 获取用户的笔记/Get user notes
     *
     * # [中文] ### 用途: - 获取用户的笔记 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的最后一个NoteID     - 例如: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### 返回: - 用户的笔记列表  # [English] ### Purpose: - Get user notes ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the last NoteID returned in the last response for subsequent requests     - Example: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### Return: - User notes list  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserNotesApiV1XiaohongshuWebGetUserNotesGetTest() throws ApiException {
        String userId = null;
        String lastCursor = null;
        ResponseModel response = api.getUserNotesApiV1XiaohongshuWebGetUserNotesGet(userId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 获取用户的笔记/Get user notes
     *
     * # [中文] ### 用途: - 获取用户的笔记 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的最后一个NoteID     - 例如: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### 返回: - 用户的笔记列表  # [English] ### Purpose: - Get user notes ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the last NoteID returned in the last response for subsequent requests     - Example: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### Return: - User notes list  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot; lastCursor&#x3D;None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0Test() throws ApiException {
        String userId = null;
        String lastCursor = null;
        ResponseModel response = api.getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0(userId, lastCursor);

        // TODO: test validations
    }
    
    /**
     * 搜索笔记/Search notes
     *
     * # [中文] ### 用途: - 搜索笔记 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 - sort: 排序方式     - 综合排序（默认参数）: general     - 最热排序: popularity_descending     - 最新排序: time_descending - noteType: 笔记类型     - 综合笔记（默认参数）: _0     - 视频笔记: _1     - 图文笔记: _2 ### 返回: - 笔记列表  # [English] ### Purpose: - Search notes ### Parameters: - keyword: Keyword - page: Page, default is 1 - sort: Sort     - General sort (default): general     - Popularity sort: popularity_descending     - Latest sort: time_descending - noteType: Note type     - General note (default): _0     - Video note: _1     - Image note: _2 ### Return: - Note list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1 sort&#x3D;\&quot;general\&quot; noteType&#x3D;\&quot;_0\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchNotesApiV1XiaohongshuWebSearchNotesGetTest() throws ApiException {
        String keyword = null;
        Integer page = null;
        String sort = null;
        String noteType = null;
        ResponseModel response = api.searchNotesApiV1XiaohongshuWebSearchNotesGet(keyword, page, sort, noteType);

        // TODO: test validations
    }
    
    /**
     * 搜索笔记/Search notes
     *
     * # [中文] ### 用途: - 搜索笔记 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 - sort: 排序方式     - 综合排序（默认参数）: general     - 最热排序: popularity_descending     - 最新排序: time_descending - noteType: 笔记类型     - 综合笔记（默认参数）: _0     - 视频笔记: _1     - 图文笔记: _2 ### 返回: - 笔记列表  # [English] ### Purpose: - Search notes ### Parameters: - keyword: Keyword - page: Page, default is 1 - sort: Sort     - General sort (default): general     - Popularity sort: popularity_descending     - Latest sort: time_descending - noteType: Note type     - General note (default): _0     - Video note: _1     - Image note: _2 ### Return: - Note list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1 sort&#x3D;\&quot;general\&quot; noteType&#x3D;\&quot;_0\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchNotesApiV1XiaohongshuWebSearchNotesGet_0Test() throws ApiException {
        String keyword = null;
        Integer page = null;
        String sort = null;
        String noteType = null;
        ResponseModel response = api.searchNotesApiV1XiaohongshuWebSearchNotesGet_0(keyword, page, sort, noteType);

        // TODO: test validations
    }
    
    /**
     * 搜索用户/Search users
     *
     * # [中文] ### 用途: - 搜索用户 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 ### 返回: - 用户列表  # [English] ### Purpose: - Search users ### Parameters: - keyword: Keyword - page: Page, default is 1 ### Return: - User list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchUsersApiV1XiaohongshuWebSearchUsersGetTest() throws ApiException {
        String keyword = null;
        Integer page = null;
        ResponseModel response = api.searchUsersApiV1XiaohongshuWebSearchUsersGet(keyword, page);

        // TODO: test validations
    }
    
    /**
     * 搜索用户/Search users
     *
     * # [中文] ### 用途: - 搜索用户 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 ### 返回: - 用户列表  # [English] ### Purpose: - Search users ### Parameters: - keyword: Keyword - page: Page, default is 1 ### Return: - User list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchUsersApiV1XiaohongshuWebSearchUsersGet_0Test() throws ApiException {
        String keyword = null;
        Integer page = null;
        ResponseModel response = api.searchUsersApiV1XiaohongshuWebSearchUsersGet_0(keyword, page);

        // TODO: test validations
    }
    
}
