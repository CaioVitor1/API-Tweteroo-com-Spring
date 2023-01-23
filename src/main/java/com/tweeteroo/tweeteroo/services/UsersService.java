package com.tweeteroo.tweeteroo.services;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;
import com.tweeteroo.tweeteroo.model.Users;
import com.tweeteroo.tweeteroo.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public void save(NewUserDTO req) {
        repository.save(new Users(req));
    }
}
