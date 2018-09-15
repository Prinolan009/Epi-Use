package Main;

import java.text.ParseException;

import SortingAlgorithms.SortByDateOfBirth;
import Worker.Person;

public class RunFindByDateOfBirth {

	public static void main(String[] args) throws ParseException {
		System.out.println("Question 2");
		Person p=new Person();
		p.read();
		
		SortByDateOfBirth sb=new SortByDateOfBirth();
		sb.OptionsList();sb.PrintList(p);

	}

}
