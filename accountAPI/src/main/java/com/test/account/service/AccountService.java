package com.test.account.service;

import java.util.List;

import com.test.account.repository.UserRepository;
import com.test.account.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    public UserRepository userRepository;

    public List<User> getUserListAll() {
        return userRepository.findAll();
    }

    public List<User> getUsetListByName(String name) {
        return userRepository.findByName(name);
    }

    public List<Integer> getUserIdList() {
        return userRepository.getUserIdOrderByRecentLogin();
    }

    public int updateUser(String name) {
        return userRepository.updateUser(name);
    }
}