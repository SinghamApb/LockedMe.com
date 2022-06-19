package methodsPrototype;
import java.util.*;
import java.io.*;


public class AddUser {
	
	
 public void userMethodAdd() {
	
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the file name with extension : ");
	try {
		String fileName = sc.nextLine();
		
		String path = ("E:\\"+fileName);
		
		System.out.println(path);
		File file = new File(path);
		
	
			
			boolean flag =file.createNewFile();
			if(flag) {
				System.out.println("File is succesfully created ");
			}else {
				System.out.println("File is already exists");
			}
			
		}catch(Exception e)
		{
			
			System.out.print("Please check and try again");
		}
	
		
 }

		
	
  
}
