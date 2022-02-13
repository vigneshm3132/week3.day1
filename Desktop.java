package week3.day1;

public class Desktop extends Computer{

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		Computer computer = new Computer();
		
		desktop.desktopSize();
		computer.computerModel();
		
		desktop.computerModel();
		
	}
	public void desktopSize() {
		
		System.out.println("desktop size -> value");
	}
}
