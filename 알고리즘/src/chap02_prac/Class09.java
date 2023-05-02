package chap02_prac;

import java.util.Scanner;

public class Class09 {

	public static void main(String[] args) {
		Class09 t = new Class09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = kb.nextInt();
		System.out.println(t.solution(n, arr));
	}

	public int solution(int n, int[][] arr) {
		int max = 0;
		int row = 0;
		int col = 0;
		int dig = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				row += arr[i][j];// 행들의 합
				col += arr[j][i];// 열들의 합
			}
			if (row > max) max = row;
			if (col > max) max = col;
			dig += arr[i][i]; //좌상단부터 우대각아래로 합
			row = 0;
			col = 0;
		}
		if(dig > max) max = dig;
		dig = 0;
		for(int i = 0; i < n; i++) {
			dig += arr[i][n-i-1]; //우상단부터 좌대각아래로 합
		}
		if(dig > max) max = dig;
		
		return max;
	}

}
