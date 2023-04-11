package chap01_prac;
import java.util.*;

public class Class04 {

	public static void main(String[] args) {
		Class04 T = new Class04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
	
	//StringBulider 객체이용
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
//		
//		return answer;
//	}

	//직접 문자열 뒤집기
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {	//lt가 rt보다 작을동안만 반복
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
}

/* <String.valueOf() VS Object.toString()>
 * 1. 변환 가능 자료형의 종류 및 개수
 * 2. NULL 값의 처리 여부.
 * 	- toString()의 경우: null 값을 문자열로 형 변환 시 NullPointException을 발생시킨다.
 *  - valueOf()의 경우: 파라미터로 null이 전달될 경우 "null"을 반환한다.
 * 
 *  null로 인해 발생된 에러는 ㅅㅣ간이 지나고 디버깅하기 어렵다는 문제가 있다. 따라서 NPE를 방지하기 위해
 *  String.valueOf()를 사용하는 것이 좋다.
 */
