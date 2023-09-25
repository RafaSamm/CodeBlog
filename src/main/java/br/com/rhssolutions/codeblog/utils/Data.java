package br.com.rhssolutions.codeblog.utils;

import br.com.rhssolutions.codeblog.model.Post;
import br.com.rhssolutions.codeblog.repository.PostRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Data {

    private PostRepository postRepository;

    public Data(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        var post1 = new Post();
        post1.setAutor("Rafael");
        post1.setData(java.time.LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Docker é uma ferramenta de desenvolvimento que facilita a criação de aplicativos distribuídos.");

        var post2 = new Post();
        post2.setAutor("Rafael");
        post2.setData(java.time.LocalDate.now());
        post2.setTitulo("Java");
        post2.setTexto("Java é uma linguagem de programação de alto nível.");


        postList.add(post1);
        postList.add(post2);

        for(Post  post : postList){
            Post postSalvo = this.postRepository.save(post);
            System.out.println(postSalvo.getId());
        }

    }

}
