package tutorial.core.services.util;

import java.util.ArrayList;
import java.util.List;

import tutorial.core.models.entities.BlogEntry;

public class BlogEntryList {

	private List<BlogEntry> entries = new ArrayList<>();
	private Long blogId;

	public BlogEntryList(Long blogId, List<BlogEntry> entries) {
		this.entries = entries;
		this.blogId = blogId;
	}

	public List<BlogEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<BlogEntry> entries) {
		this.entries = entries;
	}


	public Long getBlogId() {
		return blogId;
	}


	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	
}
