package chap01_prac;

import java.util.Scanner;

public class Class09_2 {

	public static void main(String[] args) {
		Class09_2 T = new Class09_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
//	public int solution(String str) {
//		int answer = 0;
//		
//		for(char x : str.toCharArray()) {
//			if(x>=48 && x<=57) answer = answer*10 + (x-48);
//		}
//		
//		return answer;
//	}
	
	public int solution(String str) {
		String answer = "";
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) answer+= x;
		}
		
		return Integer.parseInt(answer);
	}
}
