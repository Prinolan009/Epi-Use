package JUnitTests;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import FindingAlgorithms.FindBySalary;
import Worker.Person;

public class TestFindBySalaryCompareTo {

	@Test
	public void test() throws ParseException {
		Person p=new Person();
		p.read();
		FindBySalary fb=new FindBySalary();
		
		int output=fb.compareTo(p);
		assertEquals(1,output);
	}

}
