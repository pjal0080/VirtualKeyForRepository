package assignment1;

import java.io.File;

public class SearchFile {

	protected static void search(String fileName){
		
		File file = new File(fileName);
		
		if(file.exists())
			System.out.println("File found");
		
		else {
			System.out.println("File doesnot exist");
		}
		
	}
	
	
	
}
