import java.util.Scanner;

class apples{
	public static void main(String args[]){
		double test = 6;
		if (test>=6){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (test==6){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		if (test<6){
			System.out.println("True");
		}
		else{
			System.out.println("False so adding 6");
			test+=6;
			System.out.println(test);
		}
	}
}