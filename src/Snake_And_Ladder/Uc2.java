package Snake_And_Ladder;


/*The Player rolls the die
to get a number
between 1 to 6. - Use ((RANDOM)) to get the number between
1 to 6*/
public class Uc2 {
	
	public int diceRoll(int a) {
		return a = (int) ( (Math.random()*10 )%6+1);
		
	}

	public static void main(String[] args) {
		
		Uc2 roll = new Uc2();
		int dice1=roll.diceRoll(0);
		System.out.println("Dice number generated :: " + dice1);

	}

}
