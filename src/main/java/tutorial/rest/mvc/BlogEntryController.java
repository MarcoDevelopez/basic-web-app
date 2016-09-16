package tutorial.rest.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;

@Controller
@RequestMapping("/rest/blog-entries")
public class BlogEntryController {

	private BlogEntryService service;
	
	public BlogEntryController(BlogEntryService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/{blogEntryId}", method = RequestMethod.GET)
	public ResponseEntity<BlogEntryResource> getBlogEntry(@PathVariable Long blogEntryId) {
		BlogEntry entry = service.findBlogEntry(blogEntryId);
		if (entry != null) {
			BlogEntryResource res = new BlogEntryResourceAsm().toResource(entry);
			return new ResponseEntity<BlogEntryResource>(res, HttpStatus.OK);
		}
		return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
	}
}
