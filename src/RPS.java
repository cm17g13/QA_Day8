import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		//lizard spock is not working, but i didn't want to hardcode it
		int numberOfSigns = 3;
		boolean done = false;
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		int gamesPlayed = 0;
		int compWins = 0;
		int myWins = 0;
		int ties = 0;
		ArrayList<String> picked = new ArrayList<String>();
		do {
			
			System.out.println("Enter a number between 1 and " + numberOfSigns + ", or stop: ");
			
			String s = reader.nextLine().trim().toLowerCase();
			if(s.equals("stop")) {
				done = true;
				break;
			}
			if (s.matches("-?\\d+")) {
					
				int myNumber = Integer.parseInt(s) - 1;
				int theirNumber = rand.nextInt(numberOfSigns);
				
				if(myNumber > numberOfSigns) {
					System.err.println("Number Invalid, please retype");
					continue;
				}
				String myOutcome;
				String theirOutcome;
				
				
				for(int i = 0; i < numberOfSigns; i++) {
					for(int j = 0; j < numberOfSigns; j++) {
						if(myNumber == i && theirNumber == j) {
	
							if(i == j) {
								System.out.println("Draw, boooooo");
								ties++;
							} else if((i + 1) == j || i == (j + 2)) {
								System.out.println("You lose :'(");
								compWins++;
							} else if(i == (j + 1)|| (i + 2) == j) {
								System.out.println("You win!");
								myWins++;
							}
							//code from online, doesnt work
//							if (theirNumber == myNumber) {
//								System.out.println("Draw, boooooo");
//								ties++;
//							} else if ((theirNumber - myNumber) % 5 < 3) {
//								System.out.println("You lose :'(");
//								compWins++;
//						    } else {
//						    	System.out.println("You win!");
//								myWins++;
//						    }
							
							
							gamesPlayed++;
							myOutcome = outcome(i);
							theirOutcome = outcome(j);
							picked.add(myOutcome);
							picked.add(theirOutcome);
							System.out.println("You picked: " + myOutcome + ", They picked: " + theirOutcome);
						}
					}
				}
				//1,1 draw		1,2 false		1,3 true		1,4 true 	1,5 false
				//2,1 true		2,2 draw		2,3 false  		2,4 false	2,5 true
				//3,1 false 	3,2 true		3,3 draw		3,4	true	3,5 false
				//4,1 false 	4,2 true		4,3 false		4,4 draw 	4,5 true
				//5,1 true 		5,2 false		5,3 true 		5,4 false 	5,5 draw
				
				//false: 	1,2  	1,5 	2,3		2,4 	3,1 
				//true: 	1,3 (4,3)	2,1		3,2
				
				
			} else {
				System.err.println("Invalid input, please retype");
				continue;
			}	
			if(gamesPlayed >= 50) {
				done = true;
			}
		} while(!done);
		System.out.println("You played " + gamesPlayed + " games.");
		System.out.println("There were " + ties + " Ties, " + ties*100/gamesPlayed + "% of the time");
		System.out.println("The computer won " + compWins + " times, " + compWins*100/gamesPlayed + "% of the time");
		System.out.println("You won " + myWins + " times, " + myWins*100/gamesPlayed + "% of the time");
		int initialValue = 0;
		String sign = "";
		for(int i = 0; i < numberOfSigns; i++) {
			int signsPlayed = Collections.frequency(picked, outcome(i));
			if(signsPlayed > initialValue) {
				sign = outcome(i);
				initialValue = signsPlayed;
				
			}
		}
		System.out.println("The most played sign was " + sign + ", it was played " + initialValue + " times, It appeared in " + initialValue*100/gamesPlayed + "% of games");
		
		
		reader.close();
	}

	private static String outcome(int input) {
		switch (input) {
		case 0: 
			return "Rock";
		case 1:
			return "Paper";
		case 2:
			return "scissors";
		case 3:
			return "Lizard";
		case 4:
			return "Spock";
		default:
			return "you're an idiot";

		}
	}

}
