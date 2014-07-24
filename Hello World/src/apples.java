import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double boy, girl;
		
		System.out.print("Girl's age: ");
		girl = input.nextDouble();
		
		System.out.print("Boys's age: ");
		boy = input.nextDouble();
		
		if (girl>=18){
			System.out.println("Girl may enter");
		}
		else{
			System.out.println("Girl is too young");
		}
		
		if (boy>=18){
			System.out.println("Boy may enter");
		}
		else{
			System.out.println("Boy is too young");
		}
		
		if (boy>=18 && girl>=18){
			System.out.println("Both boy and girl may enter");
		}
		else{
			System.out.println("One or both are too young");
		}
		
		if (boy>=18 || girl>=18){
			System.out.println("One or both are old enough to enter");
		}
		else{
			System.out.println("Both are too young");
		}
	}
}