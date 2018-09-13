package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import SortingAlgorithms.SortByDateOfBirth;
import Worker.Person;

public class Runner {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.read();
		
		
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		  Date d1=sdf.parse("31-01-1994");
		  SortByDateOfBirth sob=new SortByDateOfBirth();
		  sob.OptionsList();
			sob.PrintList(p);
		/*Date d1=sdf.parse("31-01-1994");
		Date d2=sdf.parse("29-01-1994");//before==1
		System.out.println(d1.compareTo(d2));*/
	}

}
