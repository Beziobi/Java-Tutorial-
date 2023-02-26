
public class ReturnStatment {

	public static void main(String[] args) {
		printAMessage();
		add(5,4);
		// we can't store the value the is inside add because it is void 
		
		//now we can store the value inside the method (sub) b/c it is not void
		int subt = sub(2,1);
		
		// array return type 
		String shouting = caps("why are you reading my diary mom?!");
		System.out.println(shouting);
		int[] awesomeArray = givemeArrayFromInts(1,2,3);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}
	public static void printAMessage() {
		System.out.println("this is out first method!");
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// to store a value in side a variable the is passed by method we need to let go of void
	public static int sub(int c, int d) {
		return c-d;
		
	}
	public static String caps(String s) {
		return s.toUpperCase();
	}
	public static int[] givemeArrayFromInts(int a, int b, int c) {
		int [] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

}
