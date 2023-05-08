package chap02;

import java.util.Scanner;

public class Class12 {

	public static void main(String[] args) {
		Class12 T = new Class12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 학생수
		int m = kb.nextInt(); // 시험수
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
	}

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {	//i번째 학생
			for (int j = 1; j <= n; j++) {	//j번째 학생
				int cnt = 0;
				for(int k=0; k<m; k++) {	//k번재 시험(행)
					int pi = 0, pj = 0;
					for(int s=0; s<n; s++) {//s번째 등수(열)
						if(arr[k][s] == i) pi = s;	//해당 요소가 i번 학생이면 해당 인덱스(등수)s를 저장
						if(arr[k][s] == j) pj = s;	//해당 요소가 j번 학생이면 해당 등수s를 저장
					}
					if(pi > pj) cnt++; //i번째 학생이 j번 학생보다 등수가 높으면 cnt를 증가
				}
				if(cnt == m) answer++; //증가시킨 cnt가 전체 시험수와 같으면 i가 j를 모든 시험에서 앞선것이므로 정답수 증가
			}
		}

		return answer;
	}

}
