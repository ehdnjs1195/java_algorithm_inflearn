package chap01_prac;
import java.util.*;
public class Class07_2 {

	public static void main(String[] args) {
		Class07_2 T = new Class07_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution2(str));
	}

	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) answer = "NO";
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "NO";
		String revStr = new StringBuilder(str).reverse().toString().toUpperCase();
		str = str.toUpperCase();
		if(str.equals(revStr)) answer = "YES";
		
		return answer;
	}
}
