package com.song.books.dao;

import com.song.books.entity.BooksUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<BooksUser,String> {
    @Query("select t from BooksUser t where t.userName = :username and t.passWord= :password")
    BooksUser selectUser(String username, String password);
}
