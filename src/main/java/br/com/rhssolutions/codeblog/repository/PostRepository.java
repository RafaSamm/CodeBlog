package br.com.rhssolutions.codeblog.repository;

import br.com.rhssolutions.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
