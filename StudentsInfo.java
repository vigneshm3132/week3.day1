package week3.day1;

public class StudentsInfo {

	public void getStudentInfo(int id) {
		System.out.println(" The Student id is: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(" The Student id is: " + id);
		System.out.println(" The Student name is: " + name);
	}
	
	public void getStudentInfo(String lastName,String email,long phoneNumber) {
		System.out.println(" The LastName is: " + lastName);
		System.out.println(" The Email is: " + email);
		System.out.println(" The Phone Number is :" + phoneNumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsInfo stuObj = new StudentsInfo();
		stuObj.getStudentInfo(17);
		stuObj.getStudentInfo(7,"Vignesh");
		stuObj.getStudentInfo("Munusamy","vm@gmail.com", 9962171415L);

	}
}
