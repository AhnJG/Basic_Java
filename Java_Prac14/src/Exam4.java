import java.io.File;
import java.util.Scanner;

//test3.txt������ ������ ��� 
//������, ���, ũ��
//������ ���� ��¥, �ð� ��
public class Exam4 {

	public static void main(String[] args) {
		String path = "D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ȯ���� ���� �� �Է�:");
		String source = sc.next();
		
		File f = new File(path+source);
		
		System.out.println("���ϸ� : "+f.getName());
		System.out.println("���� ��� : "+f.getPath());
		System.out.println("���� ũ�� : "+f.length());
		long t = f.lastModified();
		// %tb : �� / td : ��(��¥) / ta : ���� / tT : �ð�
		System.out.printf("������ �ð� : %tb %td�� %ta %tT \n", t, t, t, t); 
	}

}
