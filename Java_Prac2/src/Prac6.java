import java.util.Scanner;

public class Prac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String month = sc.nextLine();
		String output = null;
		
		switch(month)
		{
		case "1��":
			output = "Jan";
			break;
		case "2��":
			output = "Feb";
			break;
		case "3��":
			output = "Mar";
			break;
		case "4��":
			output = "Apr";
			break;
		case "5��":
			output = "May";
			break;
		case "6��":
			output = "Jun";
			break;
		case "7��":
			output = "Jul";
			break;
		case "8��":
			output = "Aug";
			break;
		case "9��":
			output = "Sep";
			break;
		case "10��":
			output = "Oct";
			break;
		case "11��":
			output = "Nov";
			break;
		case "12��":
			output = "Dec";
			break;			
		}
		
		System.out.println(month+"�� "+output);
	}

}
