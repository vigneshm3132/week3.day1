package week3.day1;

public class Calculator {
	
	
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10, 5);
		cal.add(10,5,6);
	}
}

