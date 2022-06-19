package methodsPrototype;
import java.util.*;

import java.io.*;


public class DeleteUser {
	

	public  void userDeleteMethod(){
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
        System.out.println("Enter the file name with extension you want to delete : ");
		
		String fileName = sc.nextLine();
		
		String path = ("E:\\"+fileName);
		
		File file = new File(path);
		
		if(file.exists()) {
		  file.delete();
		  System.out.println(fileName +" is deleted");
		}else
		{
			 System.out.println(fileName +" does not exists");
		}
		}catch (Exception e) {
			
			System.out.println("Try again ");
			
		}
		
		
		/*
		 * * Delete a user specified file from the existing directory list
		 * 
		 * You can add the case sensitivity on the file name in order to ensure that the
		 * right file is deleted from the directory list
		 * 
		 * 
		 * Return a message if FNF (File not found)
		 */
		
		
		
		
	}
	
	
	
	
}
