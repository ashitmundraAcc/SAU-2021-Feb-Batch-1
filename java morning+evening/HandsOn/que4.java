package HandsOn;
import java.util.*;
import java.io.*;

class stest implements Serializable {
	 transient String id;
	 transient int aadhar;
	 String name;
	 String city;
	 
	 
	 public stest(int aadhar, String name, String city)
	 {
		 UUID serialversionUID = UUID.randomUUID();
		 this.id = ""+serialversionUID;
		 this.aadhar = aadhar;
		 this.name = name;
		 this.city=city;
		 
	 }
}

public class que4 {
	 public static void main(String args[]){
		 stest t = new stest(1234, "Ram", "Jaipur");
		 try {
			 FileOutputStream file = new FileOutputStream("ashit.txt");
			 ObjectOutputStream out = new ObjectOutputStream(file);
			 out.writeObject(t);
			 out.close();
			 file.close();
			 System.out.println("Original Data: "+t.id + " " + t.aadhar+ " "+t.name+" "+t.city);
		 }
		 catch (Exception e) {
			 System.out.println("Err");
		 }
		 t = null;
		 try {
			 FileInputStream file = new FileInputStream("ashit.txt");
			 ObjectInputStream in = new ObjectInputStream(file);
			 t = (stest) in.readObject();
			 in.close();
			 file.close();
			 System.out.println("new Data: "+t.id + " " + t.aadhar+ " "+t.name+" "+t.city);
		 }
		 catch (Exception e) { 
			 System.out.println("Exception Caught");
		 }
	 }
	

}
