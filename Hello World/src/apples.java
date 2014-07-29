import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int age=35;
		
		if (age>=60){
			System.out.println("You are over 60, a senior");
		}
		else if (age>=50){
			System.out.println("You are between 50 and 60, dude.");
		}
		else if (age>=40){
			System.out.println("You are between 40 and 50, bucko.");
		}
		else{
			System.out.println("You are under 40, woot");
		}
	}
}
