package simulationDemo.entities;

public class Educator {
	private int id;
	private String firstName;
	private String lastName;
	private String profession;
	private String description;

	public Educator() {

	}

	public Educator(int id, String firstName, String lastName, String profession) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
