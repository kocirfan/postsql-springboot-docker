package com.kocirfan.postsqlexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PostsqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostsqlExampleApplication.class, args);
    }

}
