package com.baeldung.snippets;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.baeldung.snippets")
@PropertySource("classpath:config.properties")
public class Config {
}
