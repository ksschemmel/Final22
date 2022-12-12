package FinalExam;

import java.util.ArrayList;
import java.util.Random;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numbers = new ArrayList<Integer>();
Random generator = new Random();

int n = 10;
for(int i = 0; i<n; i++) {
	numbers.add(generator.nextInt(30));
	System.out.println("The index "+ i + " The Number: "+ numbers.get(i));
}

	}

}
