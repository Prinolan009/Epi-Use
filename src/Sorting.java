import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sorting {

	public void FindPerson(String name) throws ParseException{
		//question 1 from assessment
		boolean found=false;
		name.toLowerCase();
		Person per=new Person();
		per.read("Workers.txt");
		
		int counter=0;
		/*for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}*/
		
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		for(int i=0;i<per.getName().size();i++){
			per.getName().get(i).toLowerCase();
			
			
			if(per.getName().get(i).contains(name)){//only one worker with the name
				found=true;
				System.out.println("\nName:\t\t\t"+per.getName().get(i));
				System.out.println("Surname:\t\t"+per.getSurname().get(i));
				System.out.println("DOB:\t\t\t"+format.format(per.getDOB().get(i)));
				System.out.println("Employee Num:\t\t"+per.getEmpNum().get(i));
				System.out.println("Salary:\t\t\t"+per.getSalary().get(i));
				System.out.println("Designation:\t\t"+per.getDesignate().get(i));
				System.out.println("Reports to:\t\t"+per.getReport().get(i));
				
			}
			//checks if more than 1 worker has the same name
			/*if( count>1){//more than  1 employee with the searched name
				System.out.println("More than 1 employee exists with that name, search by employee number");
				num=kb.nextInt();
				for(int j=0;j<per.getEmpNum().size();j++){
					if(per.getEmpNum().get(j).equals(num)){
						System.out.println("Name:\t\t\t"+per.getName().get(i));
						System.out.println("Surname:\t\t"+per.getSurname().get(i));
						System.out.println("DOB:\t\t\t"+format.format(per.getDOB().get(i)));
						System.out.println("Employee Num:\t\t"+per.getEmpNum().get(i));
						System.out.println("Salary:\t\t\t"+per.getSalary().get(i));
						System.out.println("Designation:\t\t"+per.getDesignate().get(i));
						System.out.println("Reports to:\t\t"+per.getReport().get(i));
					}
				}
				break;
			}*/
			
			if(found==false && i==(per.getName().size()-1)) {
				System.out.println("No employee found");
			}
			
		}//ends for loop I
		
	}//ends FindPerson
	// per.getDOB().forEach(action-> System.out.println("DOB:\t\t"+format.format(action)));
	/*Scanner kb=new Scanner(System.in);//used to take user input
	
	int num=0;
	int count=0;//used to check the amount of workers with the same name
	boolean found=false;
	Date date=new Date();*/
	//traverse through list to find name, if names are equal, return data relating to person
	
/*	for(int i=0;i<per.getName().size();i++){
		//checks if more than 1 person exists with the same name
		if(per.getName().get(i).equals(name)){
			
			count++;
		}
		
	}*/
}
