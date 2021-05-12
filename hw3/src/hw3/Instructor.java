package hw3;

public class Instructor extends User {
	
	int instructorId;
	Boolean certificate = true;

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public Boolean getCertificate() {
		return certificate;
	}

}
