package com.example.demo.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 14043
 */
@Configuration
@EnableSwagger2 // 加载引导类上或者配置类上都可以
public class SwaggerConfig {

    @Bean("商品平台")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("商品平台")
                .select()
                // 所有标了API注解的才在文档中展示
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("商品平台接口文档")
                .description("提供商品平台的文档")
                .termsOfServiceUrl("https://blog.csdn.net/qq_34093082")
                .version("1.0")
                .build();
    }

}
