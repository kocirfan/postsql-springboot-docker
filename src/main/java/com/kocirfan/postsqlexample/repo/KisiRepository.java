package com.kocirfan.postsqlexample.repo;

import com.kocirfan.postsqlexample.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepository extends JpaRepository<Kisi, Long> {
}
