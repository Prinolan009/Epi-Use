import java.text.ParseException;
import java.util.ArrayList;

import Worker.Person;

public class OrganizationStructure {
//question 3
	public void PrintStructure(Person p){
		int rank=0;
		int SpaceCount=0;
		for(int i=0;i<p.getReport().size();i++){
		switch(p.getReport().get(i)){
		
			case "NA": rank=3;//implies manager
			break;
			case "Employee":rank=2;//employee
			break;
			case "Trainee":rank=1;//trainee
			break;
		}//ends switch
		
		if(rank==3){
			System.out.println(p.getName().get(i)+" "+p.getSurname().get(i)+" "+"("+p.getDesignate().get(i)+")");
			System.out.println(level(SpaceCount));
			SpaceCount++;
			
		}
		if(rank==2){
			System.out.println(p.getName().get(i)+" "+p.getSurname().get(i)+" "+"("+p.getDesignate().get(i)+")");
			System.out.println(level(SpaceCount));
			SpaceCount++;
			
		}
		if(rank==3){
			System.out.println(p.getName().get(i)+" "+p.getSurname().get(i)+" "+"("+p.getDesignate().get(i)+")");
			System.out.println(level(SpaceCount));
			SpaceCount++;
			
		}
		
		}//ends for loop
	}
	
	
	public String level(int num){
		String spacing="";
		for(int i=0;i<num;i++){
			spacing+="\t";
		}
		
		return spacing+"|\n"+spacing+"|\n"+spacing+"-->";
	}
	
	
}
