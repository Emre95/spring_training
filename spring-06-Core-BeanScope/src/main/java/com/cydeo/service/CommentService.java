package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.DBCommentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
//@Scope("prototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    private DBCommentRepository dbcommentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(DBCommentRepository dbcommentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.dbcommentRepository = dbcommentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        dbcommentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }

}
