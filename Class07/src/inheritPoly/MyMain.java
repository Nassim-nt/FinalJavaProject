package inheritPoly;

public class MyMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalSound();   // whenever there is inheritance for multiple classes 
								// we can create object for each class by using the super class name
								// = less work!!!!
								// this is also conceder as polymorphism; one to many ( there is one class animal related for many classes)
		
		Animal pig = new Pig();
		pig.animalSound();
		
		Animal dog = new Dog();
		dog.animalSound();

	}

}
