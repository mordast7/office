package com.example.office.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.HashSet;
import java.util.Set;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Sql("/scripts/init_three_users_with_2_3_4_articles.sql")
    public void getUserNamesWithThreeAndMoreArticles_Ok() {
        Set<String> actual = userRepository.findUniqueNamesWithMoreThan3Articles();
        Set<String> expected = new HashSet<>();
        expected.add("anya");
        expected.add("djusya");
        Assertions.assertLinesMatch(expected.stream(), actual.stream());
    }
}