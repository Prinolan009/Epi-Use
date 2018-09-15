package Main;

import java.text.ParseException;
import java.util.Scanner;

import FindingAlgorithms.FindBySalary;
import OrganizationStructure.StructureOfOrganization;
import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import UserInterface.GUI;
import Worker.Person;

public class Run {
private static Scanner kb;




	public static void main(String[] args) throws ParseException {
		
		//objects
	
		SortByName sbn=new SortByName();
		
		
		SortByDateOfBirth birth=new SortByDateOfBirth();
		StructureOfOrganization soo=new StructureOfOrganization();
		FindBySalary fbs=new FindBySalary();
		Person p=new Person();
		p.read();
		
		
		
		
	/*	boolean flag1,flag2,flag3,flag4;
		flag1=flag2=flag3=flag4=false;
		//Obselete
		GUI g=new GUI();
		g.initialize();
		System.out.println(g.getSelection());
		if(g.getSelection()==1){
			GUI gQ2=new GUI();
			sbn.FindPerson();
		}*/
		
	/*	if(g2.getSelection()==2){
			GUI gQ2=new GUI(2);
			birth.OptionsList();birth.PrintList(p);
		}*/
		
	/*	if(g.getSelection()==2){
		birth.OptionsList();birth.PrintList(p);
		}*/
		/*g.setSelection(comboBox);
		switch(g.getSelection()){
		case 1:sbn.FindPerson(); 
		case 2:birth.OptionsList();birth.PrintList(p);
		case 3:soo.print(p);
		case 4:fbs.printList();
		}*/
	
	}

	public  static void choiceOne(int num) throws ParseException{
		Person p=new Person();
		p.read();
		GUI g=new GUI();
		num=g.getSelection();
		SortByName sbn=new SortByName();
		SortByDateOfBirth birth=new SortByDateOfBirth();
		
		if(num==1){	sbn.FindPerson();}
		if(num==2){birth.OptionsList();birth.PrintList(p);}
		
	}
	/*public  static void choiceTwo(int num) throws ParseException{
		Person p=new Person();
		p.read();
		
		
		
	}*/
	
	/*public static void returnToMenu(){
		int choice=0;
		kb=new Scanner(System.in);
		
		while(choice==0 || choice>2){
			System.out.println("Would you like to return to the main menu?\n1)Yes\n2)No, Exit system");
			choice=kb.nextInt();
				if(choice==0 || choice>2){
					System.out.println("Error:Please input an appropriate number");
				}
				if(choice==1){
					choice=0;
					//menu();
				}
				if(choice==2){
					System.out.println("----------Thank you----------");
					System.exit(0);
				}
		}
	}
	*/
	/*
	public static int menu(){
		int choice=0;
		kb=new Scanner(System.in);
		while(choice>4 || choice==0){
		System.out.println("Enter a number corresponding to the question you wish to run");
		System.out.println("1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n");
		choice=kb.nextInt();
		
		if(choice==0 || choice>4){
			System.out.println("Error please input an appropriate number\n");
		}
		
		}
		return choice;
	}*/
}

class ch{
	public static void main(int i) throws ParseException{
		System.out.println("Question 1");
		Person p=new Person();
		p.read();
		SortByName sbn=new SortByName();
		sbn.FindPerson();
	}
}
