package HandsOn;
import java.util.*;

public class que2 {
	public static void main(String args[]) {
		TreeMap<String, String> test= new TreeMap<>();
		test.put("K1", "name");
		test.put("K2", "number");
		test.put("K3", "address");
		test.put("K4", "city");
		test.put("K5", "gender");
		
	System.out.println("Answer: "+test.descendingKeySet());
	}

}
