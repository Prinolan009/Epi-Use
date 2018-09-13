package JUnitTests;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import OrganizationStructure.StructureOfOrganization;
import Worker.Person;

public class TestStructureOfOrganizationPersonDetails {

	@Test
	public void test() throws ParseException {
		//obtains persons detals at position 0
		Person p=new Person();
		p.read();
		StructureOfOrganization o=new StructureOfOrganization();
		String output=o.details(p, 0);
		assertEquals(p.getName().get(0)+" "+p.getSurname().get(0)+":"+p.getDesignate().get(0),output);
	}

}
