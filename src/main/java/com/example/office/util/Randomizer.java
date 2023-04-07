package com.example.office.util;

import java.util.ArrayList;
import java.util.Random;

import com.example.office.model.Article;
import com.example.office.model.User;
import com.example.office.util.enums.Color;
import com.github.javafaker.Faker;

public class Randomizer {
    private static final Faker faker = new Faker();
    public static User getRandomUser() {
        User user = new User();
        user.setName(faker.name().fullName());
        user.setAge(getRandomAge());
        user.setPassword(faker.book().author());
        user.setArticles(new ArrayList<>());
        return user;
    }

    public static Article getRandomArticle() {
        Article article = new Article();
        article.setColor(Color.getRandomColor());
        article.setText(faker.book().title());
        return article;
    }

    private static Integer getRandomAge() {
        return new Random().nextInt(90);
    }
}
