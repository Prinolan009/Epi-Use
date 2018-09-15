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
	//throws ParseException
	//using a textfile to read information of individuals
	public void read() throws ParseException {
	String filename="Workers.txt";
		try {
			Scanner contents=new Scanner(new FileReader(filename));
			SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
			contents.useDelimiter("/");//Delimiter used to separate info of workers details
			//Date d=new Date();
			while(contents.hasNext()){
				this.name.add(contents.next().trim());
				this.surname.add(contents.next().trim());
				this.BDay.add(format.parse(contents.next()));
				this.EmpNum.add(Integer.parseInt(contents.next()));
				this.Salary.add(this.round(Double.parseDouble(contents.next()), 2));
				this.Designate.add(contents.next().trim());
				this.Report.add(contents.next().trim());
			}
			contents.close();
			} catch (FileNotFoundException e) {
			System.out.println("Error");
				e.printStackTrace();
			}
	
		
	}//ends read method
	
	//return methods
	public ArrayList<String> getName(){return this.name;}
	public ArrayList<String> getSurname(){return this.surname;}
	public ArrayList<Date> getDOB(){return this.BDay;}
	public ArrayList<Integer> getEmpNum(){return this.EmpNum;}
	public ArrayList<Double> getSalary(){return this.Salary;}
	public ArrayList<String> getDesignate(){return this.Designate;}
	public ArrayList<String> getReport(){return this.Report;}

	public String toString(String name, String surname, Date dob, int num, double sal, String designate, String reportTo){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "\nName:\t\t\t"+name+"\nSurname:\t\t"+surname+
				"\nDOB:\t\t\t"+sdf.format(dob)+"\nEmployee Num:\t\t"+num
				+"\nSalary:\t\t\t"+sal+"\nDesignation:\t\t"+designate
				+"\nReports to:\t\t"+reportTo+	"\n---------------------------------------------------";
	}
	
	public double round(double value, int places){
		//used to round double values to 2 decimal places
		if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}

