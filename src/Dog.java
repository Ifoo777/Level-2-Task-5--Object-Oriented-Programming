public class Dog {

	// Attributes features that an object can take on
	String name;
	String color;
	String breed;
	int weight;
	int age;

	// Create a constructor of objects in the class This method is used to
	// initialize the attributes to the values that we
	// specify for each object.
	public Dog(String name, String color, String breed, int weight, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.weight = weight;
		this.age = age;
	}

	// Create a toString Method to display the values of all the attributes of each
	// class
	public String toString() {
		String output = "Name: " + name;
		output += "\nColor: " + color;
		output += "\nBreed: " + breed;
		output += "\nWeight: " + weight;
		output += "\nAge: " + age;

		return output;
	}

}
