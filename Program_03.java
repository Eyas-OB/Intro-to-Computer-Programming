import java.util.Scanner;
public class ERA_Calc 
{

	public static void main(String[] args) 
	{
		// made a new scanner named bob
		Scanner bob = new Scanner(System.in);
		
		//made a varable to hold the players first name 
		String p_first;
		
		//made a varable to hold the players last name 
		String p_last;
		
		//made a varable to hold the players innings piched and number of runs
		int innings_pitched;
		int number_of_runs;
		
		//allow the user to choose the players first name 
		System.out.print("Pitchers first name: ");
		p_first = bob.next();
		
		//allowing the user to determine the last name 
		System.out.print("Pitchers last name: ");
		p_last = bob.next();
		
		//allowing the user to determine the number of runs 
		System.out.print("number of runs: ");
		number_of_runs = bob.nextInt();
		
		
		//allowing the user to deteermine the number of innings pitched
		System.out.print("Number of innings pitched: ");
		innings_pitched = bob.nextInt();
		
		//calculate the ERA of the player while also changing the type to double 
		double era =  (number_of_runs *9.0) / innings_pitched;
		
		//prints out the players first name and the players last name along with their ERA
		System.out.println(p_first);
		System.out.println(p_last);
		System.out.println("Has an ERA of: "+ era);
	}

}
