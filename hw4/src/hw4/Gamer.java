package hw4;

public class Gamer {
	
	private int id;
	private String userName;
	private String name;
	private String surname;
	private String nationalityId;
	private String dateOfBirth;
	
	public Gamer() {
		
	}

	public Gamer(int id, String userName, String name, String surname, String nationalityId, String dateOfBirth) {
		super();
		this.id = id;
		this.userName = userName;
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
