import java.util.ArrayList;
import java.util.Vector;

public class Prac1 {

	public static void main(String[] args) {
//		Vector <Integer> v = new Vector<>();
//		Vector <String> s = new Vector<>();
//		Vector <Double> d = new Vector<>();
//		
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		
//		
//		s.add("asd");
//		d.add(4.5);
//		
//		System.out.println(v);
//		System.out.println("크기:"+v.size());
//		System.out.println("용량:"+v.capacity());
//		v.remove(3);
//		System.out.println(v);
//		v.remove(1);
//		System.out.println(v);
//		
//		ArrayList <Integer> ar = new ArrayList<>();
//		ar.add(0);
//		ar.add(9);
//		System.out.println(ar);
//		System.out.println(ar.get(1));
		
		ArrayList <String> st = new ArrayList<>();
		st.add("대한민국");
		st.add("미국");
		st.add(1, "일본");
		st.add("호주");
		st.add("캐나다");
		System.out.println(st);
		
		for(int i=0; i<st.size(); i++)
		{
			System.out.println(st.get(i));
		}
		
		for(String t: st)
		{
			System.out.println(t);
		}

		int rand = (int)(Math.random() * st.size());
		System.out.println("가고싶은 나라는? "+st.get(rand));
		
	}

}
