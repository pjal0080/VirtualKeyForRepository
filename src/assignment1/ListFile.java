package assignment1;

import java.io.File;

public class ListFile {
	
	protected static void list() {
		
		File directoryPath = new File("C:\\Users\\pipranja\\eclipse-workspace\\assignment1\\");
    	File[] allFiles = directoryPath.listFiles();
    	
	    if(allFiles.length==0)
	    {
	    	System.out.println("There are no files to show");
	    }
	    else {
	    	
	    	for(File file : allFiles) {
	    		if(file.isDirectory() == false && file.getAbsolutePath().endsWith(".classpath") == false && file.getAbsolutePath().endsWith(".project") == false){
					System.out.println(file.getName());
					
	    		}
	    	}	
	    	
	    }
		
		
	}
	
	
	
}
