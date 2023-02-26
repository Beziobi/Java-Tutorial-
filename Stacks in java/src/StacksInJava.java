import java.util.Stack;

public class StacksInJava {

	public static void main(String[] args) {
		Stack<String> games = new Stack<String>();
		games.add("call of Duty");
		games.add("guitar Hero");
		games.add("Super Monkey Ball");
		
		System.out.println(games.pop());
		// pop will pick the first one and remove it form the list 
		System.out.println(games.peek());
		// pop will pick the first one but will not remove the string or the sentence 
	
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.get(0));
		System.out.println(tower.set(1,'P'));
	}
	

}
