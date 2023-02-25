package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.DBCommentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class CommentService {

    private DBCommentRepository dbcommentRepository;
    private com.cydeo.proxy.CommentNotificationProxy commentNotificationProxy;

    public CommentService(DBCommentRepository dbcommentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.dbcommentRepository = dbcommentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        dbcommentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }

}
