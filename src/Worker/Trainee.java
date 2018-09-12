package Worker;

import java.text.ParseException;

public class Trainee extends Person{
//the following class is open for extension for the future
	
	private int NumberOfTrainee;

	public Trainee() throws ParseException{this.read();}

	
	public void setNumberOfTrainees(){
		
		for(int i=0;i<this.getDesignate().size();i++){
			if(this.getDesignate().get(i).trim().equals("Trainee")){
				this.NumberOfTrainee++;
			}
		}
	}
	
	public int getNumberOfTrainees(){
	return 	this.NumberOfTrainee;
	} 
}
