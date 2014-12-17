public class Card {
	private int number;
	private int value;
	private String sign;

	public Card(int number) {
			
				this.number=number%13;
				this.number++;
			if( this.number==1)
				this.value=11;
			else if (this.number>=10)
				this.value=10;
			else 
				this.value=this.number;
				
			switch (number/13) {
			case 0:
				this.sign = "\u2665";
				break;
			case 1:
				this.sign = "\u2660";
				break;
			case 2:
				this.sign = "\u2666";
				break;
			case 3:
				this.sign = "\u2663";
				break;
			}
		if(this.number>=11)
			this.number++;
	}

	public int getValue() {
		return this.value;
	}

	public String toString() {
		String out = "";

		out += this.number + " " + this.sign;
		return out;
	}
	public Card(Card other){
		this.number=other.number;
		this.value=other.value;
		this.sign=other.sign;
	}
}
