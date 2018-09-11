package SortingAlgorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Worker.Person;

//import Person;

public class SortByDateOfBirth {

	ArrayList<Integer>position =new ArrayList<Integer>();
	public Date date;
	public SortByDateOfBirth(Date date){
		this.date=date;
		
	}
	public void compareTo(Person p, int state) {
		/*Method will allow the user to check for people born before, after and on the specified dates*/
		int res=0;
		//State1=Before
		//State2=After
		//State3=On the date
		
		//Person per=new Person();
		for(int i=0;i<p.getDOB().size();i++){
			if(p.getDOB().get(i).compareTo(this.date)<0 && state==1){
				
				this.PrintList(p,i);
				
			}
			else if(p.getDOB().get(i).compareTo(this.date)>0 && state==2){
				this.PrintList(p,i);
			
			}
			else if(p.getDOB().get(i).compareTo(this.date)==0 && state==3){
				this.PrintList(p,i);
				
			}
		}
		
		
		
	}


public void PrintList(Person p,int i){
	System.out.println("HHHHH");
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	System.out.print("Name:\t\t\t"+p.getName().get(i));
	System.out.println("Surname:\t\t"+p.getSurname().get(i));
	System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB().get(i)));
	System.out.println("Employee Num:\t\t"+p.getEmpNum().get(i));
	System.out.println("Salary:\t\t\t"+p.getSalary().get(i));
	System.out.println("Designation:\t\t"+p.getDesignate().get(i));
	System.out.println("Reports to:\t\t"+p.getReport().get(i));
	//System.out.println("---------------------------------------------------");
}
	

	
}
	/*
	public int compareTo( Person p) throws ParseException {
		ArrayList<Date>ArrDate=new ArrayList<Date>();
	    ArrDate=p.getDOB();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		int num=0;
		
		for(int i=0;i<ArrDate.size();i++){
				if(this.date.compareTo(p.getDOB().get(i))>0){
					num=1;
					System.out.println("Workers older than: "+sdf.format(this.date));
				
					System.out.println("Name:\t\t\t"+p.getName().get(i));
					System.out.println("Surname:\t\t"+p.getSurname().get(i));
					System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB().get(i)));
					System.out.println("Employee Num:\t\t"+p.getEmpNum().get(i));
					System.out.println("Salary:\t\t\t"+p.getSalary().get(i));
					System.out.println("Designation:\t\t"+p.getDesignate().get(i));
					System.out.println("Reports to:\t\t"+p.getReport().get(i));
					System.out.println("---------------------------------------------------");
				}
		}
		System.out.println(num);
		return num;
		
	}

	public void printList() throws ParseException{
		Person p=new Person();
		p.read("Workers.txt");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	
		if(this.compareTo(p)==1){
			/*System.out.println("Name:\t\t\t"+p.getName());
			System.out.println("Surname:\t\t"+p.getSurname());
			System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB()));
			System.out.println("Employee Num:\t\t"+p.getEmpNum());
			System.out.println("Salary:\t\t\t"+p.getSalary());
			System.out.println("Designation:\t\t"+p.getDesignate());
			System.out.println("Reports to:\t\t"+p.getReport());
			System.out.println("---------------------------------------------------");*/
	
	
	/*System.out.println("Name:\t\t\t"+p.getName().get(i));
	System.out.println("Surname:\t\t"+p.getSurname().get(i));
	System.out.println("DOB:\t\t\t"+sdf.format(p.getDOB().get(i)));
	System.out.println("Employee Num:\t\t"+p.getEmpNum().get(i));
	System.out.println("Salary:\t\t\t"+p.getSalary().get(i));
	System.out.println("Designation:\t\t"+p.getDesignate().get(i));
	System.out.println("Reports to:\t\t"+p.getReport().get(i));
	System.out.println("---------------------------------------------------");*/
//class is used to display workers that are older than the specified date
//Question 2
	
	/*public void FindOlder(Date input) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Person per=new Person();
		per.read("Workers.txt");
		
		for(int i=0;i<per.getDOB().size();i++){
			if(input.compareTo((Date) per.getDOB().get(i))>0){//older than the specified date
				System.out.println("Name:\t\t\t"+per.getName().get(i));
				System.out.println("Surname:\t\t"+per.getSurname().get(i));
				System.out.println("DOB:\t\t\t"+sdf.format(per.getDOB().get(i)));
				System.out.println("Employee Num:\t\t"+per.getEmpNum().get(i));
				System.out.println("Salary:\t\t\t"+per.getSalary().get(i));
				System.out.println("Designation:\t\t"+per.getDesignate().get(i));
				System.out.println("Reports to:\t\t"+per.getReport().get(i));
				System.out.println("---------------------------------------------------");
			}	
			
		}
		
	}*/
	
	
	


