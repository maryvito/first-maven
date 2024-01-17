package com.demdev.service.service;

import com.demdev.database.dao.UserDao;
import com.demdev.database.entity.User;
import com.demdev.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id)
                .map(it -> new UserDto());

    }
}
