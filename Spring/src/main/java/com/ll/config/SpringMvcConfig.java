package com.ll.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.ll.controller","com.ll.config"})
@EnableWebMvc
public class SpringMvcConfig
{
}
