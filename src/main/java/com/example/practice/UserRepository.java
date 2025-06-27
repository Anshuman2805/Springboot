package com.example.practice;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
