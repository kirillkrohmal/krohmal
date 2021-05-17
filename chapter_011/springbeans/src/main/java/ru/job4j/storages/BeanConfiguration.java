package ru.job4j.storages;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public JdbcStorage jdbcStorage() {
        return new JdbcStorage();
    }

    @Bean
    public MemoryStorage memoryStorage() {
        return new MemoryStorage();
    }
}
