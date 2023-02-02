package Snake_And_Ladder;


public class Uc7 {

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
				position = Previous_position-reserve;
				System.out.println("Current Position " + position);
			}

			System.out.println("-------------------------");

			if (position == 100)
			{
				System.out.println("winner");
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
		Uc7 roll = new Uc7();
		int player1=roll.gamePlay();
		System.out.println(player1);
		int a =count_of_dice;
		count_of_dice=0;
		int player2=roll.gamePlay();
		System.out.println(player2);
		System.out.println(count_of_dice>a ? "Player 2 Wins " : "Player 1 wins ");
		
		}

	}



