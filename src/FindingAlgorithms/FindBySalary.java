package FindingAlgorithms;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import Worker.Person;

public class FindBySalary implements Comparable <Person>{

	private String name, surname, position;
	private double salary;
	private int len,item;
	private ArrayList<Integer>EmpArr=new ArrayList<Integer>();
	private ArrayList<Double>temp=new ArrayList<Double>();
	Person P=new Person();
	
	public FindBySalary() throws ParseException{
		P.read();
	}
	@Override
	public int compareTo(Person per) {
		// TODO Auto-generated method stub
		
		/*Use the salary amount and compare the value to the arraylist by iteration*/
		/*compare method works also if there exist two individuals with the same salary as the highest*/
		int num=0;
		num= Double.compare(per.getSalary().iterator().next(),this.salary);
		return num;
	}

	public ArrayList<Double> ArrangeList(String pos){
		ArrayList <Double> T=new ArrayList<>();
		
		for(int i=0;i<P.getSalary().size();i++){
			if(P.getDesignate().get(i).equals(pos)){
				T.add(P.getSalary().get(i));
			}
		}
		Collections.sort(T);//sorts the list in ascending order
		Collections.reverse(T);//reverses the list so the hightest value is first
		
		
		return T;//return T with the highest value listed as first
	}
	
	
	public void ConstructList(String position){

		this.salary=this.ArrangeList( position).get(0);//salary gets set to the highest value from the list (the first value)
		
		//condition if size in tier=1
		if(this.ArrangeList(position).size()==1){
			for(int i=0;i<P.getSalary().size();i++){//traverse through all employees salaries
				
				if(		P.getDesignate().get(i).contains(position) //if the value contains the desired position
						&& P.getSalary().get(i)==this.salary )		//salary among workers is the highest 
				{
					System.out.println(this.PersonDetails(i));

				}
			}
		}//ends condition 1
		
		//condition 2: More than one employee in the tier
		else if(this.ArrangeList( position).size()>1){
		for(int i=0;i<P.getSalary().size();i++){//traverse through all employees salaries
			
			if(		P.getDesignate().get(i).contains(position) //if the value contains the desired position
					&&P.getSalary().get(i)==this.salary 		//salary among workers is the highest 
					&& this.compareTo(P)==1 					//implies the value is the highest
					|| this.compareTo(P)==0)					//used incase more than one worker recieves the highest pay per tier
			{
				
				System.out.println(this.PersonDetails(i));
			}
		}
		}//ends condition 2
		
		System.out.println("--------------------------------------------------------");
	}
	
	public void printList(){
	System.out.println("The following list displays the hightest paid workers per tier\n");
	String Man="Manager";
	String Emp="Employee";
	String Tra="Trainee";
	
	ConstructList(Man);
	ConstructList(Emp);
	ConstructList(Tra);
	}
	
	public String PersonDetails(int i){
		return P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)+" "+"-"+" "+"R"+P.getSalary().get(i);
	
	}
	
	
}


