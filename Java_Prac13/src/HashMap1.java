import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashMap1 {

	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>(); // ��ĳ����
		HashSet	<String> s = new HashSet<String>(); // �ߺ�x
		s.add("1");
		s.add("3");
		s.add("1");
		s.add("2");
		s.add("��");
		s.add("��");
		s.add("��");
		s.add("��");
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		TreeSet<String> s2 = new TreeSet<String>(); // Ʈ������, �ڵ� ����, �ߺ� x
		s2.add("1");
		s2.add("2");
		s2.add("4");
		s2.add("3");
		s2.add("3");
		
		Iterator<String> it2 = s2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		HashMap<Integer, String> m = new HashMap<>(); // Ű �ߺ� x
		m.put(1, "a");
		m.put(2, "b");
		m.put(2, "a");
		m.put(3, "d");
		System.out.println(m);
		
		Set<Integer> keys = m.keySet();
		Iterator<Integer> it3 = keys.iterator();
		while(it3.hasNext())
		{
			Integer key = it3.next();
			String v = m.get(key);
			System.out.println(key + " " +v);
		}
		
		System.out.println(m.get(2));
	}

}
