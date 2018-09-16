package SortingAlgorithms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Worker.Person;

public class SortByName {
private int choice;
private int num;
private int count;
private String name;

	public void MoreThanOneWorker(){
		Scanner kb=new Scanner(System.in);
		while(this.choice==0 || this.choice>2){
			if(this.count>1){
				System.out.println("More than 1 employee exists with that name");
				System.out.println("1) Display all workers with this name");
				System.out.println("2) Search by Employer ID");
				this.choice=kb.nextInt();
				
				if(this.choice==2){
					System.out.println("Enter worker ID");
					this.num=kb.nextInt();
				}
				//num=kb.nextInt();
				if(this.choice>3){
					System.out.println("Invalid entry");//makes user pick again if incorrect entry
				}
			}
		}
	}//ends option list
	
	
	public void FindPerson() throws ParseException{
	Scanner kb=new Scanner(System.in);
	
	//user inputs the name of the individual
	System.out.println("Please enter a workers first name");
	String name=kb.nextLine();
	
	
		boolean found=false;//is invoked when name is found
		
		//object creation
		Person per=new Person();
		per.read();
		
		boolean flag=false;
		String temp="";
		name=name.toLowerCase();//converts name to lowercase
		
		//checks if more than 1 employee exists with the same name
		for(int i=0;i<per.getName().size();i++){
			temp=per.getName().get(i);
			temp=temp.toLowerCase();
		
			if(name.equals(temp)){
				this.count++;//increments count when more than one employee exists with the name
			}
		}
		
		if(this.count>1){
			this.MoreThanOneWorker();//envokes method if more than one worker with the specified name
		}
		
		//SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		
		
		for(int i=0;i<per.getName().size();i++){
			temp=per.getName().get(i);//removes spacing
			temp=temp.toLowerCase();//converts to lower case
			//name=name.toLowerCase();//converts to lower case
			
			if(choice==1 || this.count==1){
			
			if(temp.equalsIgnoreCase(name) ){//only one worker with the name
				
				found=true;
				System.out.println(this.constructString(per,i));
				
			}
			}//ends choice ==1
			//checks if more than 1 worker has the same name
		
			if(choice==2){//more than  1 employee with the searched name
				
				
				for(int j=0;j<per.getEmpNum().size();j++){
					
					int id=per.getEmpNum().get(j);
				
					if(id==num){
						System.out.println(this.constructString(per, j));
						break;//terminates when worker is found
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
		
	}//ends find person method
	
	public String constructString(Person p,int i){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return p.toString(p.getName().get(i), p.getSurname().get(i), p.getDOB().get(i), p.getEmpNum().get(i), p.getSalary().get(i), p.getDesignate().get(i), p.getReport().get(i));
		/*return "\nName:\t\t\t"+p.getName().get(i)+"\nSurname:\t\t"+p.getSurname().get(i)+
				"\nDOB:\t\t\t"+sdf.format(p.getDOB().get(i))+"\nEmployee Num:\t\t"+p.getEmpNum().get(i)
				+"\nSalary:\t\t\t"+p.getSalary().get(i)+"\nDesignation:\t\t"+p.getDesignate().get(i)
				+"\nReports to:\t\t"+p.getReport().get(i)+	"\n---------------------------------------------------";*/
	}
	
	
}
