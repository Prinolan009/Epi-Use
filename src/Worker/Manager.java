package Worker;

import java.text.ParseException;

public class Manager extends Person{
	
	//the following class is open for extension for the future
	
	private int NumberOfManagers;

	public Manager() throws ParseException{this.read();}

	
	public void setNumberOfManagers(){
		
		for(int i=0;i<this.getDesignate().size();i++){
			if(this.getDesignate().get(i).trim().equals("Manager")){
				this.NumberOfManagers++;
			}
		}
	}
	
	public int getNumberOfManagers(){
	return 	this.NumberOfManagers;
	} 
}
