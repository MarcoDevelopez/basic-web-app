package tutorial.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Blog {

	@Id
	@SequenceGenerator(name = "seq_blog", sequenceName = "seq_blog")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_blog")
	private Long id;
	private String title;
	
	@OneToOne
	private Account owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Account getOwner() {
		return owner;
	}

	public void setOwner(Account owner) {
		this.owner = owner;
	}

}
