package FinalExam;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int number = scan.nextInt();
		if(number>0 && number<18)
		{
			System.out.println("You are a Minor");
		}
		else
		{
		System.out.println("You are not a Minor");
		}
	}

}
