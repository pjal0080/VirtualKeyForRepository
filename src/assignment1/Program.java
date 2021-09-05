package assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Program implements FileManager{

	@Override
	public boolean createFile(String fileName) {
		
		
		try {
			File f=new File(fileName);
			if(f.exists())
			{
				
				System.out.println("File already exists");
				return false;
				
				
				
			}
			else {
				
				f.createNewFile();
				System.out.println("File successfully created ");
				
				System.out.println("Enter contents of the file");
				System.out.println("");
				
				writeToFile(f);
				
				return true;
				
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return false;
		}
//		
		
		
	}

	private static void writeToFile(File f) throws IOException {
		
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fi= new FileWriter(f);
		String fileContent=rd.readLine();
		fi.write(fileContent);
		fi.close();
		System.out.println("Content added successfully");
		
	}

	@Override
	public void listFiles() {
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
	
	
	
	private static void readFile(String fileName) {
		String fileData = " ";
		
		try {
			fileData = new String(Files.readAllBytes(Paths.get(fileName)));
			System.out.println(fileData);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void searchFile(String fileName) {
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("File found");
			System.out.println("Here are the contents of the file");
			readFile(fileName);
			
		}
		else {
			System.out.println("File doesnot exist");
		}
		
	}

	
	

	@Override
	public void deleteFile(String fileName) {
		
		boolean out = false;
		try {	
		 out = Files.deleteIfExists(Paths.get(fileName));
		
		}
		catch(NoSuchFileException e) {
			System.out.println("File doesnot exit");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		if(out == true) {
			System.out.println("File successfully deleted");
		}
		
		else {
			System.out.println("File not found");
		}
	}
	
	

}
