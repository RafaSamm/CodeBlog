package br.com.rhssolutions.codeblog.service;

import br.com.rhssolutions.codeblog.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);


}
