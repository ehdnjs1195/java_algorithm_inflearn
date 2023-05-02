package chap02_prac;

import java.util.Scanner;

public class Class08 {

	public static void main(String[] args) {
		Class08 t = new Class08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int tmp : t.solution(n, arr))
			System.out.print(tmp + " ");

	}

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j])
					cnt++;
			}
			answer[i] = cnt;
			cnt = 1;
		}
		return answer;
	}

}
