import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		Student st[] = new Student[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<st.length; i++)
		{
			System.out.println("�̸�: ");
			String name = sc.next();
			
			System.out.println("����");
			int kor = sc.nextInt();
			
			System.out.println("����");
			int math = sc.nextInt();
			
			System.out.println("����");
			int eng = sc.nextInt();
			
			st[i] = new Student(name, kor, math, eng);
		}
		
		for(int i=0; i<st.length; i++)
		{
			st[i].show();
		}
	}

}

class Student
{
	String name, grade;
	int kor, math, eng;
	
	Student(String name, int kor, int math, int eng)
	{
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void show()
	{
		System.out.println(name+"�� ����� : "+kor+" ���м��� : "+math+" ����� : "+eng);
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		System.out.println("������ ������ �� : "+sum);
		System.out.println("������ ��� : "+avg);
		
		if(avg>=90)
		{
			grade = "A";
		}
		else if(avg>=80)
		{
			grade = "B";
		}
		else if(avg>=70)
		{
			grade = "C";
		}
		else if(avg>=60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		System.out.println("���: "+grade);
	}
}
