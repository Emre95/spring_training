package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CommentConfig.class);

        Comment comment  = new Comment("Johnson","Spring Framework");

        CommentService commentService = container.getBean(CommentService.class);
        commentService.publishComment(comment);

    }

}
