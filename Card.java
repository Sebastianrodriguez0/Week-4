import java.util.Random;

	public class Card {
		int suit, facevalue;
		String Suit, Value;
		Random number = new Random();
		
		public Card() {
			randomizer();
		}

			public void randomizer() { 
				suit = number.nextInt(4) + 1;
				facevalue = number.nextInt(13) + 1;
			}
	
	public String toString() { 
		if (facevalue >=2 && facevalue<=10)
			Value = Integer.toString(facevalue);
		else if (facevalue == 1)
			Value = "Ace";
		else if (facevalue == 11)
			Value = "Jack";
		else if (facevalue ==12)
			Value = "Queen";
		else
			Value = "King";
		if ( suit == 1)
			Suit = " of Hearts";
		else if (suit == 2)
			Suit = " of Diamonds";
		else if (suit == 3)
			Suit = " of Spades";
		else
			Suit = " of Clubs";
		
		return Value + Suit;
	}

	public static void main(String[] args) {
		int card = 0;
		Card newCard = new Card();
		
		System.out.println("Your cards are: ");
		for (int value = 1; value <=5; value++) {
			newCard.randomizer();
			System.out.println(card + ": " + newCard );
			card++;
		}
		}

	}
