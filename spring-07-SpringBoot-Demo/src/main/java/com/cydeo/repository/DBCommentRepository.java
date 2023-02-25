package com.cydeo.repository;

import com.cydeo.model.Comment;

public interface DBCommentRepository {

    void storeComment(Comment comment);

}
