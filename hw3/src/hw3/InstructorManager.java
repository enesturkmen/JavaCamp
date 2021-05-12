package hw3;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getInstructorId() + " added new course to system.");
	}
	public void deleteStudent(Instructor instructor) {
		System.out.println(instructor.getInstructorId() + " deleted a student from course.");
	}
	public void gradeStudent(Instructor instructor) {
		System.out.println(instructor.getInstructorId() + " graded a student.");
	}

}
