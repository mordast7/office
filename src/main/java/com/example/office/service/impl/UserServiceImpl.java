package com.example.office.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.example.office.model.User;
import com.example.office.repository.UserRepository;
import com.example.office.service.UserService;
import com.example.office.util.enums.Color;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.of(userRepository.findByName(name));
    }

    @Override
    public List<User> findByAgeGreaterThan(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }

    @Override
    public List<User> findByArticlesColor(Color color) {
        return userRepository.findByArticlesColor(color);
    }

    @Override
    public Set<String> findUniqueNamesWithMoreThan3Articles() {
        return userRepository.findUniqueNamesWithMoreThan3Articles();
    }
}
