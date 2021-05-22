package hw4;

public class GamerManager implements GamerService {
	
	
	private ValidateService validateService;
	
	public GamerManager(ValidateService validateService) {
		super();
		this.validateService = validateService;
	}
	@Override
	public void signUp(Gamer gamer) {
		if(validateService.check(gamer)) {
			System.out.println(gamer.getName() + " added to system.");
		}
	}
	@Override
	public void delete(Gamer gamer) {
		if(validateService.check(gamer)) {
			System.out.println(gamer.getName() + " deleted from system.");
		}
	}
	@Override
	public void update(Gamer gamer) {
		if(validateService.check(gamer)) {
			System.out.println("User " + gamer.getName() + " updated.");
		}
		
	}
	@Override
	public void check(Gamer gamer) {
		if(validateService.check(gamer)) {
			System.out.println(gamer.getName() + " checked with eDevlet.");
		}
		
	}




}
