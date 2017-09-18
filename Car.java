package in.vamsoft.oops;

public abstract class Car extends Vehicle {
	
	public Car() {
		// Constructor
		System.out.println("Car.Car()");
	}
	@Override
	public void start() {
		System.out.println("Car.start()");
	}
	
	public void HandBreak() {
		System.out.println("Car.HandBreak()");
	}

}
