package OrganizationStructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Worker.Person;

public class StructureOfOrganization {
//Printing the organizational structure 
//Structure follows: Manager -> Employee -> Trainee
	
	
	public static Map<Integer, Person>emp;
	public Person node;
	String temp;
	
	
	public void print(Person P){
		
		//method assigns a rank according to the reportTo variable
		//Using this rank, it is possible to determine a general output
		//Manager reports to no one
		//Employee reports to manager
		//Some employees may report to a senior employee
		//All trainees report to employees
		ArrayList<Integer> rankList=new ArrayList<Integer>();

		for(int i=0;i<P.getDesignate().size();i++){
		
			 if(P.getReport().get(i).contains("NA")){
				 rankList.add(4);
			 }
			 if(P.getReport().get(i).contains("Manager")){
				 rankList.add(3);
			 }
			 if(P.getReport().get(i).contains("Employee")){
				 rankList.add(2);
			 }
			 if(P.getReport().get(i).contains("Employee") && P.getDesignate().contains("Trainee")){
				 rankList.add(1);
			 }
		}
		
		
		
		
		for(int i=0;i<P.getName().size();i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			if(rankList.get(i)==4){
			System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
			}
			if(rankList.get(i)==3){
				System.out.print("\t");
				System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
			}
			if(rankList.get(i)==2){
				System.out.print("\t\t");
				System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"\n|>");
				}
			if(rankList.get(i)==1){
				System.out.print("\t\t\t");
				System.out.print(P.getSurname().get(i)+":"+P.getDesignate().get(i)+"");
				}
		}
	}
	
	
	
	
	
	
	
	public void Print(Person P){
		ArrayList<Integer> rankList=new ArrayList<Integer>();
		ArrayList<String> Temp=new ArrayList<String>();
		
		
		for(int i=0;i<P.getDesignate().size();i++){
			if(P.getDesignate().get(i).contains("Manager")){
			//Temp.add(P.getName().get(i));
			rankList.add(P.getEmpNum().get(i));
			}
			if(P.getDesignate().get(i).contains("Employee")){
			//	Temp.add(P.getName().get(i));
				rankList.add(P.getEmpNum().get(i));
			}
			if(P.getDesignate().get(i).contains("Trainee")){
			//	Temp.add(P.getName().get(i));
				rankList.add(P.getEmpNum().get(i));
			}
			
			
		}
		
		ArrayList <Integer> num=new ArrayList<>();
		Iterator <String> itr=P.getName().iterator();
		int count=0;
		
	/*	while(count<P.getName().size()){
			//String val=itr.next();
			
			for(int i=0;i<count;i++){
				System.out.print("--");
			}
			System.out.print(" "+P.getName().get(count).);
		
		count++;
		}
		
		
		*/
		 /*for (int i = 0; i < P.getName().size(); i++) {
			this.temp=P.getName().iterator().next();
			String sp="--";
			// System.out.print(this.temp);
		      for (int j = 0; j < i; j++) {
		    	
		         System.out.print(sp);
		         
		      }
		    
		    System.out.println(sp.concat(this.temp));
		     
		 }//*/
		
		//Collections.sort(rankList);
		//Collections.reverse(rankList);
		/*int count=0;
		for(int i=0;i<P.getName().size();i++){
			
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			
			//if(P.getEmpNum().get(i)==rankList.get(i)){
				System.out.println(P.getName().get(i));
				
				//System.out.print(printSpacing(count,P.getName().get(i)));
			
			//}
			
		}
		*/
	}
	
	
	
	public String printSpacing(int level, String name){
		
		String tab="";
		for(int i=0;i<level;i++){
			tab=" ";
		}
		return name+tab;
		
		/*String spacing="";
		String dash="|\n|\n-->";
		for(int i=0;i<level;i++){
			spacing+="\t";
		}
		//return  spacing.concat(name)+spacing+"\n"+spacing+"|\n"+spacing+"|\n"+spacing+"-->" ;
		return "\n"+name+dash+spacing;*/
	}
	
}
