package chap01_prac;
import java.util.*;

public class Class11 {
	public static void main(String[] args) {
		Class11 T = new Class11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next()+" ";
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int p =1;
		for(int i=0; i<str.length()-1;i++) {
			if(s[i]==s[i+1]) {
				p++;
				
			}else {
				answer += s[i];
				if(p>1) answer +=p;
				p=1;
			}
		}
		
		return answer;
	}
}
