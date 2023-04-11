package chap02_prac;
import java.util.*;
//���� ���� ��
/*
 A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, 
B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�. 
����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.

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
