package hw3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.getCertificate();
		instructor1.setUserId(1);
		instructor1.setInstructorId(1);
		instructor1.seteMail("instructor1@gmail.com");
		instructor1.setUserName("instructor");
		instructor1.setUserSurname("1");
		
		Student student1 = new Student();
		student1.setUserId(2);
		student1.setStudentId(1);
		student1.seteMail("student1@gmail.com");
		student1.setUserName("Student");
		student1.setUserSurname("1");
		student1.setGrade(100);
		
		User[] users =  {instructor1, student1};
		
		System.out.println(instructor1.certificate);
		System.out.println(student1.getGrade());
		
		StudentManager studentManager = new StudentManager();
		studentManager.finishCourse(student1);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.deleteStudent(instructor1);
		System.out.println("---------------------------");
		UserManager userManager = new UserManager();
		userManager.addMultipleUser(users);

	}

}
