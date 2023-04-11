package chap01;
//단어 뒤집기
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

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

	//StringBuilder()사용
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			//x를 가지고 StringBuilder객체를 만들고.뒤집고.스트링객체로 만들어라
//			answer.add(tmp);
//		}
//		return answer;
//	}
	//특정문자만 뒤집기. 
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();	//x가 문자 배열화 됨.즉 x를 하나씩 쪼갬.
			int lt =0, rt = x.length()-1;	//lt는 문자 왼쪽, rt는 오른쪽
			while(lt < rt) {	//문자 바꾸는 알고리즘. 외워두기
				char tmp = s[lt];
				s[lt] = s[rt];	//왼쪽에 오른쪽문자 넣기
				s[rt] = tmp;	//오른쪽에 왼쪽문자 넣기
				lt++;	//왼쪽 인덱스 증가
				rt--;	//오른쪽 인덱스 감소
			}	//while 문이 다 끝나고 나면 s의 문자열이 뒤집힌 상태가 됨
			String tmp = String.valueOf(s);	//s라는 문자를 String화 시켜줌
			// !여기서 valueOf는 객체. 이 아니다. String이란 클래스에 바로 쩜 찍어서 사용하는 스태틱 메소드임.
			// 스태틱 메소드는 클래스. 으로 접근이 가능하므로 사용가능. 
			answer.add(tmp);
		}
		
		return answer;
	}
	
}

/*  <StringBuilder()를 사용하는 이유>
 *  String은 소위 불편(immutable) 객체라고 한다. 2개의 String 객체가 있을 때, str1 + str2 와 같은 연산을 하면
 *  새로운 String을 생성한다. 따라서 String 객체를 더하는 행위는 메모리 할당과 해제를 발생시켜 성능적으로 좋지 않다.
 *   
 *  StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하기
 *  때문에 속도도 빠르며 상대적으로 부하가 적다. append()함수 활용
 *  따라서 긴 문자열을 더하는 상황이 발생할 경우 StringBuilder를 적극적으로 사용하면 된다.
 * 
 */
