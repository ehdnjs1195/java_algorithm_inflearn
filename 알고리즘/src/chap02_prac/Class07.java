package chap02_prac;

import java.util.Scanner;

public class Class07 {

	public static void main(String[] args) {
		Class07 t = new Class07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(t.solution(n, arr));
	}

	public int solution(int n, int[] arr) {
		int answer = 0;
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				++p;
				answer += p;
			} else
				p = 0;
		}

		return answer;
	}

}
