package SortingAlgorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Worker.Person;

//import Person;

public class SortByDateOfBirth{
	ArrayList<Integer>position =new ArrayList<Integer>();
	private int counter;
	private Date date;
	private int state;
	public SortByDateOfBirth(){
	Person p=new Person();	
		
	}
	
	public static boolean validate(String date){
	Date temp=new Date();
	boolean flag=false;
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    try {
	    	
	        temp=sdf.parse(date);
	        if(temp.getDay()<=31 && temp.getMonth()<=12 && temp.getYear()>0 && temp.getYear()<9999){
	        	flag= true;
	        }
	        
	    }
	    catch(ParseException ex) {
	        flag=false;
	    }
		return flag;
		
	}
	
	public void OptionsList() throws ParseException{
		Scanner kb=new Scanner(System.in);
		int choice=0;
		boolean valid=false;
		String temp="";
		
		//while(valid==false){
		while(validate(temp)==false){
		System.out.println("Enter date of birth: Format(dd-mm-yyyy)");
		temp=kb.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		if(validate(temp)==false){
			System.out.println("Incorrect format-Please input the date again");
		}
		else{
			this.date=sdf.parse(temp.trim());
		}
		
		}
	//sdf.setLenient(false);
		
		
		
		while(this.state==0 || this.state>3){
		System.out.println("Please select an option:\n1)After the date\n2)Before the date\n3)On the Date");
		this.state=kb.nextInt();
		if(this.state>3){
			System.out.println("Invalid entry please pick again");
		}
		}
		
		
	} 
	

	public void PrintList(Person p){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		for(int i=0;i<p.getDOB().size();i++){
			
			if(this.date.compareTo(p.getDOB().get(i))==0 && this.state==3){
			//dates are the same
				System.out.println(constructString(p,i));
			}
			if(this.date.after(p.getDOB().get(i)) && this.state==2 ){
				//Born before specified date
				System.out.println(constructString(p,i));
				}
			if(this.date.before(p.getDOB().get(i)) && this.state==1){
				//Born after specified date
				System.out.println(constructString(p,i));
				}
		}
	}
	
	public String constructString(Person p,int i){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return p.toString(p.getName().get(i), p.getSurname().get(i), p.getDOB().get(i), p.getEmpNum().get(i), p.getSalary().get(i), p.getDesignate().get(i), p.getReport().get(i));

		/*return "\nName:\t\t\t"+p.getName().get(i)+"\nSurname:\t\t"+p.getSurname().get(i)+
				"\nDOB:\t\t\t"+sdf.format(p.getDOB().get(i))+"\nEmployee Num:\t\t"+p.getEmpNum().get(i)
				+"\nSalary:\t\t\t"+p.getSalary().get(i)+"\nDesignation:\t\t"+p.getDesignate().get(i)
				+"\nReports to:\t\t"+p.getReport().get(i)+	"\n---------------------------------------------------";*/
	}
	
	
}