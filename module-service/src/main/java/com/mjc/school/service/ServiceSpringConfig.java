package com.mjc.school.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.mjc.school.service", "com.mjc.school.repository"})
public class ServiceSpringConfig {
}
