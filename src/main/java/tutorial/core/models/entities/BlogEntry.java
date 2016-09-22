package tutorial.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class BlogEntry {

	@Id
	@SequenceGenerator(name = "seq_blog_entry", sequenceName = "seq_blog_entry")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_blog_entry")
	private Long id;
	private String title;
	private String content;
	
	@ManyToOne
	private Blog blog;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
