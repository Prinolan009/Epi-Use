import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import Worker.Person;

public class Run {

	public static void main(String[] args) throws ParseException {
		Scanner kb=new Scanner(System.in);
		Person per=new Person();
		per.read("Workers.txt");
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		 /* Date date1=format.parse("31-01-1994");
		  SortByDateOfBirth dob=new SortByDateOfBirth(date1);
		  dob.compareTo(per, 3);
		  dob.PrintList(per, 0);*/
		SortByName sbn=new SortByName();
		sbn.FindPerson("John");
	
	}

}
