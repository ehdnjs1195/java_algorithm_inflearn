package chap02_prac;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Class10 t = new Class10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(t.solution(n, arr));

//		int[][] tmp = t.ranArr(n);
//		for (int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(tmp[i]));
//		}
//		System.out.println(t.solution(n, tmp));
	}

	public int solution(int n, int[][] arr) {
		int answer = 0;
		boolean isTop;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				isTop = true;
				int center = arr[i][j];
				if (i != 0)		//상
					if (arr[i - 1][j] >= center)
						isTop = false;
				if (i != n - 1) //하
					if (arr[i + 1][j] >= center)
						isTop = false;
				if (j != 0)		//좌
					if (arr[i][j - 1] >= center)
						isTop = false;
				if (j != n - 1) //우
					if (arr[i][j + 1] >= center)
						isTop = false;
				if (isTop)
					answer++;
			}
		}

		return answer;
	}

	public int[][] ranArr(int n) {
		Random random = new Random(); // 랜덤 객체 생성
		random.setSeed(System.currentTimeMillis());
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = random.nextInt(10);
			}
		}
		return arr;
	}

}
