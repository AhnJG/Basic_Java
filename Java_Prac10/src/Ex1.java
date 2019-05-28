
public class Ex1 {

	public String toString()
	{
		return "안녕어엉";
	}
	
	public static void main(String[] args) {
		Ex1 a = new Ex1();
		System.out.println("클래스 명 : " + a.getClass());
		System.out.println("해시코드 Ex1: " + a.hashCode());
		System.out.println("이름 : " + a.toString()); 
		
		Ex2 b = new Ex2();
		System.out.println("\n클래스 명 : " + b.getClass());
		System.out.println("해시코드 Ex2: " + b.hashCode());
		System.out.println("이름 : " + b.toString()); 
		
		
	}

}

class Ex2
{
	
}