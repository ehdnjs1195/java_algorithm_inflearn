package chap02_prac;

import java.util.*;

//�Ҽ�(�����佺�׳׽� ü)
/*
 �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���. 
���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
���ѽð��� 1���Դϴ�. 
 */
public class Class05 {

	public static void main(String[] args) {
		Class05 t = new Class05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(t.solution(n));
	}

	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;
				for(int j = i; j <= n; j += i) {
					arr[j] = 1;
				}
			}
		}

		return answer;
	}
}
