package hw4;

public class ValidateManager implements ValidateService{

	@Override
	public boolean check(Gamer gamer) {
		if(gamer.getNationalityId().length() == 11) {
			System.out.println("Successful validate.");
			return true;
		}
		else {
			System.out.println("Wrong nationality id!");
			return false;
		}
		
		
	}

}
