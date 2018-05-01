package com.amardeep.movie.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = builder.build();
		 List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
		 converters.add(mappingJackson2HttpMessageConverter());
	     return restTemplate;
	}
	private MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter()
	{
	    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();    
	    List<MediaType> jacksonTypes = new ArrayList<>(converter.getSupportedMediaTypes());
	    jacksonTypes.add(MediaType.TEXT_HTML);
	    converter.setSupportedMediaTypes(jacksonTypes);
	    return converter;
	}  
	 @Override
     public void addCorsMappings(CorsRegistry registry) {
         registry.addMapping("/**")
             .allowedOrigins("*")
             .allowedMethods("PUT", "DELETE", "GET", "POST", "OPTIONS")
             .allowedHeaders("Content-Type")
             .exposedHeaders("Content-Type")
             .allowCredentials(false).maxAge(3600);
     }
}
