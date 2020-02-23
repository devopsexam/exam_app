package com.example.devops_application;
 
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class MeterRegistryConfig {

    @Bean
    public MeterRegistry meterRegistry() { return new SimpleMeterRegistry(); }
}
