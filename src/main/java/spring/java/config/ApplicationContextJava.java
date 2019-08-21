package spring.java.config;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class ApplicationContextJava {
	
	@Bean
	public EmbeddedDatabase datasource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase embeddedDatabase= builder.setType(EmbeddedDatabaseType.HSQL)
												   .addScript("dbschema.sql")
												   .addScripts("test-data.sql")
												   .build();
		return  embeddedDatabase;
	}
}
