import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model, manufacturers; // 모델명, 제조사
		int speed, price, gas; // 현재속도, 가격, 현재기름량
		
		boolean programOn = true; // 프로그램 실행
		while(programOn)
		{
			System.out.println("1. 자가용");
			System.out.println("2. 트럭");
			System.out.println("3. 종료");
			System.out.print("선택하시오. ");
			int mainMenu = sc.nextInt(); // 메인메뉴 입력
			
			switch(mainMenu)
			{
			case 1:
				System.out.print("모델명 : ");
				model = sc.next();
				System.out.print("제조사 : ");
				manufacturers = sc.next();
				System.out.print("가격 : ");
				price = sc.nextInt();
				System.out.print("현재속도 : ");
				speed = sc.nextInt();
				System.out.print("현재 휘발유량 : ");
				gas = sc.nextInt();
				
				PrivateCar carPrivate = new PrivateCar(model, manufacturers, price, speed, gas); //자가용 객체 생성
				
				Boolean carOn = true; //자가용 실행
				while(carOn)
				{
					System.out.println("차의 모델명은 "+carPrivate.reModel()+"이며 제조사는 "+carPrivate.reManufacturers()+"입니다.");
					System.out.println("1. 속도를 올립니다.");
					System.out.println("2. 속도를 내립니다.");
					System.out.println("3. 종료합니다");
					System.out.print("선택하시오.");
					int carMenu = sc.nextInt();
					
					switch(carMenu)
					{
					case 1: carPrivate.speedUp(); break;
					case 2: carPrivate.speedDown(); break;
					case 3: System.out.println("종료합니다."); carOn=false; break; // 자가용 종료
					default: System.out.println("다시 입력해주세요."); break;
					}
				} 
				break; 
				
			case 2:
				System.out.print("모델명 : ");
				model = sc.next();
				System.out.print("제조사 : ");
				manufacturers = sc.next();
				System.out.print("가격 : ");
				price = sc.nextInt();
				System.out.print("현재속도 : ");
				speed = sc.nextInt();
				System.out.print("현재 휘발유량 : ");
				gas = sc.nextInt();
				
				Truck carTruck = new Truck(model, manufacturers, price, speed, gas); //트럭객체 생성
				
				Boolean truckOn = true; //트럭 실행
				while(truckOn)
				{
					System.out.println("차의 모델명은 "+carTruck.reModel()+"이며 제조사는 "+carTruck.reManufacturers()+"입니다.");
					System.out.println("1. 속도를 올립니다.");
					System.out.println("2. 속도를 내립니다.");
					System.out.println("3. 종료합니다");
					int carMenu = sc.nextInt();
					
					switch(carMenu)
					{
					case 1: carTruck.speedUp(); break;
					case 2: carTruck.speedDown(); break;
					case 3: System.out.println("종료합니다."); truckOn=false; break; // 트럭 종료
					default: System.out.println("다시 입력해주세요."); break;
					}
				} 
				break; 
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				programOn = false; //프로그램 종료
				break;
				
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
}

abstract class Car 
{
	Car(String model, String manufacturers, int price, int speed) //생성자
	{
		this.model = model; 
		this.manufacturers = manufacturers;
		this.price = price;
		this.speed = speed;
	}
	
	String reModel() //모델명 리턴
	{
		return model;
	}
	String reManufacturers() //제조사명 리턴
	{
		return manufacturers;
	}
	
	private String model, manufacturers; // 모델명, 제조사
	protected int speed, price; //현재 속도, 가격
	
	//추상 메소드
	abstract void speedUp();
	abstract void speedDown();
}

class PrivateCar extends Car //자가용
{
	PrivateCar(String model, String manufacturers, int price, int speed, int gasoline)  // 생성자
	{
		super(model, manufacturers, price, speed);
		this.gasoline = gasoline;
	}
	
	int gasoline; // 휘발유
	
	void speedUp()
	{
		if(gasoline-5 < 0) // 기름이 부족하면 정지
		{
			System.out.println("휘발유가 부족합니다.");
			System.out.println("차량을 정지합니다.");
			speed = 0;
			gasoline = 0;
		}
		else
		{
			speed += 10; //속도증가
			gasoline -= 5; //기름감소
			System.out.println("속도를 올립니다. 현재 속도는"+speed+"이고 남은 휘발유량은 "+gasoline+"입니다.");
		}
	}
	
	void speedDown()
	{
		if(gasoline-5 < 0) // 기름이 부족하면 정지
		{
			System.out.println("휘발유가 부족합니다.");
			System.out.println("차량을 정지합니다.");
			speed = 0;
			gasoline = 0;
		}
		else if(speed == 0) //속도가 0이라면 더이상 감속불가
		{
			System.out.println("속도를 더이상 내릴 수 없습니다.");
		}
		else
		{
			speed -= 10; //속도감소
			gasoline -= 5; //기름감소
			System.out.println("속도를 내립니다. 현재 속도는"+speed+"이고 남은 휘발유량은 "+gasoline+"입니다.");
		}
	}
}

class Truck extends Car // 트럭
{
	Truck(String model, String manufacturers, int price, int speed, int diesel) // 생성자
	{
		super(model, manufacturers, price, speed);
		this.diesel = diesel;
	}
	
	int diesel; // LPG
	void speedUp()
	{
		if(diesel-5 < 0) // 기름이 부족하면 정지
		{ 
			System.out.println("휘발유가 부족합니다.");
			System.out.println("차량을 정지합니다.");
			speed = 0;
			diesel = 0;
		}
		else
		{
			speed += 10; //속도증가
			diesel -= 5; //기름감소
			System.out.println("속도를 내립니다. 현재 속도는"+speed+"이고 남은 휘발유량은 "+diesel+"입니다.");
		}
	}
	
	void speedDown()
	{
		if(diesel-5 < 0) // 기름이 부족하면 정지
		{
			System.out.println("휘발유가 부족합니다.");
			System.out.println("차량을 정지합니다.");
			speed = 0;
			diesel = 0;
		}
		else if(speed == 0) //속도가 0이면 더이상 감속불가
		{
			System.out.println("속도를 더이상 내릴 수 없습니다.");
		}
		else
		{
			speed -= 10; //속도감소
			diesel -= 5; //기름감소
			System.out.println("속도를 내립니다. 현재 속도는"+speed+"이고 남은 휘발유량은 "+diesel+"입니다.");
		}
	}
}


