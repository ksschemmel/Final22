package FinalExam;

import java.util.*;

public class Question36 {

	public static void main(String[] args) {
		int num1;
		char choice, ch;
	Scanner scan = new Scanner(System.in);
	do
	{
		System.out.println("\n\nMainMenu : \n1.Monday\n2.Tuesday\n3.Wednesday" +
				"\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday\nq.Exit");
	
	System.out.println("Enter a Workday Number: ");
	choice = scan.next().charAt(0);
	
	switch(choice)
	{
	case '1': System.out.println("Monday, Working Day");
	break;
	
	case '2': System.out.println("Tuesday, Working Day");
	break;
	
	case '3': System.out.println("Wednesday, Working Day");
	break;
	
	case '4': System.out.println("Thursday, Working Day");
	break;
	
	case '5': System.out.println("Friday, Working Day");
	break;
	
	case '6': System.out.println("It is a Holiday, No Work");
	break;
	
	case '7': System.out.println("It is a Holiday, No Work");
	break;
	
	case 'q':
		System.exit(0);
		break;
	
	default: System.out.println("It is a Holiday, No Work");
	}
	}
	while(choice!='q');
	}

}
