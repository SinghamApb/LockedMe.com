package methodsPrototype;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;



public class DisplayFiles {
	

	public void displayUserFiles() {
		
		try{
		
		String path = ("E:\\");
		
		File file = new File(path);
		
		File fileList[] = file.listFiles();
		
	
		Arrays.sort(fileList);
		
		for(File f : fileList) 
		{
			if(f.isFile()) {
				System.out.println(" File : " + f.getName());
				
			}
		}
		}catch(Exception e) {
			System.out.println(" Something went wrong!");
		}
		
	}

}
