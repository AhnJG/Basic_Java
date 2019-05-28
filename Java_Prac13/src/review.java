import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class Data
{
	String name;
	int age;
	Data(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class review {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Vector v2 = new Vector();
		
		v.add(45);
		v.add(47);
		v.add(49);
		v.add(43);
		v2.add(100);
		v2.add(3.14);
		v2.add("asd");
		
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("hello");
		
		Vector<Data> v3 = new Vector<Data>();
		v3.add(new Data("asd", 12));
		System.out.println(v3.get(0).name + v3.get(0).age);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		System.out.println(v2);
//		System.out.println(s.get(0));
	}

}
