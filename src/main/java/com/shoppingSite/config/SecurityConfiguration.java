package com.shoppingSite.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()

                .antMatchers("/login", "/product/**").permitAll()

                .anyRequest().authenticated()
                .and()
                .csrf().disable().formLogin()
                .loginPage("/login");
    }

}
