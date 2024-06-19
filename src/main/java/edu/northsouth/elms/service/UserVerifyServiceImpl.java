/*
package com.hellokoding.auth.service;

import User;
import com.hellokoding.auth.model.UserVerifyModel;
import RoleRepository;
import UserRepository;
import com.hellokoding.auth.repository.UserVerificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

public class UserVerifyServiceImpl implements UserVerifyService{
    @Autowired
    private UserVerificationRepository userVerificationRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(UserVerifyModel userVerifyModel) {
        userVerificationRepository.save(userVerifyModel);
    }

    @Override
    public User findByUsername(String username) {
        return userVerificationRepository.findByUsername(username);
    }
}
*/
