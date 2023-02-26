
public class Nested {

	public static void main(String[] args) {

		int B=8;
		for (int a = 1; a <= 5; a++) {
			for(int b = 0; b < a; b++) {
				System.out.print(" ");
			}
			for(int c = 0 ; c <= B; c++)
			{
				System.out.print("A");
			}
		System.out.println();

		B = B-2;
		}
		
	}

}
