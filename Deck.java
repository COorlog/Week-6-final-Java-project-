import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {
	
	List <Card> cards = new ArrayList <Card>();
	
	public Deck () {
	
		ArrayList<String> suit = new ArrayList<String>(Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs"));
		ArrayList<Integer> cardValue = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
		ArrayList<String> cardName = new ArrayList<String>(Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"));
	
		for (int i = 0; i <= 3; i++) {
		for (int j = 0; j <= 12; j++) {
			Card card = new Card();
			card.setCardValue(cardValue.get(j));
			card.setCardName(cardName.get(j) + " of " + suit.get(i));
			cards.add(card);
		}
	}
}

//	public List<Card> getCards() {
//	return cards;
//}

	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);
		}
	}	

	





