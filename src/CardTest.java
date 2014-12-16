public class CardTest {

	public static void main(String[] args) {
		Deck first = new Deck();
		for (int i = 0; i < 52; i++) {
			System.out.println(first.getCards()[i]);
		}
		System.out.println();
		first.Shuffle();
		for (int i = 0; i < 52; i++) {
			System.out.println(first.getCards()[i]);
		}
System.out.println(first.getNext().toString());

	}

}
