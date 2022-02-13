package week3.day1;

public class Student extends Department {

	public void studentName(){
		System.out.println("Vignesh");
	}
	public void studentDept(){
		System.out.println("Mech");
	}
	public void studentId(){
		System.out.println("50005");
	}
	
	
	Department department = new Department();
	College college = new College();
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.collegeName();
		student.collegeRank();
		student.collegeCode();
		student.deptName();
		student.studentId();
		student.studentName();
		student.studentDept();
	}
}
