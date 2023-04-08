package com.example.office.controller;

import java.util.List;
import java.util.Set;

import com.example.office.model.Article;
import com.example.office.model.User;
import com.example.office.service.ArticleService;
import com.example.office.service.UserService;
import com.example.office.util.enums.Color;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final ArticleService articleService;

    @GetMapping(params = "age")
    public List<User> getUsersByAge(@RequestParam Integer age) {
        return userService.findByAgeGreaterThan(age);
    }

    @GetMapping(value = "/color", params = "color")
    public List<User> getUsersByArticleColor(@RequestParam Color color) {
        return userService.findByArticlesColor(color);
    }

    @GetMapping("/unique-names")
    public Set<String> getUniqueNamesWithMoreThan3Articles() {
        return userService.findUniqueNamesWithMoreThan3Articles();
    }

    @PostMapping("/article")
    public Article saveArticle(@RequestBody Article article, Authentication authentication) {
        userService.findByName(authentication.getName()).get().getArticles().add(article);
        return articleService.save(article);
    }
}
