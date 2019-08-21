package spring.java.controllers;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.java.service.impl.BlogPostServiceImpl;

@Controller
public class EmbeddedDatabaseContoller {
	private static final Logger LOGGER =LoggerFactory.getLogger(BlogPostServiceImpl.class) ;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/displayUsers")
	public void displayUsers() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Map<String,Object>> users = jdbcTemplate.queryForList("SELECT * FROM USERS");
		for (Map<String, Object>user : users)
		{
			LOGGER.debug("username : " + user.get("username"));
		}
	}
	
	
}
