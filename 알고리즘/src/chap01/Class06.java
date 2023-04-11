package chap01;
import java.util.*;
//중복문자제거
public class Class06 {
	public static void main(String[] args) {
		Class06 T = new Class06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer="";
		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			//charAt(인덱스번호): 인덱스 번호의 문자 하나 반환.
			//indexOf(특정문자): 문자열에서 특정문자가 발견된 인덱스번호 반환.
			//해결포인트: 그문자열이 발견되는 인덱스번호와 indexOf()메소드의 번호가 같으면 처음 나온 문자이므로 출력함.
			// 			다르면 이미 앞에서 나온 문자인 것.
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		}
		return answer;
	}
}
