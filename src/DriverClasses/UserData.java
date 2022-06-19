package DriverClasses;

import java.util.*;


import methodsPrototype.*;
public class UserData {
	
	Scanner sc = new Scanner(System.in);
	
	AddUser a1 = new AddUser();
	DeleteUser d1 = new DeleteUser();
	SearchUser s1 = new SearchUser();
	DisplayFiles df = new DisplayFiles();
	
  //Code to display the welcome screen. It should display:
  //Application name and the developer details
  //The details of the user interface such as options displaying the user interaction information 
  //Features to accept the user input to select one of the options listed 
  //The first option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it
	public void loadMenu() {
		System.out.println("------------------------------------------| LOCKED.ME by @Company Lockers Pvt. Ltd. |------------------------------------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                           1. Press 1 to DISPLAY CURRENT FILES  ");
		System.out.println("                           2. Press 2 to ADD, DELETE AND SEARCH FILES ");
		System.out.println("                           3. Press 3 to EXIT  ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("------------------------------| DEVELOPED BY : TUSHAR YADAV || Contact: @ kumartusharyadav@gmail.com  |------------------------");
	    
		int inf=1;
		
		do {
			System.out.println("ENTER YOUR CHOICE :  ");
			int choice = sc.nextInt();
		 switch(choice) {
		 case 1: 
			df.displayUserFiles();
			 break;
		 case 2:
			 crudOperation();
			 break;
		 case 3:
			 System.exit(0);
			 break;
		 default:
			 System.out.println("Choose valid option");
		 }
		
			
			
	     }while(inf!=0);	
		
	}
	
	

	//Option to add a user specified file to the application
	//Option to delete a user specified file from the application
	//Option to search a user specified file from the application
    //Navigation option to close the current execution context and return to the main context
    //Option to close the application
	public void crudOperation() {
		
		int inf=2;
		
		do {
			System.out.println("Press 1 to ADD A USER FILE");
			System.out.println("Press 2 to DELETE USER SPECIFIED FILE");
			System.out.println("Press 3 to SEARCH FILE");
			System.out.println("Press 4 to BACK TO MAIN CONTEXT ");
			System.out.println("Press 5 to EXIT");
			
			System.out.println("ENTER YOUR CHOICE :  ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				a1.userMethodAdd();
				break;
			case 2:
				d1.userDeleteMethod();
				break;
			case 3:
			    s1.userSearchMethod();
			    break;
			case 4:
				loadMenu();
				break;
			case 5:
				System.exit(0);
                break;
			 default:
				 System.out.println("Choose valid option");
			}	
			
		}while(inf!=0);	
	 	
	}	

}
