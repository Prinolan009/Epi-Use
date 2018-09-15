package Main;

import java.text.ParseException;

import OrganizationStructure.StructureOfOrganization;
import Worker.Person;

public class RunOrganizationalStructure {
	public static void main(String[] args) throws ParseException {
		System.out.println("Question 3");
		Person p=new Person();
		p.read();
		
		StructureOfOrganization so=new StructureOfOrganization();
		so.print(p);
	}
}
