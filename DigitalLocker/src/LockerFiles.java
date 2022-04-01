import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockerFiles {
	File directory = new File("C://Users//Admin//DigitalLocker");
	List<String> list = new ArrayList<>();
	public String[] files = directory.list();
	
	public LockerFiles() {
		// TODO Auto-generated constructor stub
		File folder = new File("C://Users//Admin//DigitalLocker");
		File[] ls = folder.listFiles();
		
		
		for(File f : ls) {
			list.add(f.getName());			
		}
	}
	
	
	public void createFile(String filename) {
		
		File file = new File("C://Users//Admin//DigitalLocker//" +filename+".txt" );
		try {
			if(file.createNewFile()) {
				list.add(filename+".txt");
				System.out.println("************File Created Successfully****************");
				
			}
			else if(file.exists()) {
				System.out.println("************File Already Exists****************");
			}
			else {
				System.out.println("************File Not Created****************");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void searchFile(String filename) {
		if(list==null) {
			System.out.println("Locker is Empty");
		}
		else if(list.contains(filename)||list.contains(filename+".txt") ) {
			System.out.println("File Found");
		}
		else {
			System.out.println("File not found");
		}
		
	}
	
	public void removeFile(String filename) {
		
		if(list.contains(filename)) {
			boolean flag;
			System.out.println("Do you want to delete "+ filename);
			System.out.println("Press Y for YES or N for NO");
			Scanner sc = new Scanner(System.in);
			char op = sc.next().charAt(0);
			if(op=='Y'||op=='y') {
			File f = new File("C://Users//Admin//DigitalLocker//"+filename);
			flag=f.delete();
			if(flag) {
				list.remove(filename);
				System.out.println("File Deleted Successfully ");
			}
			else {
				System.out.println("Unable to Delete the file");
			}
			}
			else if(op=='N'||op=='n') {
				System.out.println("File Not Deleted");
			}
			else {
				System.out.println("Invalid Input");
			}
			
		}
		else {
			System.out.println("File Not Found");
		}
		
		}
		
		
	public void listingFile() {
		System.out.println("*********FILE LIST***********");
		System.out.println("\n\n");
		Collections.sort(list);
		
		for(String s:list) {
			System.out.println(s);
		}
		
	}
	
}

