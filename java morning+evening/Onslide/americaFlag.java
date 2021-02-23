package Onslide;

public class americaFlag {
	
	public static void main(String args[]) {
		for(int i=0; i<16; i++) {
			for(int j=0; j<40; j++) {
				if(i<9 && j<11) {
					if((i+j)%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				else {
					if(i%2==0)
						System.out.print("=");
				}
			}
			System.out.println("");
		}
	}

}
