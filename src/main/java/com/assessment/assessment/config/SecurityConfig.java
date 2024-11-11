package com.assessment.assessment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/employees/**", "/api/departments/**").hasRole("ADMIN")
                        .requestMatchers("/api/employees", "/api/departments").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())  // HTTP Basic Authentication (still available)
                .csrf(csrf -> csrf.disable());  // Disabling CSRF for simplicity (enable in production)

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("empadmin")
                .password("{noop}exam#123")  // {noop} is for plain-text passwords; use a better encoder in production
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("emp001")
                .password("{noop}emppw#123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}


