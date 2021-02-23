package HandsOn;
import java.util.*;
import java.lang.Math; 

public class que3 {
	
	public static int check(int num) {
		if(num==2 || num==3)
			return 1;
		
		else {
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i==0)
					return 0;
			}
			return 1;
		}
	}
	
	public static void main(String args[]) {
		int count=0;
		for(int i=2; i<=100; i++) {
			if(check(i)==1) {
				System.out.println("Prime Encountered: "+i);
				count=count+1;
			}
		}
		System.out.println("Total Prime: "+count);
		
	}

}
