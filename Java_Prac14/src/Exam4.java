import java.io.File;
import java.util.Scanner;

//test3.txt파일의 정보를 출력 
//폴더명, 경로, 크기
//파일을 만든 날짜, 시간 등
public class Exam4 {

	public static void main(String[] args) {
		String path = "D:\\eclipse\\workspace_2A_19\\Java20190318_2A\\Pro0409\\src\\";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("확인할 파일 명 입력:");
		String source = sc.next();
		
		File f = new File(path+source);
		
		System.out.println("파일명 : "+f.getName());
		System.out.println("파일 경로 : "+f.getPath());
		System.out.println("파일 크기 : "+f.length());
		long t = f.lastModified();
		// %tb : 월 / td : 일(날짜) / ta : 요일 / tT : 시간
		System.out.printf("수정한 시간 : %tb %td일 %ta %tT \n", t, t, t, t); 
	}

}
