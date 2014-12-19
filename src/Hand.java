public class Hand {
	private Card[] cards;
	private int numAces;
	private int counter;

	public Hand() {
		cards = new Card[52];
	}

	public void addCard(Card newCard) {
		cards[counter++] = new Card(newCard);
		if (newCard.getValue() == 11)
			this.numAces++;
	}

	public int getSum() {
		int sum = 0;
		for (int i = 0; i < counter; i++) {
			sum += cards[i].getValue();
		}
		if (sum > 21 && numAces > 0) {
			sum -= 10;
			numAces--;
		}
		return sum;
	}

	public int play(Deck first) {
		int play = 1;
		int sum=getSum();
		while (play == 1) {
			addCard(first.getNext());
			System.out.println("Suma karti je: " + sum);
			if (sum > 21) {
				System.out.println("Izgubili ste!");
				play = 0;
			} else if (sum == 21) {
				System.out.println("Black Jack!");
				play = 0;
			} else {
				System.out.println("Jos jednu kartu? 1 za DA, 0 za NE?");
				play = TextIO.getInt();
				if (sum < 21 && play == 0) {
					System.out.println("Vas score je: " + sum);
				}
			}
		}
		return sum;

	}

	public int ai(Deck first, int play) {
		while (play > getSum() && getSum() <= 21) {
			addCard(first.getNext());
		}
		return getSum();
	}

	public void winner(Hand dealer) {
		if (getSum() <= 21) {
			if (getSum() > dealer.getSum())
				System.out
						.printf("Dealer: %d Pobijedili ste!", dealer.getSum());
			else if (getSum() < dealer.getSum())
				System.out.printf("Dealer: %d Izgubili ste", dealer.getSum());
			else if (getSum() == dealer.getSum())
				System.out.printf("Dealer: %d Nerijeseno!", dealer.getSum());
		}

	}

}
