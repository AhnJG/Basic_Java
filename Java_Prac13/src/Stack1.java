import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		
		System.out.println(s.peek());	// �б�
		System.out.println(s.pop());	// �̱�
		System.out.println(s.peek());
	}

}
