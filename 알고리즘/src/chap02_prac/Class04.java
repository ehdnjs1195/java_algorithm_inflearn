package chap02_prac;
import java.util.*;
//피보나치수열
/*
1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 
수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 
된다.

 */
public class Class04 {

	public static void main(String[] args) {
		Class04 T = new Class04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x+" ");

	}

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		answer[2] = 2;
		for(int i=3; i<n; i++) {
			answer[i] = answer[i-1]+answer[i-2];
		}
		
		return answer;
	}
}
