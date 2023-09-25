package br.com.rhssolutions.codeblog.service.serviceImpl;

import br.com.rhssolutions.codeblog.model.Post;
import br.com.rhssolutions.codeblog.repository.PostRepository;
import br.com.rhssolutions.codeblog.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).get();


    }
    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
