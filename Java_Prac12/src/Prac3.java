import java.util.Iterator;
import java.util.Vector;
//Iterator 사용 이유 : https://invincure.tistory.com/entry/Iterator-%EC%97%90-%EB%8C%80%ED%95%B4%EC%84%9C
public class Prac3 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(5);
		v.add(4);
		
		Iterator <Integer> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext())
		{
			sum += it.next();
		}
		System.out.println(sum);
	}

}
