package com.swgapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()                                 
          .apis(RequestHandlerSelectors.basePackage("com.swgapp"))             
          .paths(PathSelectors.regex("/greetings-api.*"))     
          .build()
          .apiInfo(metaDataInfo());
    
    }
    // for custom names
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Greetings REST API",
                "Greet User with name",
                "1.0",
                "Terms of service",
                new Contact("Rajat", "http://greet.coforge.io","rajat4211joshi@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                null);
        return apiInfo;
    }
    
    
    
    //for custom names
    private ApiInfo metaDataInfo() {
    	ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Greetings REST API")
                .description("Greet User with name")
                .version("1.0")
                .termsOfServiceUrl("Terms of service")
                .contact(new Contact("Sripriya", "greet.shristi.io","priya@gmail.com"))
                .license("Shristi Tech Academy")
                .licenseUrl("http://shristitechlabs.com")
                .build();                       
        return apiInfo;
    } 
    
}
