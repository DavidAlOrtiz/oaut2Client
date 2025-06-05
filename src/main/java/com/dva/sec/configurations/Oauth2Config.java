package com.dva.sec.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Oauth2Config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity hSecurity) throws Exception {
        hSecurity.csrf().disable()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2Login();
        return hSecurity.build();
    }

}
