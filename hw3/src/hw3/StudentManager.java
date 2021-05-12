package hw3;

public class StudentManager extends UserManager{
	
	public void startCourse(Student student) {
		System.out.println(student.getUserName() + " started course.");
	}
	public void finishCourse(Student student) {
		System.out.println(student.getUserName() + " finished course.");
	}

}
