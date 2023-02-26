import java.util.ArrayList;
import java.util.Scanner;

public class JavaTutorial1 {

	public static void main(String[] args) {
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter a grade:");
	
	int n = scan.nextInt();
	
	if(n >= 90 && n <= 100) {
		System.out.println("A");
	}
	else if (n >= 80 && n < 90) {
		System.out.println("B");
		
	}
	else if (n >= 80 && n < 90) {
		System.out.println("C");
		
	}
	else if (n >= 70 && n < 80) {
		System.out.println("D");
		
	}
	else if (n >= 60 && n < 50) {
		System.out.println("E");
		
	}
	else if (n >= 0 && n < 50) {
		System.out.println("F");
		
	}
	else {
		System.out.println("The number you entered is invalide ");
	}
		*/
	/*	System.out.println((int)Math.pow(8,5));
		*/
		 	/*int a = 0;
		 	while(a < 10) {
			  System.out.println("a is less than 10:" + a );
			  a++;
			  */
		/*String sentence = "flapjacks are awesome!";
		Scanner scan1 = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan1.hasNext()){
			words.add(scan1.next());
		
		  }
		System.out.println(words);
	
		*/
	// how to store an array
		/*String backpack[] = {"shotgun","assault"};
		System.out.println(backpack[0]);
		*/
		/*for (int i = 0; i<= 15; i++ ) {
			System.out.println(i);
		
		}*/
		/*
		String s = "age: 47";
		s = s.replaceAll("\\D+","");
		int n = Integer.parseInt(s);
		System.out.println(n+2);
		*/
		
		// nested loop 
		int lotterycard  [][] = { {20,15,7},
								 {8,7,19},
								 {7,13,47}
				
		};
		for(int i = 0; i < 3; i++) {
		System.out.println("_____________");
			for (int j = 0; j < 3; j++) {
				System.out.println(lotterycard[i][j]);
			}
		}
		
			// the main method
	}

}
