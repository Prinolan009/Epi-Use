package JUnitTests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.Test;

import FindingAlgorithms.FindBySalary;
import Worker.Person;

public class TestFindBySalaryArrangeList {

	@Test
	public void test() throws ParseException {
		Person p=new Person();
		p.read();
		FindBySalary fb=new FindBySalary();
		double val=0;
		ArrayList<Double>output=new ArrayList<Double>();
		output=fb.ArrangeList("Manager");
		assertEquals(p.getSalary().get(0),output.get(0));
	}

}
