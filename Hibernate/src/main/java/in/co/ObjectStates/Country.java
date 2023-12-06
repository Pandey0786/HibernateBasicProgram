package in.co.ObjectStates;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

// Here in this class we are going to use the annotations for the second level cache 
// because we have to define in which class we are using to check if is working or not 

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Country {

	@Id
	private int id;

	private String states;

	private String city;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String states, String city) {
		super();
		this.id = id;
		this.states = states;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", states=" + states + ", city=" + city + "]";
	}

}
