package chap02_prac;
import java.util.*;
//가위 바위 보
/*
 A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, 
B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다. 
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

 */
public class Class03 {

	public static void main(String[] args) {
		Class03 T = new Class03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = kb.nextInt();
		}
		for(char x: T.solution(n,a,b)) {
			System.out.println(x);
		}
	}
	
	public char[] solution(int n, int[] a, int[] b) {
		char[] answer = new char[n];
		for(int i=0; i<n; i++) {
			if(a[i]-b[i] == 1) answer[i] = 'A';
			else if(a[i]-b[i] == -2) answer[i] = 'A';
			else if(a[i] == b[i]) answer[i] ='D';
			else {
				answer[i]='B';
			}
		}
		
		return answer;
	}

}
