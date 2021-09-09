import java.util.ArrayList;
import java.util.List;


public class Player {
	
	List <Card> cards = new ArrayList <Card>();
	
	List <Card> hand = new ArrayList<Card>();
	public int score;
	public String name;
	
	
	
	public Player(String name) {
	this.name = name;
	this.score = 0;	
		}
	
	
	public int getScore() {
		return score;
		
	}
	
	public List<Card> getHand() {
		return hand;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("Player: " + name +  "score: " + score);
		for (Card card : hand) {
			card.describeCard();
		}
	}

	public Card flipCard() {
		return hand.remove(0);
	}
	
	public void drawCard(Deck deck) {
		hand.add(deck.draw());
	
	}
	public void incrementScore() {
		score = score + 1;
	}


	

	}	
		
		
		

		
		
			
	

	

