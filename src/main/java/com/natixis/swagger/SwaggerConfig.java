package com.natixis.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.service.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurerAdapter {
	
	
	public static final Contact DEFAULT_CONTACT = new Contact(
		      "", "", "");
		  
		  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			      "", "this API is used in the step of documentation ", "1.0",
			      "urn:tos", DEFAULT_CONTACT, 
			      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

		  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
		      new HashSet<String>(Arrays.asList("application/json"/*,
		"application/xml"*/));
	
	
	
     /**
      *  Docket to decide what kind of APIs you would want to document. 
      *  In this example, we are documenting all APIs. You can filter
      *   out APIs you do not want to document with Swagger.
      * 
      */
	@Bean
	  public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	    		.select()
                .apis(RequestHandlerSelectors.basePackage("com.natixis.service"))
                .build()
	        .apiInfo(DEFAULT_API_INFO)
	        
	        .produces(DEFAULT_PRODUCES_AND_CONSUMES)
	        .consumes(DEFAULT_PRODUCES_AND_CONSUMES)
	        ;
	}

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
