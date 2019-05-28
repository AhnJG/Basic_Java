import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	private String name; //이름
	private int num; //학번
	private float score; //학점
	
	Student(String name, int num, float score) 
	{
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public float getScore()
	{
		return score;
	}
}

public class Prac2 {

	public static void main(String[] args) {
		//ArrayList로 3명을 입력받아 출력
		ArrayList<Student> stu = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			String name;
			int num;
			float score;
			
			System.out.println("이름:");
			name = sc.next();
			
			System.out.println("학번:");
			num = sc.nextInt();
			
			System.out.println("학점:");
			score = sc.nextFloat();
			
			stu.add(new Student(name, num, score));
		}
		
		Iterator<Student> it = stu.iterator();
		float sum = 0, avg;
		
		while(it.hasNext())
		{
			Student tmp = it.next();
			System.out.println(tmp.getName() + "의 학번은" + tmp.getNum() + "이고 학점은 " + tmp.getScore() + "이다.");
			sum += tmp.getScore();
		}
		avg = sum / stu.size();
		System.out.println("학점 평균 : " + avg);
	}

}
