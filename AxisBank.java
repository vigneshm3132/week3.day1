package week3.day1;

public class AxisBank extends BankInfo{
//Super Class
	public void deposit() {
		System.out.println("Deposit cash in Account");
	}
	public static void main(String[] args) {
		
		BankInfo bankInfo = new BankInfo();
		AxisBank axisBank = new AxisBank();
		
		bankInfo.deposit();
		
		
	}
}
