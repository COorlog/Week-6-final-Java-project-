

public class Card {
	
	private String cardName;
	private int cardValue;

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
		
	public String describeCard() {
		return "Card value: " + cardValue + "; " + "Card: " + cardName;
	}
}
