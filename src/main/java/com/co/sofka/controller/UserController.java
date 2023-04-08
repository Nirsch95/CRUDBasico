package com.co.sofka.controller;

import com.co.sofka.domain.User;
import com.co.sofka.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/users")
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("user/{id}")
    public User findById(@PathVariable String id){
        return userService.findById(id).get();
    }
    @DeleteMapping("user/{id}")
    public void deleteById(@PathVariable String id){
        userService.deleteById(id);
    }
    @PutMapping("/users")
    public void update(@RequestBody User user){
        userService.save(user);
    }
}
