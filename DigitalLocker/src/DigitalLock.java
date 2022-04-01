import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitalLock extends LockerFiles {
	static Scanner sc = new Scanner(System.in);
	public int option;
	LockerFiles lockerFileObj = new LockerFiles();
	public static void main(String[] args) {
		System.out.println("_______________________________________________");
		System.out.println("\n\n");
		System.out.println("***********Welcome To Digital Locker*********");
		System.out.println("\n\n");
		System.out.println("_______________________________________________");
		System.out.println("\n\n");
		System.out.println("------MADHIVADHANI RAJAKUMAR ------");
		
		
		System.out.println("Please provide the passcode to access the locker ");
		System.out.println();
		
		int passcode = sc.nextInt();
		
		if(passcode==12345) {
			System.out.println("\n\n");
			System.out.println("Verified");
			DigitalLock dl = new DigitalLock();
			dl.menu();
		}
		else {
			System.out.println("\n\n");
			System.out.println("Sorry! Verification Fails......");
		}
		
	}
	public void menu() {
		int input = 0;
		do {
		System.out.println("\n\n");
		System.out.println("Please select from the following file options:");
		System.out.println("\n\n");
		System.out.println("************OPERATION MENU************");
		System.out.println("\n\n");
		System.out.println("\t\t"+"1.CREATE NEW FILE"+"\n");
		System.out.println("\t\t"+"2.VIEW FILES LIST"+"\n");
		System.out.println("\t\t"+"3.DELETE EXISTING  FILE"+"\n");
		System.out.println("\t\t"+"4.SEARCH FILE"+"\n");
		System.out.println("\t\t"+"5.EXIT"+"\n");
		try {
		 option = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Provide Valid Input");
		}
		switch(option) {
		case 1:
			System.out.println("\t\t"+"FILE CREATION"+"\n");
			System.out.println("Please Provide the file name to create a new file :");
			String filename = sc.next();
			if(filename.contains(".")) {
				System.out.println("Invalide File name");
			}
			else {
				lockerFileObj.createFile(filename);
			}
			break;
		case 2:
			
			lockerFileObj.listingFile();
			break;
		case 3:
			System.out.println("Enter File name to Delete");
			String dfile = sc.next();
			lockerFileObj.removeFile(dfile);
			break;
			
		case 4:
			
			System.out.println("Enter File name to search");
			String name = sc.next();
			lockerFileObj.searchFile(name);
			break;
		case 5:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default : 
			System.out.println("Invalid Selection");
			break;
			
		}
		System.out.println("\n"+"Press 1 to continue"+"\n"+"Press 0 to exit");
		try{
			input = sc.nextInt();
			if(input!=1) {
				System.out.println("Thank You");
				System.exit(0);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Provide Valid Input");
		}
		
		
		}while(input==1);
		
	}
}
