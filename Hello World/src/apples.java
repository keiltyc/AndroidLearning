import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner cheese = new Scanner(System.in);
		double fnum, snum, answer;	
		System.out.print("Plese input first number: ");
		fnum = cheese.nextDouble();
		System.out.print("Plese input second number: ");
		snum = cheese.nextDouble();
		answer = fnum*snum;
		System.out.print("multiplied= ");
		System.out.println(answer);
	}
}