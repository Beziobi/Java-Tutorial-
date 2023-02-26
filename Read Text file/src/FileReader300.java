import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader300 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/User/aleclee/Desktop/captmidn.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
		}
		}

}
