
public class Introduction
{
	// Have the player receive 16 total "armies" to begin with
	public static void introducePlayers()
	{
		System.out.println("Welcome to Risk. This game will be based in America, with 8 territories to take over.");
		System.out.println("Right now, this is only a two player game, so player one, what is your name?");
		
		String playerOneName = Runner.userStringInput.nextLine();
		//RiskRunner.players.add(new Player(playerOneName));
		System.out.println("Welcome, " + playerOneName + ". \nPlayer two, what is your name?");
		
		String playerTwoName = Runner.userStringInput.nextLine();
		//RiskRunner.players.add(new Player(playerTwoName)); // <--- We need to make sure that when we add more stuff to the POJO we can change it here
		System.out.println("Welcome, " + playerTwoName);
		
		
	}
	
}
