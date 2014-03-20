package hib;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author vivek.mishra
 *
 */
@Entity
@Table(name = "PERSON", schema = "APP")
public class Person extends AbstractPerson implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(Long id) {
		super(id);
	}

	/** full constructor */
	public Person(Long id, String name) {
		super(id, name);
	}

}
