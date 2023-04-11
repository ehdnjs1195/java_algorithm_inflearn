package chap02_prac;
import java.util.*;
//�Ǻ���ġ����
/*
1) �Ǻ���ġ ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� 
�����̴�.
2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� 
�ȴ�.

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
