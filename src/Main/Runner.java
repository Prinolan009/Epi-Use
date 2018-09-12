package Main;

import java.text.ParseException;

import SortingAlgorithms.SortByDateOfBirth;
import Worker.Person;

public class Runner {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
Person p=new Person();
p.read();
SortByDateOfBirth sob=new SortByDateOfBirth();
sob.OptionsList();
sob.PrintList(p);
	}

}
