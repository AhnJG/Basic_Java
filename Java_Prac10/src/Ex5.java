import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) { // 시험!!!
		StringBuffer a = new StringBuffer("apple");
		System.out.println(a);
		
		System.out.println(a.append(" Banana"));
		System.out.println(a.append(" Banana")); // 뒤에 추가
		a.insert(5, " Orange"); // 중간에 추가
		System.out.println(a);
		
		a.replace(3,  4,  "try"); // 변경 3~5를 지우고 try 추가
		System.out.println(a);
		
		a.delete(3, 5); // 삭제 3~4 지우기
		System.out.println(a);
		
		//import java.util.StringTokenizer; 필요하다
		StringTokenizer st = new StringTokenizer("서울/호서/사이버/해킹/보안과", "/"); // 문자열을 기호에 따라 나눈다 
		while(st.hasMoreTokens()) // 토큰이 존재?
		{
			System.out.println(st.nextToken()); // 다음 토큰 출력
		}
	}

}
