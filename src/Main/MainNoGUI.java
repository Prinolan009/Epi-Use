package Main;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import FindingAlgorithms.FindBySalary;
import OrganizationStructure.StructureOfOrganization;
import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import Worker.Person;

public class MainNoGUI {

	
		private static Scanner kb;
		public static void main(String[] args) throws ParseException {
			menu();
		}

		public static void returnToMenu() throws ParseException{
			int choice=0;
			kb=new Scanner(System.in);
			
			while(choice==0 || choice>2){
				System.out.println("Would you like to return to the main menu?\n1)Yes\n2)No, Exit system\n");
				choice=kb.nextInt();
					if(choice==0 || choice>2){
						System.out.println("Error:Please input an appropriate number\n");
					}
					if(choice==1){
						//choice=0;
						menu();
					}
					if(choice==2){
						System.out.println("----------Thank you----------");
						System.exit(0);
					}
			}
		}
		
		
		public static void menu() throws ParseException{
			int choice=0;
			SortByName sbn=new SortByName();
			SortByDateOfBirth birth=new SortByDateOfBirth();
			StructureOfOrganization soo=new StructureOfOrganization();
			FindBySalary fbs=new FindBySalary();
			Person p=new Person();
			p.read();
			kb=new Scanner(System.in);
			
			
			
			
			System.out.println("Enter a number corresponding to the question you wish to run");
			System.out.println("1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n5) Exit");
			choice=kb.nextInt();
			
			switch(choice){
			case 1:sbn.FindPerson(); returnToMenu();
			case 2:birth.OptionsList();birth.PrintList(p);returnToMenu();
			case 3:soo.print(p); returnToMenu();
			case 4:fbs.printList();returnToMenu();
			case 5:System.out.println("----------Thank you----------");System.exit(0);
			default:{
				System.out.println("Error-Please input an appropriate number\n");
			}
			}
			
		
			
		}
	

}