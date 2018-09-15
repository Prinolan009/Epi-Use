package Main;

import java.text.ParseException;

import SortingAlgorithms.SortByName;
import Worker.Person;

public class RunFindByName {

	public static void main(String[] args) throws ParseException {
		System.out.println("Question 1");
		Person p=new Person();
		p.read();
		SortByName sbn=new SortByName();
		sbn.FindPerson();
	}

}
