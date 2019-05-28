import java.util.Scanner;

public class InterfaceEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합격여부 : ");
		String text = sc.next();
		System.out.print("노래 이름 : ");
		String music = sc.next();
		
		SmartPhone p = new SmartPhone(text, music);
		p.printLogo();
		p.sendCall();
		p.play();
		System.out.println("3과 5를 더하면" + p.calculate(3, 5));
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
	
	//MobilcPhontInterface 추상 메소드
	public void sendCall()
	{
		System.out.println("따르릉따르릉~~");
	}
	
	public void receiveCall()
	{
		System.out.println("전화 왔어요");
	}
	
	public void sendSMS()
	{
		System.out.println(text+"문자갑니다.");
	}
	
	public void receiveSMS()
	{
		System.out.println(text+"문자왔어요.");
	}
	
	//MP3 Interface 추상 메소드
	public void play()
	{
		System.out.println(music+"음악 연주합니다.");
	}
	
	public void stop()
	{
		System.out.println(music+"음악 중단합니다.");
	}
	
	//추가로 작성한 메소드
	public void schedule()
	{
		System.out.println("일정 관리합니다.");
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

