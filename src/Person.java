import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Person {
	ArrayList <String> name=new ArrayList<String>();
	ArrayList <String> surname=new ArrayList<String>();
	ArrayList <Date> BDay=new ArrayList<>();
	ArrayList <Integer> EmpNum=new ArrayList<Integer>();
	ArrayList <Double> Salary=new ArrayList<Double>();
	ArrayList <String> Designate=new ArrayList<String>();
	ArrayList <String> Report=new ArrayList<String>();
	public Person(){
		//empty constructor
	}
	public Person(ArrayList <String> name,ArrayList <String> surname, ArrayList <Date> BDay, ArrayList <Integer> EmpNum, ArrayList <Double> Salary, ArrayList <String> Designate, ArrayList <String> Report){
		this.name=name;
		this.surname=surname;
		this.BDay=BDay;
		this.EmpNum=EmpNum;
		this.Salary=Salary;
		this.Designate=Designate;
		this.Report=Report;
		
	}
	
	//using a textfile to read information of individuals
	public void read()throws ParseException{
		Date dat=new Date();
		int day, month, year;
		 SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("02-12-2001");
		  Date date2=format.parse("12-09-1999");
		  Date date3=format.parse("13-11-2016");
		  Date date4=format.parse("13-11-2016");
		  
		  this.BDay.add(date1);
		  this.BDay.add(date2);
		  this.BDay.add(date3);
		  this.BDay.add(date4);
		
		this.name.add("Prinolan");
		this.name.add("Yurisha");
		this.name.add("Neelesh");
		this.name.add("Prinolan");
		
		this.surname.add("Govender");
		this.surname.add("Goorun");
		this.surname.add("Rambally");
		this.surname.add("Pillay");
		
		
		
		
		this.EmpNum.add(1);
		this.EmpNum.add(2);
		this.EmpNum.add(3);
		this.EmpNum.add(4);
		
		this.Salary.add((double) 25000);
		this.Salary.add((double) 25000);
		this.Salary.add((double) 25000);
		this.Salary.add((double) 25000);
		
		this.Designate.add("Trainee");
		this.Designate.add("Boss");
		this.Designate.add("Boss");
		this.Designate.add("Trainee");
		
		this.Report.add("boss");
		this.Report.add("boss");
		this.Report.add("boss");
		this.Report.add("boss");
		
		/*try {
			Scanner contents=new Scanner(new FileReader("Workers.txt"));
			contents.useDelimiter("/");//Delimiter used to separate info of workers details
			while(contents.hasNext()){
				this.name.add(contents.next());
				this.surname.add(contents.next());
				//this.BDay.add(contents.);
				this.EmpNum.add(Integer.parseInt(contents.next()));
				this.Salary.add(Double.parseDouble(contents.next()));
				this.Designate.add(contents.next());
				this.Report.add(contents.next());
			}
			contents.close();
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}*/
		/*for(int i=0;i<2;i++){
			System.out.println(this.name.get(i));
			System.out.println(this.surname.get(i));
			System.out.println(this.EmpNum.get(i));
			System.out.println(this.Salary.get(i));
			System.out.println(this.Designate.get(i));
			System.out.println(this.Report.get(i));
			
		}*/
		
	}//ends read method
	public ArrayList getName(){return this.name;}
	public ArrayList getSurname(){return this.surname;}
	public ArrayList getDOB(){return this.BDay;}
	public ArrayList getEmpNum(){return this.EmpNum;}
	public ArrayList getSalary(){return this.Salary;}
	public ArrayList getDesignate(){return this.Designate;}
	public ArrayList getReport(){return this.Report;}

}
