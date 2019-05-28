import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		ArrayList<Double> v = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println((i+1)+" ют╥б: ");
			v.add(sc.nextDouble());
		}
		
		Collections.sort(v);
		Collections.reverse(v);
		Iterator<Double> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
