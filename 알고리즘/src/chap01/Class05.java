package chap01;
import java.util.*;
//특정 문자 뒤집기
public class Class05 {
	public static void main(String[] args) {
		Class05 T = new Class05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;	//s[lt]가 알파벳이냐 => !를 붙였으므로 알파벳이 아니면 참.
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
}
