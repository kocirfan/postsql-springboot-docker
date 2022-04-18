package com.kocirfan.postsqlexample.repo;

import com.kocirfan.postsqlexample.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres,Long> {
}
