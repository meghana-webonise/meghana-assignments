
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class project {

	
	public static void main(String[] args) {
		ReadCVS obj = new ReadCVS();
		 ReadCVS obj1 = new ReadCVS();
		
		String s="";
		System.out.println("Enter the item required");
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		     s = br.readLine();
	 
		    System.out.println(s);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		obj.run(s);
		obj1.run1(s);
	 
		//obj.get(s);
	  }

	}



