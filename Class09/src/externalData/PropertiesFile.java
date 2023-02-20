package externalData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		
		
		// the use of this is to seperate data from our code
		// so in case we want to chage data, we don't mess our code
		
		// where is the file
		// are we reading 
		// are we writing 
		
		//String path = "data/test.properties"; // we coppied the path of file, so if we want to share the project of others
											  // they will be able to read it. and we took off project name, bc eclipse kows 
											  // what project we are working on 
		//Properties pro = new Properties (); // creating a project out of properties class
		//FileInputStream fi = new FileInputStream(path); // creating an object for the file we are reading (that's why we are using InputStream)
		
		
		//pro.load(fi); // connecting properties with file 
		
		//System.out.println(pro.get("password"));
		
		ReadPropertiesFlie("data/test.properties", "username");
		
	}
	
	public static void ReadPropertiesFlie (String path, String key) {
		
		try {
		Properties pro = new Properties ();
		FileInputStream fi = new FileInputStream(path);
		
		pro.load(fi);
		
		System.out.println(pro.get(key));
		}
		catch (IOException e) {
		       e.printStackTrace();
		}
	}
	
	
	

}
