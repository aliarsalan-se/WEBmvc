package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// to call index page here
		registry.addViewController("/").setViewName("index");
		
	}

@Bean
public	InternalResourceViewResolver internalResourceViewResolver() {
	InternalResourceViewResolver resolver= new InternalResourceViewResolver();
	resolver.setPrefix("WEB-INF/Pages/");
	resolver.setSuffix(".jsp");
	return resolver;
}
}
