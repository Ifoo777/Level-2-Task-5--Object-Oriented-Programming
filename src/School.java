
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat Snowy = new Cat("Snowy", "Black", "Maincoon", 18, 20);
		Cat Twinkie = new Cat("Twinkie", "White", "Sphinx", 20, 10);
		Cat Bubbles = new Cat("Bubbles", "Brown", "Widcat", 15, 30);

		// Display output
		System.out.println("Cats\n");
		System.out.println(Snowy.toString() + "\n");
		System.out.println(Twinkie.toString() + "\n");
		System.out.println(Bubbles.toString());

		// Instantiate new objects from the dog class
		Dog Tom = new Dog("Tom", "Black", "German Sheperd", 80, 12);
		Dog Ted = new Dog("Ted", "White", "Bulldog", 90, 20);
		Dog Terry = new Dog("Terry", "Brown", "Husky", 70, 5);

		// Display output
		System.out.println("Dogs\n");
		System.out.println(Tom.toString() + "\n");
		System.out.println(Ted.toString() + "\n");
		System.out.println(Terry.toString());

	}

}