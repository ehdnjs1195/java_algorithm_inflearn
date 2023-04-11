package chap01;
import java.util.*;
//숫자만 추출
/*
 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */
public class Class09 {

	public static void main(String[] args) {
		Class09 T = new Class09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}
	//#1. int로
//	public int solution(String s) {
//		int answer = 0;
//		for(char x : s.toCharArray()) {
//			if(x>=48 && x<=57) answer = answer*10+(x-48);
//			//아스키번호로 48~57사이는 숫자 0~9 이다.
//			//해석: x문자가 숫자(0~9)이면 answer에 누적.
//			//x-48이면 숫자 0~9를 의미할 수 있다.
//		}
//		
//		return answer;
//	}
	
	//#2. String으로
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
			//Character메소드 중 '숫자냐?' 묻는 메소드
			//answer에 숫자가 모두 누적된 상태 => 맨 앞에 0이 붇는 상태이지만 
			//Integer클래스의 parseInt()메소드를 이용하면 정수값으로 변환되므로 맨앞에 나오는 0는 자연스럽게 없어짐.
		}
		
		return Integer.parseInt(answer);
	}
}
