import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) { // 시험!!
		Calendar now = Calendar.getInstance(); // PC의 시간을 가져옮
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DAY_OF_MONTH);
		int h = now.get(Calendar.HOUR_OF_DAY); // 24시간 기준, HOUR -> 0~11
		int mi = now.get(Calendar.MINUTE);
		int s = now.get(Calendar.SECOND);
		
		System.out.println(y+"년");
		System.out.println(m+"월");
		System.out.println(d+"일");
		System.out.println(h+"시");
		System.out.println(mi+"분");
		System.out.println(s+"초");
		
		Calendar me = Calendar.getInstance();
		me.set(1998, 5, 30);
		//나이 구하기
		System.out.println("나의 나이는"+(now.get(Calendar.YEAR) - me.get(Calendar.YEAR) + 1) + "살");
		
		//4시~12시 : 굿모닝, 12~18시 : 굿애프터눈, 18~22 : 굿이브닝, 22~4 : 굿나잇
		int nowHour = now.get(Calendar.HOUR_OF_DAY);
		if(nowHour >= 4 && nowHour<12)
		{
			System.out.println("Good Morning");
		}
		else if(nowHour>=12 && nowHour<18)
		{
			System.out.println("Good Afternoon");
		}
		else if(nowHour>=18 && nowHour<22)
		{
			System.out.println("Good Evening");
		}
		else if(nowHour>=22 && nowHour<4)
		{
			System.out.println("Good Night");
		}
		
		//StringToKennizer, 문장 입력 : we are the world
		//we
		//are
		//the
		//world
		//단어수 : 
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("단어수 : "+st.countTokens()); // 현재 남은 토큰의 갯수, nextToken으로 출력하고 나면 사라진다.
		int count=0;
		while(st.hasMoreTokens())
		{ 
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("단어수 : "+count);
		
	}

}
