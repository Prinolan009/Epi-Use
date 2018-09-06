import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SortByDOB {
//class is used to display workers that are older than the specified date
//Question 2
	
	public void FindOlder(Date input) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Person per=new Person();
		per.read();
		
		for(int i=0;i<per.getDOB().size();i++){
			if(input.compareTo((Date) per.getDOB().get(i))>0){//older than the specified date
				System.out.println("Name:\t\t\t"+per.getName().get(i));
				System.out.println("Surname:\t\t"+per.getSurname().get(i));
				System.out.println("DOB:\t\t\t"+sdf.format(per.getDOB().get(i)));
				System.out.println("Employee Num:\t\t"+per.getEmpNum().get(i));
				System.out.println("Salary:\t\t\t"+per.getSalary().get(i));
				System.out.println("Designation:\t\t"+per.getDesignate().get(i));
				System.out.println("Reports to:\t\t"+per.getReport().get(i));
				System.out.println("---------------------------------------------------");
			}	
			
		}
		
	}
}
