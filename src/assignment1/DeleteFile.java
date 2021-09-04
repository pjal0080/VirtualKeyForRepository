package assignment1;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

class DeleteFile {
	
	protected static void delete(String fileName) throws IOException {
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
