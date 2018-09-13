package Worker;

import java.text.ParseException;

public class Manager extends Person{
	
	//the following class is open for extension for the future
	
	private int NumberOfManagers;
	private int NumberOfSubordinates;
	public Manager() throws ParseException{this.read();}

	
	public void setNumberOfSubordinates(){
		for(int i=0;i<this.getDesignate().size();i++){
			if(this.getReport().get(i).trim().equals("Manager")){
				this.NumberOfSubordinates++;
			}
		}
	}
	
	public void setNumberOfManagers(){
		//sets the number of managers within the company
		for(int i=0;i<this.getDesignate().size();i++){
			if(this.getDesignate().get(i).trim().equals("Manager")){
				this.NumberOfManagers++;
			}
		}
	}
	
	public int getNumberOfManagers(){
		return 	this.NumberOfManagers;
	} 
	public int getNumberOfSubordinates(){
		return 	this.NumberOfSubordinates;
		} 
}
