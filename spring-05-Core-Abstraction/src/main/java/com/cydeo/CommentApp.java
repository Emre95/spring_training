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


        CommentService cs1 = container.getBean(CommentService.class);
        CommentService cs2 = container.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);
        CommentService commentService = container.getBean(CommentService.class);

        commentService.publishComment(comment);

    }

}
