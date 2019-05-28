import java.util.Scanner;

class Market
{
	String name;
	int price;
	int num;
	
	public Market() {}
	
	public Market(String name, int price, int num)
	{
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	void info()
	{
		System.out.println(name+"의 단가는"+price+"이고 "+num+"개의 가격은"+(price*num)+"이다.");
	}
}

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Market [] m = new Market[3];
		
		int i;
		
		for(i=0; i<m.length; i++)
		{
			System.out.println("물품이름, 갯수, 가격입력 :");
			m[i] = new Market(sc.next(), sc.nextInt(), sc.nextInt());
		}
		
		for(i=0; i<m.length; i++)
		{
			m[i].info();
		}
	}

}
