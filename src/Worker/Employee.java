package Worker;

import java.text.ParseException;

public class Employee extends Person{
//the following class is open for extension for the future
	
	private int NumberOfEmployee;

	public Employee() throws ParseException{this.read();}

	
	public void setNumberOfEmployees(){
		
		for(int i=0;i<this.getDesignate().size();i++){
			if(this.getDesignate().get(i).trim().equals("Employee")){
				this.NumberOfEmployee++;
			}
		}
	}
	
	public int getNumberOfEmployees(){
	return 	this.NumberOfEmployee;
	} 
}
