package OrganizationStructure;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Worker.Employee;
import Worker.Manager;
import Worker.Person;
import Worker.Trainee;

public class StructureOfOrganization {
//Printing the organizational structure 
//Structure follows: Manager -> Employee -> Trainee
	
	
	public static Map<Integer, Person>emp;
	public Person node;
	String temp;
	public int maxRank;
	
	public void print(Person P) throws ParseException{
		Employee emp=new Employee();
		Manager man=new Manager();
		Trainee tra=new Trainee();
		
		emp.setNumberOfEmployees();man.setNumberOfManagers();tra.setNumberOfTrainees();
		System.out.println("The following is the organizational structure of the business\n");
		System.out.println("Staff include:");
		System.out.println("Manager(s):"+man.getNumberOfManagers());
		System.out.println("Employee(s):"+emp.getNumberOfEmployees());
		System.out.println("Trainee(s):"+tra.getNumberOfTrainees());
		System.out.println("");
		
		//method assigns a rank according to the reportTo variable
		//Using this rank, it is possible to determine a general output
		//Manager reports to no one
		//Employee reports to manager
		//Some employees may report to a senior employee
		//All trainees report to employees
		ArrayList<Integer> rankList=new ArrayList<Integer>();

		for(int i=0;i<P.getDesignate().size();i++){
		
			 if(P.getReport().get(i).trim().equals("NA")){
				 rankList.add(4);
				 maxRank= rankList.get(i);
			 }
			 if(P.getReport().get(i).trim().equals("Manager")){
				 rankList.add(3);
			 }
			 if(P.getReport().get(i).trim().equals("Employee") && P.getDesignate().get(i).trim().equals("Employee")){
				 rankList.add(2);
			 }
			 if(P.getReport().get(i).trim().equals("Employee") && P.getDesignate().get(i).trim().equals("Trainee")){
				 rankList.add(1);
			 }
		}
		
		
		
		
		for(int i=0;i<P.getName().size();i++){
			
			if(rankList.get(i)==4){
				spacing(maxRank,rankList.get(i));
				System.out.println(details(P,i));
			//System.out.print(P.getName().get(i).trim()+" "+P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
			}
			if(rankList.get(i)==3){
				spacing(maxRank,rankList.get(i));
				System.out.println(details(P,i));

				//System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
			}
			if(rankList.get(i)==2){
				spacing(maxRank,rankList.get(i));
				System.out.println(details(P,i));

				//System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
				}
			if(rankList.get(i)==1){
				//System.out.print("\t\t\t");
				spacing(maxRank,rankList.get(i));
				System.out.println(details(P,i));

				//System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"");
				}
		}
	}
	
	
	public String details(Person P, int i){
		return P.getName().get(i)+" "+P.getSurname().get(i)+":"+P.getDesignate().get(i)	;

	}
	
	public void spacing(int maxLevel, int rank){
		//use max level to indicate how many spaces should be left
		//for example: level 3 and max level is 4 so 4-3=1 therefore 1 tab space is left
		for(int i=0;i<(maxLevel-rank);i++){
			System.out.print("\t");
			if(i==((maxLevel-rank)-1)){
				System.out.print("|->");
			}
		}
	} 
	
	
	
	public void addRank(Person P){
		ArrayList<Integer> rankList=new ArrayList<Integer>();
		ArrayList<String> Temp=new ArrayList<String>();
		
		
		for(int i=0;i<P.getDesignate().size();i++){
			if(P.getDesignate().get(i).trim().equals("Manager")){
			//Temp.add(P.getName().get(i));
			rankList.add(P.getEmpNum().get(i));
			}
			if(P.getDesignate().get(i).trim().equals("Employee")){
			//	Temp.add(P.getName().get(i));
				rankList.add(P.getEmpNum().get(i));
			}
			if(P.getDesignate().get(i).trim().equals("Trainee")){
			//	Temp.add(P.getName().get(i));
				rankList.add(P.getEmpNum().get(i));
			}
			
			
		}
		
		ArrayList <Integer> num=new ArrayList<>();
		Iterator <String> itr=P.getName().iterator();
		int count=0;
	
	}
	
	
	
	
	
}
