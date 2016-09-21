package tutorial.core.services.util;

import java.util.ArrayList;
import java.util.List;

import tutorial.core.models.entities.Blog;

public class BlogList {

	private List<Blog> blogs = new ArrayList<>();

	public BlogList(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

}
