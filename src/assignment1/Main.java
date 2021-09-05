package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
//    private static ArrayList allFileNames=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to File Manager");
		System.out.println("Developed by Piyush Pranjal");
		
		int userInput=0;
		while(userInput!=3)
		{
			System.out.println("Enter 1 for listing Files");
			System.out.println("Enter 2 for Adding , Deleting and searching Files");
			System.out.println("Enter 3 for Exit");
			
			
			userInput=sc.nextInt(); 
			if(userInput == 1 || userInput == 2 || userInput == 3)
			{
				if(userInput ==1)
				{
					ListFile.list();
						
				}
				
				else if(userInput ==2){
					
					System.out.println("Enter 1 for Add File");
					System.out.println("Enter 2 for Search files");
					System.out.println("Enter 3 for Delete File");
					System.out.println("Enter 4 to go to the main menu");
					
					int userInputForFile=sc.nextInt();
					if(userInputForFile==1)
					{
						System.out.println("Enter File name");
						String fileName=sc.next();
						CreateFile.create(fileName);
						
					}
					else if(userInputForFile==2)
					{	
						System.out.println("Enter the file name to be searched");
						String fileName = sc.next();
						SearchFile.search(fileName);
						
					}
					else if(userInputForFile == 3){
						
						System.out.println("Enter File name to delete");
						String fileName = sc.next();
						DeleteFile.delete(fileName);
							
					}
					
					else if(userInputForFile == 4) {
					
						System.out.println("You have returned to the main menu");
					}
					
					else {
						System.out.println("Please enter valid input");
					}
					
				}
				else
				{
					System.out.println("You have successfully closed the application");	
				}
				
			}
			
			else
			{
				System.out.println("Please Enter Valid Input");
			}
			
			
		
			
		}
		
	

	}

}
