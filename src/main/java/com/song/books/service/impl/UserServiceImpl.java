package com.song.books.service.impl;

import com.song.books.dao.UserDao;
import com.song.books.entity.BooksUser;
import com.song.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public BooksUser selectUser(String username, String password) {
        BooksUser booksUser=userDao.selectUser(username,password);
        return booksUser;
    }

    @Override
    public BooksUser insertUser(BooksUser user) {
        return null;
    }
}
