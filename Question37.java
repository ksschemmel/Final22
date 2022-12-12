package FinalExam;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number: ");
int num = scan.nextInt();

if((num & 1)==0)
{
	if(num>10)
	{
		System.out.println("number is odd and greater than 10");
	}
	
else {
	System.out.println(num + " is lower than 10");
}
}
else { 
	System.out.println("Number is even");
}

	}

}

