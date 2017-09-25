package com.shareidea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Geek!deas").apiInfo(apiInfo()).select().apis(
		           RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Share!dea API")
				.description("Share!dea API reference for developers")
				.termsOfServiceUrl("http://share!dea.com")
				.contact("geekideas2017@gmail.com").license("Share!dea License")
				.licenseUrl("geekideas2017@gmail.com").version("1.0").build();
	}

}