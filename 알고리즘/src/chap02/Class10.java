package chap02;

import java.util.Scanner;
//봉우리문제
public class Class10 {

	public static void main(String[] args) {
		Class10 T = new Class10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}

	int[] dx = { -1, 0, 1, 0 }; // 좌표에 더해줄 값들. 상하좌우를 넘어서 대각까지도 표현해 줄 수 있음.
	int[] dy = { 0, 1, 0, -1 };

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int x, y;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					x = i + dx[k];	//x좌표를 i에서 dx만큼 이동
					y = j + dy[k];	//y좌표를 j에서 dy만큼 이동
					if (x >= 0 && x < n && y >= 0 && y < n && arr[x][y] >= arr[i][j]) { // 주변 좌표가 가운데보다 크면 봉우리가 아니므로
						flag = false;
						break;
					}
				}
				if (flag)
					answer++;
			}
		}

		return answer;
	}

}
