package JUnitTests;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import FindingAlgorithms.FindBySalary;
import Worker.Person;

public class TestFindBySalaryPersonDetails {

	@Test
	public void test() throws ParseException {
		Person P=new Person();
		P.read();
		FindBySalary fb=new FindBySalary();
		String output=fb.PersonDetails(0);
		assertEquals(P.getDesignate().get(0)+":"+P.getName().get(0)+" "+P.getSurname().get(0)+" "+"-"+" "+"R"+P.getSalary().get(0)
,output);
		
		
	}

}
