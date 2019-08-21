package spring.java.controllers;

import java.util.ArrayList;
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
import org.springframework.web.servlet.ModelAndView;

import spring.java.domain.User;
import spring.java.service.impl.BlogPostServiceImpl;

@Controller
public class EmbeddedDatabaseContoller {
	private static final Logger LOGGER =LoggerFactory.getLogger(BlogPostServiceImpl.class) ;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/displayUsers")
	public ModelAndView displayUsers() {
		
		ModelAndView model =  new ModelAndView("/displayUsers");
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Map<String,Object>> users = jdbcTemplate.queryForList("SELECT * FROM USERS");
		List<User> u = new ArrayList();
		
		for (Map<String, Object>user : users)
		{
			User u1 =new User();
			u1.setUsername((String) user.get("username"));
			u.add(u1);
			LOGGER.debug("username : " + user.get("username"));
		}
		model.addObject("users",u);
		return model;
	}
	
	
}
