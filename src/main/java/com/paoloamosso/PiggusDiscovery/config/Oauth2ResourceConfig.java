//package com.paoloamosso.PiggusDiscovery.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
//
//@Configuration
//@EnableResourceServer
//@EnableWebSecurity
//public class Oauth2ResourceConfig extends ResourceServerConfigurerAdapter {
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .cors().disable()
//                .anonymous().disable()
//                .authorizeRequests()
//                .antMatchers("/eureka/")
//                .permitAll()
//                .antMatchers("/").authenticated()
////                .hasRole("ADMIN").anyRequest()
//                .antMatchers("/fonts/**", "/js/**", "/css/**").permitAll()
//                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
//    }
//}
