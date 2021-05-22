package hw4;

public class GameStore extends Gamer implements GameService{
	

	@Override
	public void sale(Gamer gamer, Games games) {
		System.out.println(gamer.getName() + " bought " + games.getName());
		
	}

	@Override
	public void giveBack(Gamer gamer, Games games) {
		System.out.println(gamer.getName() + " gave back " + games.getName() + " game.");
		
	}

	@Override
	public void campaingSale(Gamer gamer, Games games) {
		System.out.println(gamer.getName() + " bought " + games.getName() + " with campaign.");
		
	}
	
	

}
