package hw4;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "mucahitt", "Mucahit", "Turkmen", "12345678901", "09.08.1994");
		Gamer gamer2 = new Gamer(1, "enest", "Enes", "Turkmen", "123456789", "01.11.1997");
		Games game1 = new Games(1, "Gta 5", 84.99);
		Games game2 = new Games(2, "NBA 2K21", 249.99);
		Campaign campaign1 = new Campaign(1, "Spring campaigns.");
		
		GamerManager gamerManager = new GamerManager(new ValidateManager());
		gamerManager.check(gamer1);
		gamerManager.check(gamer2);
		
		System.out.println("---------------------");
		
		GameStore gameStore = new GameStore();
		gameStore.sale(gamer1, game2);
		gameStore.campaingSale(gamer2, game1);
		
		System.out.println("---------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		
	}

}
