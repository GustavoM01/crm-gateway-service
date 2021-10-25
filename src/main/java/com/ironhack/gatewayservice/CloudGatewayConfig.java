package com.ironhack.gatewayservice;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CloudGatewayConfig {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return
                builder
                .routes()
                    .route(p -> p.path("/lead/**")
                            .uri("lb://lead-service"))
                .build();
    }


}
