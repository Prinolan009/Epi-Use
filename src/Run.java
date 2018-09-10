import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) throws ParseException {
		OrganizationStructure O=new OrganizationStructure();
		Person per=new Person();
		per.read("Workers.txt");
		//O.PrintStructure(per);
		Question4 q4=new Question4();
		q4.printList(per);
		/*
		per.read("Workers.txt");
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("31-01-1994");
		SortByDOB sob=new SortByDOB(date1);
		sob.compareTo(per,3);
		*/
		
		//SortByDOB SBD=new SortByDOB();
		/*
		 SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("02-12-2005");
		
		SBD.FindOlder(date1);*/
		
		/*OrganizationStructure O=new OrganizationStructure();
		O.PrintStructure();*/
		
	}

}
