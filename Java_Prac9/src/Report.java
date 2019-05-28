import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model, manufacturers; // �𵨸�, ������
		int speed, price, gas; // ����ӵ�, ����, ����⸧��
		
		boolean programOn = true; // ���α׷� ����
		while(programOn)
		{
			System.out.println("1. �ڰ���");
			System.out.println("2. Ʈ��");
			System.out.println("3. ����");
			System.out.print("�����Ͻÿ�. ");
			int mainMenu = sc.nextInt(); // ���θ޴� �Է�
			
			switch(mainMenu)
			{
			case 1:
				System.out.print("�𵨸� : ");
				model = sc.next();
				System.out.print("������ : ");
				manufacturers = sc.next();
				System.out.print("���� : ");
				price = sc.nextInt();
				System.out.print("����ӵ� : ");
				speed = sc.nextInt();
				System.out.print("���� �ֹ����� : ");
				gas = sc.nextInt();
				
				PrivateCar carPrivate = new PrivateCar(model, manufacturers, price, speed, gas); //�ڰ��� ��ü ����
				
				Boolean carOn = true; //�ڰ��� ����
				while(carOn)
				{
					System.out.println("���� �𵨸��� "+carPrivate.reModel()+"�̸� ������� "+carPrivate.reManufacturers()+"�Դϴ�.");
					System.out.println("1. �ӵ��� �ø��ϴ�.");
					System.out.println("2. �ӵ��� �����ϴ�.");
					System.out.println("3. �����մϴ�");
					System.out.print("�����Ͻÿ�.");
					int carMenu = sc.nextInt();
					
					switch(carMenu)
					{
					case 1: carPrivate.speedUp(); break;
					case 2: carPrivate.speedDown(); break;
					case 3: System.out.println("�����մϴ�."); carOn=false; break; // �ڰ��� ����
					default: System.out.println("�ٽ� �Է����ּ���."); break;
					}
				} 
				break; 
				
			case 2:
				System.out.print("�𵨸� : ");
				model = sc.next();
				System.out.print("������ : ");
				manufacturers = sc.next();
				System.out.print("���� : ");
				price = sc.nextInt();
				System.out.print("����ӵ� : ");
				speed = sc.nextInt();
				System.out.print("���� �ֹ����� : ");
				gas = sc.nextInt();
				
				Truck carTruck = new Truck(model, manufacturers, price, speed, gas); //Ʈ����ü ����
				
				Boolean truckOn = true; //Ʈ�� ����
				while(truckOn)
				{
					System.out.println("���� �𵨸��� "+carTruck.reModel()+"�̸� ������� "+carTruck.reManufacturers()+"�Դϴ�.");
					System.out.println("1. �ӵ��� �ø��ϴ�.");
					System.out.println("2. �ӵ��� �����ϴ�.");
					System.out.println("3. �����մϴ�");
					int carMenu = sc.nextInt();
					
					switch(carMenu)
					{
					case 1: carTruck.speedUp(); break;
					case 2: carTruck.speedDown(); break;
					case 3: System.out.println("�����մϴ�."); truckOn=false; break; // Ʈ�� ����
					default: System.out.println("�ٽ� �Է����ּ���."); break;
					}
				} 
				break; 
				
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				programOn = false; //���α׷� ����
				break;
				
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
	}
}

abstract class Car 
{
	Car(String model, String manufacturers, int price, int speed) //������
	{
		this.model = model; 
		this.manufacturers = manufacturers;
		this.price = price;
		this.speed = speed;
	}
	
	String reModel() //�𵨸� ����
	{
		return model;
	}
	String reManufacturers() //������� ����
	{
		return manufacturers;
	}
	
	private String model, manufacturers; // �𵨸�, ������
	protected int speed, price; //���� �ӵ�, ����
	
	//�߻� �޼ҵ�
	abstract void speedUp();
	abstract void speedDown();
}

class PrivateCar extends Car //�ڰ���
{
	PrivateCar(String model, String manufacturers, int price, int speed, int gasoline)  // ������
	{
		super(model, manufacturers, price, speed);
		this.gasoline = gasoline;
	}
	
	int gasoline; // �ֹ���
	
	void speedUp()
	{
		if(gasoline-5 < 0) // �⸧�� �����ϸ� ����
		{
			System.out.println("�ֹ����� �����մϴ�.");
			System.out.println("������ �����մϴ�.");
			speed = 0;
			gasoline = 0;
		}
		else
		{
			speed += 10; //�ӵ�����
			gasoline -= 5; //�⸧����
			System.out.println("�ӵ��� �ø��ϴ�. ���� �ӵ���"+speed+"�̰� ���� �ֹ������� "+gasoline+"�Դϴ�.");
		}
	}
	
	void speedDown()
	{
		if(gasoline-5 < 0) // �⸧�� �����ϸ� ����
		{
			System.out.println("�ֹ����� �����մϴ�.");
			System.out.println("������ �����մϴ�.");
			speed = 0;
			gasoline = 0;
		}
		else if(speed == 0) //�ӵ��� 0�̶�� ���̻� ���ӺҰ�
		{
			System.out.println("�ӵ��� ���̻� ���� �� �����ϴ�.");
		}
		else
		{
			speed -= 10; //�ӵ�����
			gasoline -= 5; //�⸧����
			System.out.println("�ӵ��� �����ϴ�. ���� �ӵ���"+speed+"�̰� ���� �ֹ������� "+gasoline+"�Դϴ�.");
		}
	}
}

class Truck extends Car // Ʈ��
{
	Truck(String model, String manufacturers, int price, int speed, int diesel) // ������
	{
		super(model, manufacturers, price, speed);
		this.diesel = diesel;
	}
	
	int diesel; // LPG
	void speedUp()
	{
		if(diesel-5 < 0) // �⸧�� �����ϸ� ����
		{ 
			System.out.println("�ֹ����� �����մϴ�.");
			System.out.println("������ �����մϴ�.");
			speed = 0;
			diesel = 0;
		}
		else
		{
			speed += 10; //�ӵ�����
			diesel -= 5; //�⸧����
			System.out.println("�ӵ��� �����ϴ�. ���� �ӵ���"+speed+"�̰� ���� �ֹ������� "+diesel+"�Դϴ�.");
		}
	}
	
	void speedDown()
	{
		if(diesel-5 < 0) // �⸧�� �����ϸ� ����
		{
			System.out.println("�ֹ����� �����մϴ�.");
			System.out.println("������ �����մϴ�.");
			speed = 0;
			diesel = 0;
		}
		else if(speed == 0) //�ӵ��� 0�̸� ���̻� ���ӺҰ�
		{
			System.out.println("�ӵ��� ���̻� ���� �� �����ϴ�.");
		}
		else
		{
			speed -= 10; //�ӵ�����
			diesel -= 5; //�⸧����
			System.out.println("�ӵ��� �����ϴ�. ���� �ӵ���"+speed+"�̰� ���� �ֹ������� "+diesel+"�Դϴ�.");
		}
	}
}


