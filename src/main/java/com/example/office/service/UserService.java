package com.example.office.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.example.office.model.User;
import com.example.office.util.enums.Color;

public interface UserService {
    User save(User user);
    Optional<User> findByName(String name);
    List<User> findByAgeGreaterThan(int age);
    List<User> findByArticlesColor(Color color);
    Set<String> findUniqueNamesWithMoreThan3Articles();
}
