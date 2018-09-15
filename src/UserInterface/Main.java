package UserInterface;

import java.text.ParseException;

import FindingAlgorithms.FindBySalary;
import OrganizationStructure.StructureOfOrganization;
import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import Worker.Person;

public class Main {
	public void selection(int choice) throws ParseException{
		SortByName sbn=new SortByName();
		SortByDateOfBirth birth=new SortByDateOfBirth();
		StructureOfOrganization soo=new StructureOfOrganization();
		FindBySalary fbs=new FindBySalary();
		Person p=new Person();
		p.read();
		switch(choice){
		case 1:sbn.FindPerson(); returnToMenu();
		case 2:birth.OptionsList();birth.PrintList(p);returnToMenu();
		case 3:soo.print(p); returnToMenu();
		case 4:fbs.printList();returnToMenu();
		}
	}
	
	public void returnToMenu(){
		
	}
}
