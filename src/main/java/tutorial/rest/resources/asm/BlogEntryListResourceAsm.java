package tutorial.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import tutorial.core.services.util.BlogEntryList;
import tutorial.rest.mvc.BlogController;
import tutorial.rest.resources.BlogEntryListResource;

public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {
	
	public BlogEntryListResourceAsm() {
		super(BlogController.class, BlogEntryListResource.class);
	}

	@Override
	public BlogEntryListResource toResource(BlogEntryList entity) {
		return null;
	}

	
}
