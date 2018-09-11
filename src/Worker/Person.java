package Worker;
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
	
	//using a textfile to read information of individuals
	public void read(String filename) throws ParseException{
	
		try {
			Scanner contents=new Scanner(new FileReader(filename));
			SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
			contents.useDelimiter("/");//Delimiter used to separate info of workers details
			//Date d=new Date();
			while(contents.hasNext()){
				this.name.add(contents.next());
				this.surname.add(contents.next());
				this.BDay.add(format.parse(contents.next()));
				this.EmpNum.add(Integer.parseInt(contents.next()));
				this.Salary.add(Double.parseDouble(contents.next()));
				this.Designate.add(contents.next());
				this.Report.add(contents.next());
			}
			contents.close();
			} catch (FileNotFoundException e) {
			System.out.println("Error");
				e.printStackTrace();
			}
	
		
	}//ends read method
	public ArrayList<String> getName(){return this.name;}
	public ArrayList<String> getSurname(){return this.surname;}
	public ArrayList<Date> getDOB(){return this.BDay;}
	public ArrayList<Integer> getEmpNum(){return this.EmpNum;}
	public ArrayList<Double> getSalary(){return this.Salary;}
	public ArrayList<String> getDesignate(){return this.Designate;}
	public ArrayList<String> getReport(){return this.Report;}

}

