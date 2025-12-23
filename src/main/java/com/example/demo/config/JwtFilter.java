package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JwtFilter {

    @Bean
    public OpenAPI customOpenAPI() {

        Server server = new Server();
        server.setUrl("https://9223.pro604cr.amypo.ai/");

        OpenAPI openAPI = new OpenAPI();
        openAPI.setServers(List.of(server));
        return openAPI;
    }
}
