import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Enter your first gf name here: ");
		String temp = input.nextLine();
		
		tunaObject.setName(temp);
		tunaObject.saying();

		String getname = tunaObject.getName();
		System.out.println("Calling up name " + getname);
		
		System.out.printf("Saving a step... remotely asking for %s",tunaObject.getName());
	}
}
