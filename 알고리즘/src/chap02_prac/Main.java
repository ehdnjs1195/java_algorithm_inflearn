package chap02_prac;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
		
	}

	public int solution(int n) {
		int answer = 0;
		int[] s = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(s[i]==0) {
				answer ++;
				for(int j=i; j<=n; j=j+i) {
					s[j] = 1;
				}
			}
		}
		return answer;
	}
	
}
 