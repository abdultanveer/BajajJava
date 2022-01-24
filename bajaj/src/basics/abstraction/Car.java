package basics.abstraction;

public abstract class Car {
	
	
	abstract void steering();
	abstract void accelerator();
	abstract void brake();
	
	void makeSound() {
		System.out.println("beeping horn");
	}
}
