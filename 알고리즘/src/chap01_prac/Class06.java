package chap01_prac;
import java.util.*;
public class Class06 {

	public static void main(String[] args) {
		Class06 T = new Class06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		}
		
		return answer;
	}

}
