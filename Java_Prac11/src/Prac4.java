class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Student extends Person
{
	int score;
	
	Student(String name, int age, int score)
	{
		super(name, age);
		this.score = score;
	}
	
	void info()
	{
		System.out.println(name + " " + age + " " + score);
	}
}

class Rs extends Person
{
	int pay;
	Rs(String name, int age, int pay)
	{
		super(name, age);
		this.pay = pay;
	}
	
	void info()
	{
		System.out.println(name + " " + age + " " + pay);
	}
	
}

public class Prac4 {

	public static void main(String[] args) {
		Student s = new Student("a", 10, 100);
		s.info();
		Rs r = new Rs("a", 10, 1000000);
		r.info();
	}

}
