package Snake_And_Ladder;

/*The Player then checks for
a Option. They are No Play,
Ladder or Snake. - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same
position
- In Case of Ladder the player moves ahead by the
number of position received in the die

- In Case of Snake the player moves behind by the number of position recieved in the dice
 * 
 */
public class Uc5 {

	static int count_of_dice = 0;
	public int gamePlay() 
	{
		int position = 0;
		
		int condition = 10;

		while (condition > 0)
		{
			int options = (int) (Math.random() * 3 + 1);
			System.out.println("option is " + options);
			int dice_roll = (int) (Math.random() * 6 + 1);
			System.out.println("Dice Rolled " + dice_roll);
			int reserve = dice_roll;

			if (dice_roll > 0)
			{
				count_of_dice++;
			}

			if (options == 1)
			{
				System.out.println("No Play");
				position = position;
			} else if (options == 2) 
			{
				System.out.println("there is ladder");
				position += dice_roll;
			} else if (options == 3) 
			{
				System.err.println("there is Snake");
				position -= dice_roll;
				if (position < 0)
				{
					position = 0;
				} else {
					position = position;
				}
			} else 
			{
				System.out.println("roll dice again");
			}

			System.out.println("Position " + position);
			int Previous_position = position;
			

			if (position > 100) 
			{
				position = Previous_position- reserve;
				System.out.println("Current position "+ position);
			}

			System.out.println("-------------------------");

			if (position == 100)
			{
				System.out.println("Player is winner");
				break;
			}
			else 
			{
				System.out.println("roll a dice again");
			}
		}
		return position;
	}

	public static void main(String[] args) {

		System.out.println("The single player is at position 0");
		Uc5 roll = new Uc5();
		int player1=roll.gamePlay();
		System.out.println(player1);
		
		}

	}



