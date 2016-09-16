package tutorial.core.services;

import tutorial.core.models.entities.BlogEntry;

public interface BlogEntryService {

	public BlogEntry findBlogEntry(Long id); // Return the BlogEntry
	
	public BlogEntry deleteBlogEntry(Long id); // Deletes the found BlogEntry
	
	/**
	 * 
	 * @param id the id of BlogEntry to updateBlogBlogEntry
	 * @param data the BlogEntry containing the data to be used for
	 * @return the updated BlogEntry or null f the BlogEntry with
	 */
	public BlogEntry updateBlogEntry(Long id, BlogEntry data);
	
}
