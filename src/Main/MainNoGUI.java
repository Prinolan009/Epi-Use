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
			
			//objects
			SortByName sbn=new SortByName();
			SortByDateOfBirth birth=new SortByDateOfBirth();
			StructureOfOrganization soo=new StructureOfOrganization();
			FindBySalary fbs=new FindBySalary();
			Person p=new Person();
			p.read();
			switch(menu()){
			case 1:sbn.FindPerson(); returnToMenu();
			case 2:birth.OptionsList();birth.PrintList(p);returnToMenu();
			case 3:soo.print(p); returnToMenu();
			case 4:fbs.printList();returnToMenu();
		
			default:{
				System.out.println("Error");
			}
			}
		
		}

		public static void returnToMenu(){
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
		
		
		public static int menu(){
			int choice=0;
			kb=new Scanner(System.in);
			while(choice>4 || choice==0){
			System.out.println("Enter a number corresponding to the question you wish to run");
			System.out.println("1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n");
			choice=kb.nextInt();
			
			if(choice==0 || choice>4){
				System.out.println("Please input an appropriate number\n");
			}
			
			}
			return choice;
		}
	

}
