import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	private String name; //�̸�
	private int num; //�й�
	private float score; //����
	
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
		//ArrayList�� 3���� �Է¹޾� ���
		ArrayList<Student> stu = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			String name;
			int num;
			float score;
			
			System.out.println("�̸�:");
			name = sc.next();
			
			System.out.println("�й�:");
			num = sc.nextInt();
			
			System.out.println("����:");
			score = sc.nextFloat();
			
			stu.add(new Student(name, num, score));
		}
		
		Iterator<Student> it = stu.iterator();
		float sum = 0, avg;
		
		while(it.hasNext())
		{
			Student tmp = it.next();
			System.out.println(tmp.getName() + "�� �й���" + tmp.getNum() + "�̰� ������ " + tmp.getScore() + "�̴�.");
			sum += tmp.getScore();
		}
		avg = sum / stu.size();
		System.out.println("���� ��� : " + avg);
	}

}
