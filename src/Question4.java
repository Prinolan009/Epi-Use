import java.util.ArrayList;
import java.util.Collections;

public class Question4 implements Comparable <Person>{

	private String name, surname, position;
	private double salary;
	private int len,item;
	private ArrayList<Integer>EmpArr=new ArrayList<Integer>();
	private ArrayList<Double>temp=new ArrayList<Double>();
	
	@Override
	public int compareTo(Person per) {
		// TODO Auto-generated method stub
		
		/*Use the salary amount and compare the value to the arraylist by iteration*/
		/*compare method works also if there exist two individuals with the same salary as the highest*/
		int num=0;
		num= Double.compare( per.getSalary().iterator().next(),this.salary);
		return num;
	}

	public ArrayList<Double> ArrangeList(Person P, String pos){
		ArrayList <Double> T=new ArrayList<>();
		
		for(int i=0;i<P.getSalary().size();i++){
			if(P.getDesignate().get(i).contains(pos)){
				T.add(P.getSalary().get(i));
			}
		}
		Collections.sort(T);//sorts the list in ascending order
		Collections.reverse(T);//reverses the list so the hightest value is first
		
		
		return T;//return T with the highest value listed as first
	}
	
	
	public void printList(Person P){
		String Man="Manager";
		String Emp="Employee";
		String Tra="Trainee";
		this.salary=this.ArrangeList(P, "Tra").get(0);//salary gets set to the highest value from the list (the first value)
		
		//condition if size in tier=1
		if(this.ArrangeList(P, "Manager").size()==1){
			for(int i=0;i<P.getSalary().size();i++){//traverse through all employees salaries
				
				if(		P.getDesignate().get(i).contains("Manager") //if the value contains the desired position
						&& P.getSalary().get(i)==this.salary )		//salary among workers is the highest 
				{
					System.out.println(P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)
										+" "+"-"+" "+"R"+P.getSalary().get(i));
				}
			}
		}//ends condition 1
		
		
		/*System.out.println(this.salary);
		System.out.println(this.compareTo(P));*/
		
		//condition 2: More than one employee in the tier
		if(this.ArrangeList(P, "Tra").size()>1){
		for(int i=0;i<P.getSalary().size();i++){//traverse through all employees salaries
			
			if(		P.getDesignate().get(i).contains("Tra") //if the value contains the desired position
					&&P.getSalary().get(i)==this.salary 		//salary among workers is the highest 
					&& this.compareTo(P)==1 					//implies the value is the highest
					|| this.compareTo(P)==0)					//used incase more than one worker recieves the highest pay per tier
			{
				
				System.out.println(P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)+" "+"-"+" "+"R"+P.getSalary().get(i));
			}
		}
		}//ends condition 2
		/*System.out.println("--------------------------------------------------------");
		this.salary=this.ArrangeList(P, "Employee").get(0);//salary gets set to the highest value from the list (the first value)
		
		for(int i=0;i<P.getSalary().size();i++){				//traverse through all employees salaries
			if(		P.getDesignate().get(i).contains("Employee") //if the value contains the desired position
					&&P.getSalary().get(i)==this.salary 		//salary among workers is the highest 
					&& this.compareTo(P)==1 					//implies the value is the highest
					|| this.compareTo(P)==0)					//used incase more than one worker recieves the highest pay per tier
			{
				
				System.out.println(P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)+" "+"-"+" "+"R"+P.getSalary().get(i));
			}
		}
		System.out.println("--------------------------------------------------------");
		this.salary=this.ArrangeList(P, "Trainee").get(0);//salary gets set to the highest value from the list (the first value)
		
		for(int i=0;i<P.getSalary().size();i++){				//traverse through all employees salaries
			if(		P.getDesignate().get(i).contains("Trainee") //if the value contains the desired position
					&&P.getSalary().get(i)==this.salary 		//salary among workers is the highest 
					&& this.compareTo(P)==1 					//implies the value is the highest
					|| this.compareTo(P)==0)					//used incase more than one worker recieves the highest pay per tier
			{
				
				System.out.println(P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)+" "+"-"+" "+"R"+P.getSalary().get(i));
			}
		}
		*/
		//this.salary=this.temp.get(0);
		//System.out.println(this.compareTo(P));
		}
	
	/*for(int i=0;i<P.getSalary().size();i++){
	if(P.getDesignate().get(i).contains("Employee") && this.salary==this.ArrangeList(P, "Employee").get(0)){
		System.out.println(P.getDesignate().get(i)+":"+P.getName().get(i)+" "+P.getSurname().get(i)+" "+"-"+" "+"R"+P.getSalary().get(i));
	}
}*/
	
}
