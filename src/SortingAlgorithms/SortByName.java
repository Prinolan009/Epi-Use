package SortingAlgorithms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Worker.Person;

public class SortByName {
//aaa
	public void FindPerson(String name) throws ParseException{
		//question 1 from assessment
		boolean found=false;
		//name=name.toLowerCase();
		
		Person per=new Person();
		per.read();
		Scanner kb=new Scanner(System.in);
		int counter=0;
		int choice=0;
		boolean flag=false;
		/*for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}*/
		int count=0;
		String temp="";
		int num=0;
		//checks if more than 1 employee exists with the same name
		for(int i=0;i<per.getName().size();i++){
			temp=per.getName().get(i).trim();
			temp=temp.toLowerCase();
			name=name.toLowerCase();
			if(name.equals(temp)){
				count++;
			}
		}
		
		System.out.println(count);
		while(choice==0 || choice>2){
			if(count>1){
				System.out.println("More than 1 employee exists with that name");
				System.out.println("1) Display all workers with the name: "+name);
				System.out.println("2) Search by Employer ID");
				choice=kb.nextInt();
				
				if(choice==2){
					System.out.println("Enter worker ID");
					num=kb.nextInt();
				}
				//num=kb.nextInt();
				if(choice>3){
					System.out.println("Invalid entry");
				}
			}
		}
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		
		
		for(int i=0;i<per.getName().size();i++){
			temp=per.getName().get(i).trim();//removes spacing
			temp=temp.toLowerCase();//converts to lower case
			name=name.toLowerCase();//converts to lower case
			
			if(choice==1){
			
			if(temp.equals(name) ){//only one worker with the name
				found=true;
				System.out.println("\nName:\t\t\t"+per.getName().get(i));
				System.out.println("Surname:\t\t"+per.getSurname().get(i));
				System.out.println("DOB:\t\t\t"+format.format(per.getDOB().get(i)));
				System.out.println("Employee Num:\t\t"+per.getEmpNum().get(i));
				System.out.println("Salary:\t\t\t"+per.getSalary().get(i));
				System.out.println("Designation:\t\t"+per.getDesignate().get(i));
				System.out.println("Reports to:\t\t"+per.getReport().get(i));
				System.out.println("----------------------------------------------------------");
			}
			}//ends choice ==1
			//checks if more than 1 worker has the same name
			
			if(choice==2){//more than  1 employee with the searched name
				
				
				for(int j=0;j<per.getEmpNum().size();j++){
					//System.out.println("num"+num);
					int id=per.getEmpNum().get(j);
				//	System.out.println("emp"+id);
					if(id==num){
						System.out.println("Name:\t\t\t"+per.getName().get(j));
						System.out.println("Surname:\t\t"+per.getSurname().get(j));
						System.out.println("DOB:\t\t\t"+format.format(per.getDOB().get(j)));
						System.out.println("Employee Num:\t\t"+per.getEmpNum().get(j));
						System.out.println("Salary:\t\t\t"+per.getSalary().get(j));
						System.out.println("Designation:\t\t"+per.getDesignate().get(j));
						System.out.println("Reports to:\t\t"+per.getReport().get(j));
						//flag=true;
						break;
					}
					if(flag==false){
						System.out.println("No employee found with the ID: "+num);
					}
				}//ends employee number for loop
				break;
			}
			
			if(found==false && i==(per.getName().size()-1)) {
				System.out.println("No employee found");
			}
			
		}//ends for loop I
		
	}//ends FindPerson
	// per.getDOB().forEach(action-> System.out.println("DOB:\t\t"+format.format(action)));
	/*Scanner kb=new Scanner(System.in);//used to take user input
	
	int num=0;
	int count=0;//used to check the amount of workers with the same name
	boolean found=false;
	Date date=new Date();*/
	//traverse through list to find name, if names are equal, return data relating to person
	
/*	for(int i=0;i<per.getName().size();i++){
		//checks if more than 1 person exists with the same name
		if(per.getName().get(i).equals(name)){
			
			count++;
		}
		
	}*/
}
