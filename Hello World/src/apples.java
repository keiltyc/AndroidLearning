import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna("Bob");
		tuna tunaObject2 = new tuna("Cheese");
		tunaObject.saying();
		tunaObject2.saying();
	}
}
