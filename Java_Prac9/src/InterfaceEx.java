import java.util.Scanner;

public class InterfaceEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�հݿ��� : ");
		String text = sc.next();
		System.out.print("�뷡 �̸� : ");
		String music = sc.next();
		
		SmartPhone p = new SmartPhone(text, music);
		p.printLogo();
		p.sendCall();
		p.play();
		System.out.println("3�� 5�� ���ϸ�" + p.calculate(3, 5));
		p.schedule();
		p.SMSLogo();
		p.sendSMS();
		p.receiveSMS();
	}

}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
	String text, music;
	SmartPhone(String text, String music) 
	{
		this.text = text;
		this.music = music;
	}
	
	//MobilcPhontInterface �߻� �޼ҵ�
	public void sendCall()
	{
		System.out.println("������������~~");
	}
	
	public void receiveCall()
	{
		System.out.println("��ȭ �Ծ��");
	}
	
	public void sendSMS()
	{
		System.out.println(text+"���ڰ��ϴ�.");
	}
	
	public void receiveSMS()
	{
		System.out.println(text+"���ڿԾ��.");
	}
	
	//MP3 Interface �߻� �޼ҵ�
	public void play()
	{
		System.out.println(music+"���� �����մϴ�.");
	}
	
	public void stop()
	{
		System.out.println(music+"���� �ߴ��մϴ�.");
	}
	
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule()
	{
		System.out.println("���� �����մϴ�.");
	}
}


class PDA
{
	public int calculate(int x, int y)
	{
		return x+y;
	}
}

interface PhoneInterface
{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo()
	{
		System.out.println("**PHONE**");
	}
}

interface MobilePhoneInterface extends PhoneInterface
{
	void sendSMS();
	void receiveSMS();
	default void SMSLogo()
	{
		System.out.println("**SMS**");
	}
}

interface MP3Interface
{
	public void play();
	public void stop();
}

