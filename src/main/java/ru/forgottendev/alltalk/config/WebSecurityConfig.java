package ru.forgottendev.alltalk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        .authorizeRequests(a -> a.antMatchers("/", "/error").permitAll().anyRequest().authenticated())
                .oauth2Login()
                .and()
                .csrf().disable();
        return http.build();
    }
}
