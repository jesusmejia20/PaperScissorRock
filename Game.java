import java.util.Scanner;
import java.util.Random;

public class Game
{
	private static Scanner input;

	public static void main( String[] args)
	{
		input = new Scanner(System.in);
		Random randomgenerator= new Random();
		int response;
		int random;

		System.out.println( "Let's Play A Game Of Paper-Scissor-Rock!");
		System.out.println( "Computer's Choice");
		random=randomgenerator.nextInt(3);
		System.out.println( "Make Your Choice! Enter 1 For Paper, 2 For Scissors, 3 For Rock or 5 To End Game");
		response=input.nextInt();
			
				if( response==random)
					System.out.println("It's A Tie!");
				else if(response==1) {
					if(random==2)
						System.out.println("Scissors Cut Paper, You Lose!");}
				else if (response==1) {
					if(random==3)
						System.out.println("Paper Wraps Rock, You Win!");}
				else if (response==2) {
					if(random==1)
						System.out.println("Scissors Cut Paper, You Win!");}
				else if (response==2) {
					if(random==3)
						System.out.println("Rock Crushes Scissors, You Lose!");}
				else if (response==3) {
					if(random==1)
						System.out.println("Paper Wraps Rock, You Lose!");}
				else if (response==3) {
					if(random==2)
						System.out.println("Rock Crushes Scissors, You Win!");}
				else if (response==5) {
					System.out.println("Thanks For Playing, See You Next Time");}
			else
					System.out.println("Please Enter Valid Choice");
					
	}
}
