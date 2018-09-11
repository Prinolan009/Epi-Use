package Main;

import java.text.ParseException;

import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import Worker.Person;

public class Run {

	public static void main(String[] args) throws ParseException {
		Person per=new Person();
		per.read("Workers.txt");
		/*SortByName sbn=new SortByName();
		sbn.FindPerson("john");*/
//System.out.println("Hi");
		SortByDateOfBirth s=new SortByDateOfBirth();
		s.OptionsList();
		//s.PrintList(, i);
		
	}

}
