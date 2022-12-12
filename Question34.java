package FinalExam;

import java.text.DecimalFormat;
import java.util.*;

public class Question34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float num;
		System.out.println("Enter a double-floating number: ");
		num=scan.nextFloat();
		DecimalFormat format1 = new DecimalFormat("0.####");
		System.out.println("The result is: "+ format1.format(Math.sqrt(num)));
		DecimalFormat format2 = new DecimalFormat("0.##");
		System.out.println("The formatted result is: " + format2.format(Math.sqrt(num)));
	
	}

}
