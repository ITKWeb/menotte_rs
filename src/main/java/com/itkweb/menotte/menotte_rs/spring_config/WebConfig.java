package com.itkweb.menotte.menotte_rs.spring_config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.itkweb.menotte.menotte_rs.service")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(converterJackson());
		converters.add(converter2());
		converters.add(converter3());
	}

	@Bean
	MappingJacksonHttpMessageConverter converterJackson() {
		MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		// converter.setPrefixJson(false) ;
		//
		// List<MediaType> types = new ArrayList<MediaType>();
		// types.add(MediaType.ALL);
		// converter.setSupportedMediaTypes(types ) ;
		return converter;
	}

	@Bean
	ResourceHttpMessageConverter converter2() {
		ResourceHttpMessageConverter converter = new ResourceHttpMessageConverter();
		// converter.setPrefixJson(false) ;
		//
		// List<MediaType> types = new ArrayList<MediaType>();
		// types.add(MediaType.ALL);
		// converter.setSupportedMediaTypes(types ) ;
		return converter;
	}

	@Bean
	Jaxb2RootElementHttpMessageConverter converter3() {
		Jaxb2RootElementHttpMessageConverter converter = new Jaxb2RootElementHttpMessageConverter();
		// converter.setPrefixJson(false) ;
		//
		// List<MediaType> types = new ArrayList<MediaType>();
		// types.add(MediaType.ALL);
		// converter.setSupportedMediaTypes(types ) ;
		return converter;
	}

}