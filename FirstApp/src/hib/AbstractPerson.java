package hib;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 /**
 * @author vivek.mishra
 *
 */
@MappedSuperclass
public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** minimal constructor */
	public AbstractPerson(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractPerson(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 5)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}