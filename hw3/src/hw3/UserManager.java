package hw3;

public class UserManager {
	
	public void addMultipleUser(User[] users) {
		for(User user : users) {
			System.out.println(user.getUserName() + " users added to system.");
		}
		
	}
	public void deleteUser(User user) {
		System.out.println("User deleted from system.");
	}
	public void updateUser(User user) {
		System.out.println("User updated.");
	}

}
