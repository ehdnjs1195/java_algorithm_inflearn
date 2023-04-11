package chap01_prac;
import java.util.*;
//ÆÓ¸°µå·Ò
public class Class08 {

	public static void main(String[] args) {
		Class08 T = new Class08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}

	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		if(str.equals(tmp)) return "YES";
		
		return answer;
	}
}
