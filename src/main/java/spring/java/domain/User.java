package spring.java.domain;

import java.util.List;

public class User {
	private Long id;
	private String username;
	private String password;
    private boolean enabled;
    private List<BlogPost> blogpost;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<BlogPost> getBlogpost() {
		return blogpost;
	}
	public void setBlogpost(List<BlogPost> blogpost) {
		this.blogpost = blogpost;
	}

}
