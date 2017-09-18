package in.vamsoft.oops;

public class SportsCar extends Car {
	
	public SportsCar(String model) {
		System.out.println("SportsCar.SportsCar()");
		System.out.println(model);
	}
	
	public SportsCar() {
		System.out.println("SportsCar.SportsCar()");
	}
		
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("SportsCar.start()");
	}

	@Override
	public void stop() {
		System.out.println("SportsCar.stop()");

	}

	@Override
	public void brake() {
		System.out.println("SportsCar.brake()");
	}

}
