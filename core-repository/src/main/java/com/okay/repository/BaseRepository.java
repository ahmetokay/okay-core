package com.okay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Integer> {

    @Query("select e from #{#entityName} e where e.isActive=true")
    List<T> findAll();

    @Modifying
    @Query(value = "update #{#entityName} e set e.isActive=false where e.pkid = ?1")
    void delete(Integer pkid);
}