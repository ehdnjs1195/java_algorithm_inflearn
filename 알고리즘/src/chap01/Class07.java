package chap01;
import java.util.*;
//회문 문자열
/*
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
public class Class07 {

	public static void main(String[] args) {
		Class07 T = new Class07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	//#1. 각 문자로 비교하기
//	public String solution(String str) {
//		String answer = "YES";
//		str = str.toUpperCase();	//대소문자 구분하지 않으므로 전부 대분자로 변경
//		int len = str.length();
//		for(int i = 0; i < len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";	
//			//두 문자를 비교했을 때 서로 다르면 더이상 비교할 필요 없으므로 바로 "NO"를 리턴하고 끝냄
//		}
//		return answer;
//	}
	
	//#2. StringBuilder() 객체 이용하기
	public String solution(String str) {
		String answer ="NO";
		//str를 뒤집기위해 StringBuilder객체 사용
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		// 그냥 equals로 비교하면 대소문자를 구분하게 된다.
		return answer;
	}
	
}
