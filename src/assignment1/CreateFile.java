package assignment1;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile {
	
	protected static boolean create(String fileName) {
		Scanner sc=new Scanner(System.in);
		try {
			File f=new File(fileName);
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("File successfully created ");
				FileWriter fi=new FileWriter(f);
				System.out.println("Enter contents of the file");
				System.out.println("");
				String fileContent=sc.nextLine();
				fi.write(fileContent);
				fi.close();
				System.out.println("Content added successfully");
				return true;
				
			}
			else {
				return false;
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return false;
		}
		
		
		
	}
	
	
}
