import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Person {
	ArrayList <String> name=new ArrayList<String>();
	ArrayList <String> surname=new ArrayList<String>();
	//ArrayList <Date> BDay=new ArrayList<Date>();
	ArrayList <Integer> EmpNum=new ArrayList<Integer>();
	ArrayList <Double> Salary=new ArrayList<Double>();
	public Person(){
		//empty constructor
	}
	public Person(ArrayList <String> name,ArrayList <String> surname, /*ArrayList <Date> BDay, */ArrayList <Integer> EmpNum, ArrayList <Double> Salary){
		this.name=name;
		this.surname=surname;
		//this.BDay=BDay;
		this.EmpNum=EmpNum;
		this.Salary=Salary;
	}
	
	//using a textfile to read information of individuals
	public void read(){
		try {
			Scanner contents=new Scanner(new FileReader("Workers.txt"));
			contents.useDelimiter("/");//Delimiter used to separate info of workers details
			while(contents.hasNext()){
				this.name.add(contents.next());
				this.surname.add(contents.next());
				//this.BDay.add(contents.next());
				this.EmpNum.add(contents.nextInt());
				this.Salary.add(contents.nextDouble());
			}
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}
		for(int i=0;i<1;i++){
			System.out.println(this.name.get(i));
			System.out.println(this.surname.get(i));
			System.out.println(this.EmpNum.get(i));
			System.out.println(this.Salary.get(i));
		}
	}
	
}
