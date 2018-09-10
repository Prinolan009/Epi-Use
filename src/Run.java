import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) throws ParseException {
		Scanner kb=new Scanner(System.in);
		Person per=new Person();
		per.read("Workers.txt");
		System.out.println("Enter a number: \n1)Question 1\n2)Question 2\n3)Question 3\n4)Question 4");
		int choice=kb.nextInt();
		
		if(choice==1){
			Sorting sort=new Sorting();
			sort.FindPerson("Jane");
		}
		if(choice==2){
			
			SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
			  Date date1=format.parse("31-01-1994");
			SortByDOB sob=new SortByDOB(date1);
			sob.compareTo(per,3);
		}
		
		if(choice==3){
			//still working on it
		}
		if(choice==4){
			Question4 qu=new Question4();
			qu.printList(per);
		}
	/*	OrganizationStructure O=new OrganizationStructure();
		Person per=new Person();
		per.read("Workers.txt");
		//O.PrintStructure(per);
		Question4 q4=new Question4();
		q4.printList(per);*/
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
