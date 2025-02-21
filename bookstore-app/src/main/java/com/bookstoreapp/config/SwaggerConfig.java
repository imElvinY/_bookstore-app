package com.bookstoreapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Digital Library Management API")
                        .version("v1")
                        .description("A web-based library management system for book issuance and tracking.")
                        .contact(new Contact()
                                .url("https://www.linkedin.com/in/elvin-yusubov/")
                                .email("elvin.yusubovic@gmail.com")
                                .name("Elvin Yusubov")
                        )
                );
    }
}