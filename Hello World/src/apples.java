import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print("Age: ");
		age = input.nextInt();
		
		switch (age){
		case 1:
			System.out.println("age 1 you can crawl");
			break;
			
		case 2:
			System.out.println("age 2 you can talk");
			break;
		
		case 3:
			System.out.println("age 2 you can walk");
			break;
			
		default:
			System.out.println("not age 1 to 3");
		}
	}
}