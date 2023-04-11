package chap01_prac;
import java.util.*;

public class Class07 {
	public static void main(String[] args) {
		Class07 T = new Class07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
//	public String solution(String str) {
//		String answer = "YES";
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i=0; i<len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//		}		
//		return answer;
//	}
	
	public String solution(String str) {
		String answer="NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) return "YES";
		
		return answer;
	}
}
