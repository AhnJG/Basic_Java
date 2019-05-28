
public class Ex3 {

	public static void main(String[] args) {
		String a = "12";
		int b = Integer.parseInt(a); // 문자를 정수로 변환
		System.out.println("2진수로 변환: "+Integer.toBinaryString(b)); //2진수로 변환
		System.out.println("2진수로 변환: "+Integer.toOctalString(b)); //8진수로 변환
		System.out.println("2진수로 변환: "+Integer.toHexString(b)); //16진수로 변환
		
		int c[] = {12,44,23,63,54,57,86,67,96,50};
		int i;
		for(i=0; i<c.length; i++)
		{
			System.out.println(c[i]+"를 2진수로 변환합니다. -> "+Integer.toBinaryString(c[i]));
			System.out.println(c[i]+"를 8진수로 변환합니다. -> "+Integer.toOctalString(c[i]));
			System.out.println(c[i]+"를 16진수로 변환합니다. -> "+Integer.toHexString(c[i]));
			System.out.println();
		}
		
		char d[] = {'e', 'T', '5', ' ', '@', 'g'};
		for(i=0; i<d.length; i++)
		{
			if(Character.isLowerCase(d[i]) && Character.isAlphabetic(d[i])) // 소문자
				System.out.println(d[i] + "는 알파벳 소문자");
			if(Character.isUpperCase(d[i]) && Character.isAlphabetic(d[i])) // 대문자
				System.out.println(d[i] + "는 알파벳 대문자");
			if(Character.isDigit(d[i])) // 숫자
				System.out.println(d[i] + "는 숫자"); 
			if(Character.isWhitespace(d[i])) // 공백
				System.out.println(d[i] + "는 공백");
			if(!Character.isAlphabetic(d[i]) && !Character.isDigit(d[i]) && !Character.isWhitespace(d[i])) // 특수문자
				System.out.println(d[i] + "는 특수문자");
			
			
		}
		
	}

}
