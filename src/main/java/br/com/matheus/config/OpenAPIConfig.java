package br.com.matheus.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI().info
                (new Info()
                        .title("RestFul API Java 18 and Spring boot")
                        .version("v1")
                        .description("Api restful development by Matheus Mendes Costa")
                        .license(new License().name("Apache 2.0").url("https://www.linkedin.com/in/matheus-mendes-317370104/"))
                        .termsOfService(""));
    }
}
