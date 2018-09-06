import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) throws ParseException {
		/*ReadFiles rf=new ReadFiles();
		rf.read();*/
		Person per=new Person();
		per.read();
		Sorting sort=new Sorting();
		SortByDOB SBD=new SortByDOB();
		//sort.FindPerson("Yurisha");
		 SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("02-12-2005");
		
		SBD.FindOlder(date1);
		
		
	}

}
