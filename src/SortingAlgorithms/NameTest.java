package SortingAlgorithms;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import Worker.Person;

public class NameTest {
//John/Smith/31-01-1994/8/700000/Manager/NA/
	@Test
	public void test() throws ParseException {
		SortByName name=new SortByName();
		Person p=new Person();
		p.read();
		String output=name.constructString(p, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		assertEquals("\nName:\t\t\t"+p.getName().get(0)+"\nSurname:\t\t"+p.getSurname().get(0)+
				"\nDOB:\t\t\t"+sdf.format(p.getDOB().get(0))+"\nEmployee Num:\t\t"+p.getEmpNum().get(0)
				+"\nSalary:\t\t\t"+p.getSalary().get(0)+"\nDesignation:\t\t"+p.getDesignate().get(0)
				+"\nReports to:\t\t"+p.getReport().get(0)+	"\n---------------------------------------------------",output);
	}

}
