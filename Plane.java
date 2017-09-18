package in.vamsoft.oops;

public class Plane extends Vehicle implements Flying{

	public Plane() {
		// TODO Auto-generated constructor stub
		System.out.println("Plane.Plane()");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Plane.start()");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Plane.stop()");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Plane.brake()");
	}

	@Override
	public void TakeOff() {
		// TODO Auto-generated method stub
		System.out.println("Plane.TakeOff()");
		
	}

	@Override
	public void Landing() {
		// TODO Auto-generated method stub
		System.out.println("Plane.Landing()");
	}
}
