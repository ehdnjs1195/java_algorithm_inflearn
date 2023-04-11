package chap01_prac;
import java.util.*;

public class Class12 {

	public static void main(String[] args) {
		Class12 T=new Class12();
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(x, str));
	}
	
	public String solution(int x, String s) {
		String answer ="";
		for(int i=0; i<x; i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			s=s.substring(7);
		}
		
		return answer;
	}
}

//radix Áø¹ý
