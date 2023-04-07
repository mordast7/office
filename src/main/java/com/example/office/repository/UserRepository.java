package com.example.office.repository;

import java.util.List;
import java.util.Set;

import com.example.office.model.User;
import com.example.office.util.enums.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    List<User> findByAgeGreaterThan(int age);
    List<User> findByArticlesColor(Color color);
    @Query("SELECT DISTINCT u.name FROM User u JOIN u.articles a GROUP BY u HAVING COUNT(a) >= 3")
    Set<String> findUniqueNamesWithMoreThan3Articles();
}
