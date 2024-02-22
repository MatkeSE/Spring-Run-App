package com.rungroup.rungroup.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityCongif {
//    private CustomUserDetailsService userDetailsService;
//
//    @Autowired
//    public SecurityConfig(CustomUserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Bean
//    public static PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable);
//        http.cors(AbstractHttpConfigurer::disable);
//
//
//
//        return http
//                .authorizeHttpRequests(request -> request
//                        .requestMatchers(HttpMethod.POST, "/login").permitAll()
//                        .requestMatchers(HttpMethod.POST, "/register").permitAll()
//                        .requestMatchers(HttpMethod.POST, "/clubs").permitAll()
//                        .requestMatchers(HttpMethod.POST, "/css/**").permitAll()
//                        .requestMatchers(HttpMethod.POST, "/js/**").permitAll()
//                        .anyRequest()
//                        .authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/login")
//                        .defaultSuccessUrl("/clubs")
//                        .loginProcessingUrl("/login")
//                        .failureUrl("/login?error=true")
//                        .permitAll()
//                ).logout(
//                        logout -> logout
//                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll()
//                )
//                .build();
//    }
//    public void configure(AuthenticationManagerBuilder builder) throws Exception {
//        builder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
}
