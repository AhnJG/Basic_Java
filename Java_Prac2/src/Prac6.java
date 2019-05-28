import java.util.Scanner;

public class Prac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String month = sc.nextLine();
		String output = null;
		
		switch(month)
		{
		case "1월":
			output = "Jan";
			break;
		case "2월":
			output = "Feb";
			break;
		case "3월":
			output = "Mar";
			break;
		case "4월":
			output = "Apr";
			break;
		case "5월":
			output = "May";
			break;
		case "6월":
			output = "Jun";
			break;
		case "7월":
			output = "Jul";
			break;
		case "8월":
			output = "Aug";
			break;
		case "9월":
			output = "Sep";
			break;
		case "10월":
			output = "Oct";
			break;
		case "11월":
			output = "Nov";
			break;
		case "12월":
			output = "Dec";
			break;			
		}
		
		System.out.println(month+"은 "+output);
	}

}
