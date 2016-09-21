package tutorial.core.repositories;

import java.util.List;

import tutorial.core.models.entities.BlogEntry;

public interface BlogEntryRepo {

	public BlogEntry findBlogEntry(Long id);
	
	public BlogEntry deleteBlogEntry(Long id);
	
	public BlogEntry updateBlogEntry(Long id, BlogEntry data);
	
	public BlogEntry createdBlogEntry(BlogEntry data);
	
	public List<BlogEntry> findByBlogId(Long blogId);
	
}
