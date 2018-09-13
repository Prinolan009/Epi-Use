package SortingAlgorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Worker.Person;

//import Person;

public class SortByDateOfBirth implements Comparable <Person>{
	ArrayList<Integer>position =new ArrayList<Integer>();
	private int counter;
	private Date date;
	private int state;
	public SortByDateOfBirth(){
		
		
	}
	public void OptionsList() throws ParseException{
		Scanner kb=new Scanner(System.in);
		int choice=0;
		boolean valid=false;
		String temp="";
		
		//while(valid==false){
		System.out.println("Enter date of birth: Format(dd-mm-yyyy)");
		temp=kb.nextLine();
		
		
		
		//}
		//convert string to date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		this.date=sdf.parse(temp);
		
		
		while(this.state==0 || this.state>3){
		System.out.println("Please select an option:\n1)Before the date\n2)After the date\n3)On the Date");
		this.state=kb.nextInt();
		if(this.state>3){
			System.out.println("Invalid entry please pick again");
		}
		}
		
		
	} 
	
	public int compareTo(Person p) {
		/*Method will allow the user to check for people born before, after and on the specified dates*/
		int res=0;
		
		//State1=Before
		//State2=After
		//State3=On the date
		
		
		for(int i=0;i<p.getDOB().size();i++){
			if(p.getDOB().get(i).compareTo(this.date)<0 && this.state==1){
				//PrintList(p,i);
				this.counter++;
				this.position.add(i);
				res=1;
			}
			else if(p.getDOB().get(i).compareTo(this.date)>0 && this.state==2){
				//PrintList(p,i);
				this.counter++;
				this.position.add(i);
				res=2;
			}
			else if(p.getDOB().get(i).compareTo(this.date)==0 && this.state==3){
				//PrintList(p,i);
				this.counter++;
				this.position.add(i);
				res=0;
			}
		}
		
		return res;
		
	}
	
	public void PrintList(Person p){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(this.counter);
		for(int i=0;i<this.counter;i++){
				if(this.compareTo(p)==0){
					System.out.println("Name:\t\t\t"+p.getName().get(i-1));
					System.out.println("Surname:\t\t"+p.getSurname().get(i-1));
					System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB().get(i-1)));
					System.out.println("Employee Num:\t\t"+p.getEmpNum().get(i-1));
					System.out.println("Salary:\t\t\t"+p.getSalary().get(i-1));
					System.out.println("Designation:\t\t"+p.getDesignate().get(i-1));
					System.out.println("Reports to:\t\t"+p.getReport().get(i-1));
					System.out.println("---------------------------------------------------");
				}	
		}
		
	}

/*
public void PrintList(Person p){
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	 for(int i=0;i<this.position.size();i++){
	System.out.println("Name:\t\t\t"+p.getName().get(this.position.get(i)));
	System.out.println("Surname:\t\t"+p.getSurname().get(this.position.get(i)));
	System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB().get(this.position.get(i))));
	System.out.println("Employee Num:\t\t"+p.getEmpNum().get(this.position.get(i)));
	System.out.println("Salary:\t\t\t"+p.getSalary().get(this.position.get(i)));
	System.out.println("Designation:\t\t"+p.getDesignate().get(this.position.get(i)));
	System.out.println("Reports to:\t\t"+p.getReport().get(this.position.get(i)));
	System.out.println("---------------------------------------------------");
	 }
	  
}
	
*/
	
}