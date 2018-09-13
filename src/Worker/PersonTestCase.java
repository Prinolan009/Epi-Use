package Worker;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class PersonTestCase {

	@Test
	public void test() throws ParseException {
		Person p=new Person();
		p.read();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String output=p.toString("John", "Smith", sdf.parse("31-01-1994"), 8, 700000, "Manager", "NA");
		assertEquals("\nName:\t\t\t"+p.getName().get(0)+"\nSurname:\t\t"+p.getSurname().get(0)+
				"\nDOB:\t\t\t"+sdf.format(p.getDOB().get(0))+"\nEmployee Num:\t\t"+p.getEmpNum().get(0)
				+"\nSalary:\t\t\t"+p.getSalary().get(0)+"\nDesignation:\t\t"+p.getDesignate().get(0)
				+"\nReports to:\t\t"+p.getReport().get(0)+	"\n---------------------------------------------------",output);
		/*String output=p.toString(p.getName().get(0), p.getSurname().get(0), p.getDOB().get(0), p.getEmpNum().get(0), p.getSalary().get(0), p.getDesignate().get(0), p.getReport().get(0));
		assertEquals("John",output);*/
		/*assertEquals("\nName:\t\t\t"+"John"+"\nSurname:\t\t"+"Smith"+
				"\nDOB:\t\t\t"+sdf.format("31-01-1994")+"\nEmployee Num:\t\t"+8
				+"\nSalary:\t\t\t"+700000+"\nDesignation:\t\t"+"Manager"
				+"\nReports to:\t\t"+"NA"+	"\n---------------------------------------------------",output);*/
	}

}
