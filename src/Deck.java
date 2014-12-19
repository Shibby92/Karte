public class Deck {
	private Card[] cards = new Card[52];
	private int counter = 0;

	public Deck() {
		for (int i = 0; i < 52; i++) {
			cards[i] = new Card(i);

		}
		shuffle();
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public void shuffle() {
		int counter = 0;
		Card tmp = new Card(1);
		while (counter < 100) {
			int card1 = RandomNum(0, 51);
			int card2 = RandomNum(0, 51);
			tmp = new Card(cards[card1]);
			cards[card1] = new Card(cards[card2]);
			cards[card2] = new Card(tmp);
			counter++;

		}
	}

	public int RandomNum(int min, int max) {
		return (int) (min + Math.random() * (max - min));
	}
public Card getNext(){
	return cards[counter++];
}
public String toString(){
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i < 52; i++) {
		sb.append(getCards()[i]);
		sb.append("   ") ;
		sb.append(getCards()[i].getValue());
		sb.append("\n");
	}
	sb.append("\n");
	return sb.toString();
}
}
