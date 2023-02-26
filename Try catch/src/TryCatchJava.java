import java.util.Scanner;

public class TryCatchJava {

	public static void main(String[] args) {
	/*	try {
		int[] a = {4,5,1};
		System.out.println(a[2]);
		} catch(Exception e) {
			System.out.println("An Exception happened");

		}*/
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your fav number?");
		int n = scan.nextInt();
		System.out.println(n);
		} catch(Exception e) {
			System.out.println("sorry,please enter a number");
			
		}
		try {
			int[] a = {4};
			System.out.print(a[1]);
			
		} catch (NullPointerException e){
			
			System.out.println("you array is null");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("your index is out of bounds!");
		
		} catch(Exception e) {
			System.out.println("Something else went wron!");
		}
		
	}

}
