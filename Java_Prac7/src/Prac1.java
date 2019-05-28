
public class Prac1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Person";
		Person.age = 20;
		p.sleep();		
		System.out.println("");
		
		Student s = new Student();
		s.name = "Student";
		s.sleep();
		s.study();
		System.out.println("");
		
		StudentWorker sw = new StudentWorker();
		sw.name = "StudentWorker";
		sw.sleep();
		sw.study();
		sw.Work();
		System.out.println("");
		
		Researcher r = new Researcher();
		r.name = "Researcher";
		r.sleep();
		r.research();
		System.out.println("");
		
		Professor pr = new Professor();
		pr.name = "Professor";
		pr.sleep();
		pr.research();
		pr.teach();
		System.out.println("");
	}
}

class Person
{
	String name;
	static int age;
	
	public void speak()
	{
		System.out.println(name+"는"+age+"살이고 Speak.");
	}
	
	public void eat()
	{
		System.out.println(name+"는"+age+"살이고 Eat.");
	}
	
	public void walk()
	{
		System.out.println(name+"는"+age+"살이고 Walk.");
	}
	
	public void sleep()
	{
		System.out.println(name+"는"+age+"살이고 Sleep.");
	}
}

class Student extends Person
{
	public void study()
	{
		System.out.println(name+"는"+age+"살이고 Study.");
	}
}

class StudentWorker extends Student
{
	public void Work()
	{
		System.out.println(name+"는"+age+"살이고 Work.");
	}
}

class Researcher extends Person
{
	public void research()
	{
		System.out.println(name+"는"+age+"살이고 Research.");
	}
}

class Professor extends Researcher
{
	public void teach()
	{
		System.out.println(name+"는"+age+"살이고 Teach.");
	}
}