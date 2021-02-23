package HandsOn;
import java.util.*;

public class que1 {
	
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		
		String given, replacement, newWord, answer;
		given=s.nextLine();
		replacement=s.nextLine();
		newWord=s.nextLine();
		
		answer=given.replaceAll(replacement, newWord);
		
		System.out.println("Answer: "+answer);
		
	}
	

}
