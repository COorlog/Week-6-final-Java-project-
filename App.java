

public class App {
	
	public static void main(String[] args) {
		
		Deck deckOfCards = new Deck();
			deckOfCards.shuffleDeck();
		

		Player p1 = new Player("Sam Smith");
		
		Player p2 = new Player("Tina Smith");
			
		for (int i = 0; i <= 25; i++) {
			p1.drawCard(deckOfCards);
			p2.drawCard(deckOfCards);
		}
		
		
		for (int i = 0; i<= 25; i++) {
			int p1Value = p1.flipCard().getCardValue();
			int p2Value = p2.flipCard().getCardValue();
			
			if (p1Value > p2Value) {
				System.out.println("Player 1's card value of: " + p1Value + ", beats Player 2's card value of: " +p2Value);
				p1.incrementScore();
			} 
		else if(p1Value < p2Value) {
				System.out.println("Player 2's card value of: " + p2Value + ", beats Player 1's card value of: " +p1Value);
				p2.incrementScore();
			} 
		else {
				System.out.println("It's a tie");
		}
			
		}	
		
			int p1Score = p1.getScore();
			int p2Score = p2.getScore();
		
			if (p1Score > p2Score) {
				System.out.println("Player 1's final score of: " + p1Score + ", beats Player 2's final score of: " +p2Score);
		}
		else if(p1Score < p2Score) {
				System.out.println("Player 2's final score of: " + p2Score + ", beats Player 1's final score of: " +p1Score);
		}
		else { 
				System.out.println("It was a tie game!");
		}
	}
}	
		// final if statement to see who's total score was higher p1.getScore() > p2.getScore() else if to check if p2 won and else to check for draw

		

		
			
			
		
	
	// game play - flip cards and compare
	
	//compare scores and declare winner
	

	
	
		

	
	



	


