package chap01;
import java.util.*;
//유효한 팰린드롬
/*
 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들을 무시합니다.
 */
public class Class08 {
	public static void main(String[] args) {
		Class08 T = new Class08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
	public String solution(String s) {
		String answer ="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]","");	
		//대소문자 구분 안하므로 전부 대문자로 변환하고,
		//정규식으로 ^(부정)A-Z : A부터 Z까지가 아니면, "" 빈 문자화해라. => 알파벳만 뽑아내기
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) return "YES";
		
		return answer;
	}
}

/*
 * replace() VS replaceAll()
 * 1. 인자값 형태에서 차이 CharSequence와 String의 차이
 * 2. replaceAll()의 설명: regex => 정규 표현식
 * replaceAll()은 정규표현식을 사용할 수 있다.
 * 
 */