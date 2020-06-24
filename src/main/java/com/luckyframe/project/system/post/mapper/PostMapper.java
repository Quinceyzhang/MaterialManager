package com.luckyframe.project.system.post.mapper;

import java.util.List;
import java.util.Map;

import com.luckyframe.project.system.post.domain.Post;
import com.luckyframe.project.system.post.domain.PostParams;
import com.luckyframe.project.system.post.domain.PostParamsList;
import com.luckyframe.project.testmanagmt.projectCaseParams.domain.ProjectCaseParams;

import org.springframework.stereotype.Component;

/**
 * 岗位信息 数据层
 * 
 * @author ruoyi
 */
@Component
public interface PostMapper
{
    /**
     * 查询岗位数据集合
     * 
     * @param post 岗位信息
     * @return 岗位数据集合
     */
    List<Post> selectPostList(Post post);

    /**
     * 查询所有岗位
     * 
     * @return 岗位列表
     */
    List<Post> selectPostAll();

    /**
     * 根据用户ID查询岗位
     * 
     * @param userId 用户ID
     * @return 岗位列表
     */
    List<Post> selectPostsByUserId(Long userId);

    /**
     * 通过岗位ID查询岗位信息
     * 
     * @param postId 岗位ID
     * @return 角色对象信息
     */
    Post selectPostById(Long postId);

    /**
     * 批量删除岗位信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deletePostByIds(Long[] ids);

    /**
     * 修改岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    int updatePost(Post post);

    /**
     * 新增岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    int insertPost(Post post);

    /**
     * 校验岗位名称
     * 
     * @param postName 岗位名称
     * @return 结果
     */
    Post checkPostNameUnique(String postName);

    /**
     * 校验岗位编码
     * 
     * @param postCode 岗位编码
     * @return 结果
     */
    Post checkPostCodeUnique(String postCode);

    /**
     * 查询仪器参数
     * 
     * @param postId 仪器编码
     * @return 结果
     */
	List<PostParams> selectPostParamsList(Long postId);

	void deletePostParams(long postId);

	void insertPostParams(PostParams params);

	List<PostParamsList> selectAllPostList(Integer actionId);

	List<ProjectCaseParams> selectParamsListForPost(Long postId);

	Map<String,String> postIsOccupy(String postId);
}
