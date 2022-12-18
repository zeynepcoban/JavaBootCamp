package simulationDemo.entities;

public class Courses {
	private int id;
	private String name;
	private String photo;
	private double price;
	private String description;

	public Courses() {

	}

	public Courses(int id, String name, String photo, double price, String description) {
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
