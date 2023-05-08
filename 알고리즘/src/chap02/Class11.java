package chap02;

import java.util.Scanner;

public class Class11 {

	public static void main(String[] args) {
		Class11 T = new Class11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // n명의 학생
		int[][] arr = new int[n + 1][6]; // n명 학생의 5학년까지 =>인덱스를 1부터 사용하기 위해 하나씩 증가
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= 5; j++)
				arr[i][j] = kb.nextInt();
		System.out.println(T.solution(n, arr));

	}

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		//전체적으로 학생 두명을 횡으로(학년별로) 비교하는 반복문.
		for (int i = 1; i <= n; i++) {//i번학생
			int cnt = 0;
			for (int j = 1; j <= n; j++) {//j번학생
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) { //i번학생과 j번학생의 k학년의 반을 비교
						cnt++; //같으면 카운트 증가하고
						break; //더이상 같은 학년에 대해서는 카운트가 필요없으므로 반복문 정지.
					}
				}
			}
			if (cnt > max) { //카운트 센 값이 최대값보다 크면
				max = cnt; //최대값을 초기화하고
				answer = i; //그 인덱스를 정답으로 채택.
			}
		}
		return answer;
	}

}
