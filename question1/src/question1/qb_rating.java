package question1;
import java.util.Scanner;
public class qb_rating {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Inputed Variables
		int TD;
		int YARDS;
		int INT;
		int comp;
		int ATT;
		
		//Calculated variables
		double a;
		double b;
		double c;
		double d;
		double passer_rating;
		
		//Questions
		System.out.println("How many touchdowns did your QB throw?");
		TD = sc.nextInt();
		
		System.out.println("How many total yards did he have?");
		YARDS = sc.nextInt();
		
		System.out.println("How many interceptions did he throw?");
		INT = sc.nextInt();
		
		System.out.println("How many pass completions did he have?");
		comp = sc.nextInt();
		
		System.out.println("How many passes did he throw?");
		ATT = sc.nextInt();
		
		//Formulas
		a = ((comp / ATT) - 0.3) * 5;
		b = ((YARDS / ATT)-3) * 0.25;
		c = (TD / ATT) * 20;
		d = (2.375 - ((INT / ATT) * 25));
		
		passer_rating = ((a + b + c + d)/6) * 100;
		
		//Prints passer rating
		System.out.println("The QB's rating is " + passer_rating + ".");
		
		
		
	}

}

