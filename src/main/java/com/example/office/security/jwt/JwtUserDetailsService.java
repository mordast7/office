package com.example.office.security.jwt;

import static org.springframework.security.core.userdetails.User.withUsername;

import com.example.office.model.User;
import com.example.office.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userService.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "User not found with username: " + username));
        UserBuilder builder = withUsername(username);
        builder.password(user.getPassword());
        builder.roles();
        return builder.build();
    }
}
