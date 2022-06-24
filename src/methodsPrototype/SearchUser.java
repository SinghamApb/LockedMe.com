package methodsPrototype;
import java.io.File;
import java.util.Arrays;
import java.util.*;

public class SearchUser {

	
	public void userSearchMethod() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the File Name to search : ");
		String fileName = sc.nextLine();
		
		try {
        String path = ("E:\\");
		File file = new File(path);
		File fileList[] = file.listFiles();
		
		boolean isAvailable = false;
		for(File f : fileList) 
		{
			if(f.getName().equals(fileName)) {
				System.out.println(" File : " + f.getName() + " is available ");
				isAvailable = true;
				
			}

			
	
      	}
	     if(isAvailable == false){
			System.out.println("File not availabe ");
		}
	  }catch(Exception e) {
		  
		  System.out.println("Something went wronge try again");
		  
	  }
		
		
	
		 
		 
			/*
			 * * Search a user specified file from the main directory
			 * 
			 * You can add the case sensitivity on the file name to retrieve the correct
			 * file
			 * 
			 * Display the result upon successful operation
			 * 
			 * Display the result upon unsuccessful operation
			 */
	}
}
