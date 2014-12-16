
public class Hand {
	private Card [] cards;
	private int numAces;
	private int counter;
	
	public Hand (){
		 cards = new Card [52];
			 int numAces=0;
			 int counter=0;
	}
	public void addCard(Card newCard){
		cards[counter++]= new Card (newCard);
		if (newCard.getValue()==11)
			this.numAces++;
	}
	public int getSum(){
		int sum=0;
		for(int i=0;i<counter;i++){
			sum+=cards[i].getValue();
		}
		if(sum>21 && numAces>0)
			sum-=10;
		
			
		return sum;
	}

}
