import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
	Date currentDate = new Date();
	System.out.println(currentDate);
	
	SimpleDateFormat timFormat = new SimpleDateFormat("hh:mm:ss");
	}

}
