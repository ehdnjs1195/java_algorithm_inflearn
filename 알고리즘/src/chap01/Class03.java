package chap01;

import java.util.*;

//문장 속 단어
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
class Main{
//	public String solution(String str) {
//		String answer="";
//		int m = Integer.MIN_VALUE; // 가장 작은숫자로 초기화 -2^31 쯤 되는수
//		String[] s = str.split(" "); //" "로 나누어 s에 배열로 담고
//		for(String x : s) {	//변수x에 s배열 하나씩 담아서 for문 돌리기
//			int len = x.length();
//			if(len > m) {
//				m = len;
//				answer = x;
//			}
//		}
//		return answer;
//	}
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos; // 변수 m 선언과 동시에 초기화, pos라는 변수 선언.(초기화는아직 x)
		while((pos = str.indexOf(' ')) != -1) {	//indexOf(' ')는 띄어쓰기를 발견하면 그 위치를 리턴, pos가 띄어쓰기가 아니라면 -1을 반환하기
			String tmp = str.substring(0,pos); // 0부터 pos전까지 ex) 0부터 2까지
			int len = tmp.length();
			if(len > m ) {	// 여기서 등호(=)를 넣어버리면 뒤쪽에서 길이가 같은 단어가 나오면 변하게 되기된다. 길이가 같을 때 앞쪽 단어를 출력하려면 등호를 빼야함.
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); //pos가 띄어쓰기를 가리키고 있으므로 그 뒤로 남은 문자로 초기화 해주기.
		}
		if(str.length() > m) answer = str;	//마지막 루프에서 str에는 study가 들어있는 상테, 그러면 띄어쓰기가 없으므로 마지막 단어는 건너뛰게 된다.
											//그러므로 마지막 단어가 m보다 길다면 정답으로 넣어준다.
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}

public class Class03 {
	
}
