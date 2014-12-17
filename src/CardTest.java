public class CardTest {

	public static void main(String[] args) {
		Deck first = new Deck();
		System.out.println(first.toString());
		Hand player = new Hand();
		Hand dealer= new Hand();
		dealer.ai(first,player.play(first));
		player.winner(dealer);
		}
}
