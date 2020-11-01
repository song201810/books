package com.song.books.service;

import com.song.books.entity.BooksUser;
import org.springframework.stereotype.Service;

public interface UserService {
    BooksUser selectUser(String username, String password);
    BooksUser insertUser(BooksUser user);
}
