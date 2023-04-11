package chap01;
import java.util.*;
/*
 * 가장 짧은 문자거리
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 */
public class Class10 {

	public static void main(String[] args) {
		Class10 T = new Class10();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0); // char 문자 하나만 받는 방법
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}

	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];	//동적으로 int배열 생성
		int p = 1000; //answer배열을 채워줄 변수. 첫 숫자를 100보다 큰 숫자로 잡아준다.
		for(int i=0; i<s.length(); i++) {	//왼쪽에서 부터 비교하기 시작
			if(s.charAt(i)==t) {	//i번째 문자가 입력받은 문자 t와 같은가
				p = 0;
				answer[i] = p;
			} else {	//다르면
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000; //다시 p를 초기화 하고 시작
		for(int i=s.length()-1; i>=0; i--) {	//오른쪽에부터 비교
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);	//p와 answer값 중 작은것이 들어가도록
			}
		}
		
		
		return answer;
	}
}
