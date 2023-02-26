 class GuessGame{
	int p1;
	int p2;
	int p3;
	public void startGame() {

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		int targetNumber = (int ) (Math.random() * 10);
		System.out.println("i'm thinking of a number between 0 and 9...");
		System.out.println(targetNumber);
		while(true) {
			p1 = 1;
			p2 = 2;
			p3 = 3;
			
			guessp1 = p1;
			System.out.println("player one guessed "+ guessp1);
			
			guessp2 = p2;
			System.out.println("player two guessed "+ guessp2);
			
			guessp3 = p3;
			System.out.println("player three guessed "+ guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("p1" + p1isRight);
				System.out.println("p2" + p2isRight);
				System.out.println("p3" + p3isRight);
				}
			
			else {
				System.out.println("player will have to try again.");
			}
		}
	}
}


public class Guess {

	public static void main(String[] args) {
		GuessGame game = new GuessGame ();
		game.startGame();
	
	}

}
