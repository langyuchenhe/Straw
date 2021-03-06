package cn.tedu.straw.api.service;

import cn.tedu.straw.api.DTO.PostCommentDTO;
import cn.tedu.straw.commons.model.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-11
 */
public interface ICommentService extends IService<Comment> {
    Comment post(PostCommentDTO postCommentDTO, Integer userId, String userNickName);
    public Comment delete(Integer commentId, Integer userId);
}
