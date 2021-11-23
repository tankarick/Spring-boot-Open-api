package com.momo.data.service;

import com.momo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<String> getUsers() {
        return Arrays.asList("test");
    }
}
