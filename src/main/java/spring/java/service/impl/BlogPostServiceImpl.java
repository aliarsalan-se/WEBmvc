package spring.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

public class BlogPostServiceImpl implements BlogPostService{
	private static final Logger LOGGER =LoggerFactory.getLogger(BlogPostServiceImpl.class) ;
	
	public void savePost(BlogPost blogpost) {
		
		LOGGER.debug("BlogPostServiceImpl : savePost is called");
		// TODO Auto-generated method stub
		
	}

}
