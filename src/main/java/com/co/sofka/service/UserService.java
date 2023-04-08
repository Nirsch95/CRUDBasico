package com.co.sofka.service;

import com.co.sofka.domain.User;
import com.co.sofka.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }
    public void deleteById(String id){
        userRepository.deleteById(id);
    }
}
