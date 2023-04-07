package com.example.office.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.office.model.Article;
import com.example.office.model.User;
import com.example.office.service.ArticleService;
import com.example.office.service.UserService;
import com.example.office.util.enums.Color;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements ApplicationRunner{
    private final UserService userService;
    private final ArticleService articleService;

    @Override
    public void run(ApplicationArguments args) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(6) + 5; i++) {
            User user = Randomizer.getRandomUser();
            List<Article> articles = user.getArticles();

            for (int j = 0; j < random.nextInt(6) + 5; j++) {
                articles.add(Randomizer.getRandomArticle());
            }
            user.setArticles(articles);
            userService.save(user);
        }

        User root = new User();
        root.setName("root");
        root.setAge(20);
        root.setPassword(new BCryptPasswordEncoder().encode("root"));
        root.setArticles(new ArrayList<>());

        userService.save(root);
    }
}
