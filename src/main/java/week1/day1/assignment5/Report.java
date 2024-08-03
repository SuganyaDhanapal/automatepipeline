package week1.day1.assignment5;

public class Report {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentName("Lily");
		student1.setRollNo("ABC124");
		student1.setCollegeName("Madras University");
		student1.setMarkScored(90);
		student1.setCgpa(9.1f);
		
		System.out.print("Student Name " + student1.getStudentName());
		System.out.print("; Roll No: " + student1.getRollNo());
		System.out.print("; College Name: " + student1.getCollegeName());
		System.out.print("; Mark Scored: " + student1.getMarkScored());
		System.out.print("; cgpa: " + student1.getCgpa());
	}

}
