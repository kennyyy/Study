package quiz11;

public class MainCalss {

	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		com1.getKeyborad().info();
		com1.getMonitor().info();
		com1.getMouse().info();
		
		System.out.println("-----------------------------");
		
		Computer com2 = new Computer(new KeyBoard(), new Monitor(), new Mouse());
		com2.getKeyborad().info();
		com2.getMonitor().info();
		com2.getMouse().info();
	}

}
