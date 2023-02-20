package textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTXT {

	public static void main(String[] args) throws IOException {
		
		List<String> myList = new ArrayList<String>();
		
		String path = "data\\\\\\\\new_Salary.csv";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); 

		//System.out.println(br.lines()); // this will print everything
		String line = null;
		// while ((line = br.readLine()) != null) // if we dont wanna create ArrayList
		//System.out.println(line);
	
		while ((line = br.readLine()) != null) {
			myList.add(line);
		}
		
		
		//System.out.println(myList.get(3));
		
		
		for (int i=0; i<myList.size(); i++) {
			
			
			System.out.println(myList.get(i));
		}
		
		
		
		
	}

}
