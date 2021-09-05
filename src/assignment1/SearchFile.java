package assignment1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class SearchFile {

	protected static void search(String fileName){
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("File found");
			System.out.println("Here are the contents of the file");
			readFileAsString(fileName);
			
		}
		else {
			System.out.println("File doesnot exist");
		}
		
	}
	
	protected static void readFileAsString(String fileName) {
		
		String fileData = " ";
		
		try {
			fileData = new String(Files.readAllBytes(Paths.get(fileName)));
			System.out.println(fileData);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
