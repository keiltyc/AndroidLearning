import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int age=49;
		
		if (age<50){
			System.out.println("You're still young");
		}
		else{
			System.out.println("You're old");
			if (age>75){
				System.out.println("You're super old");
			}
			else{
				System.out.println("You're not that old");
			}
		}
	}
}
