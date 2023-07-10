package com.lessons.springilmiofotoalbum.security;

import com.lessons.springilmiofotoalbum.model.User;
import com.lessons.springilmiofotoalbum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DatabaseUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> result = userRepository.findByEmail(username);
        if (result.isEmpty()){
            throw new UsernameNotFoundException("user with email "+username+" not found");
        }
        return new DatabaseUserDetails(result.get());
    }


}
