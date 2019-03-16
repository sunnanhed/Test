import java.util.Scanner;

public class Odds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			//This is a comment
		System.out.println("What do u want to do?: ");
		System.out.println("1: Calculate odds\n2: Exit program");
		int choice = sc.nextInt();
		
		
			switch(choice) {
			case 1:
				double call, pot, totalPot, results;
				System.out.println("Pot: ");
				pot = sc.nextDouble();
				System.out.println("Amount to call: ");
				call = sc.nextDouble();
				totalPot = pot+call; 
				results = (call/totalPot)*100;
				System.out.println("Pottodds is: " +results);
				System.out.println();
				break;
			case 2:
				System.out.println("Program stops!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong command, try again!");
				break;
			}
		}

	

	}
}
