package chap01_prac;
import java.util.*;
public class Class10 {

	public static void main(String[] args) {
		Class10 T = new Class10();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char t = kb.next().charAt(0);
		for(int x : T.solution(str, t)) {
			System.out.print(x + " ");
		}
	}
	
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for(int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i) == t) {
				p=0;
			}else {
				p++;
				if(answer[i] > p) answer[i] = p;
			}
		}
		
		
		return answer;
	}

}
