package quiz16;


public class MainClass {

	public static void main(String[] args) {
		Marine marine = new Marine(0,0);
	

		marine.location();
		marine.move(5, 5);
		marine.stop();
		
		Tank tank = new Tank(0,0);
		
		DropShip ds = new DropShip(0,0);
		
		ds.ride(marine);
		ds.ride(marine);
		ds.ride(marine);
		ds.ride(marine);
		ds.ride(tank);
		
		


	}

}
