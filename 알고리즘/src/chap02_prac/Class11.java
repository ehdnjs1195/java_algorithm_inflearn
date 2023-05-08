package chap02_prac;

import java.util.Scanner;

//임시반장 정하기
public class Class11 {

	public static void main(String[] args) {
		Class11 T = new Class11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // n명의 학생
		int[][] arr = new int[n][5]; // n명 학생의 5학년까지
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 5; j++)
				arr[i][j] = kb.nextInt();
		System.out.println(T.solution(n, arr));

	}

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i < n; i++) { // i학생 인덱스
			int[] x = new int[n]; // 같은 반을 했던적이 있는지 담는 배열
			for (int j = 0; j < 5; j++) { // 학년 수
				for (int k = 0; k < n; k++) { //k학생 인덱스
					if (i != k && arr[i][j] == arr[k][j])//i번학생과 k번학생의 학년이 같은지 검사.
						x[k] = 1;
				}
			}
			int s = 0;
			for (int tmp : x) {
				s += tmp;
			}
			System.out.print(i + 1 + "학생: " + s + " /");
			for(int a : x) System.out.print( a + " ");
			System.out.println();
			if (s > max) {
				max = s;
				answer = i + 1;
			}
			
		}
		if(answer == 0) answer = 1;	//내 답이 오답이었던 이유..!! 아무도 안 겹치는 경우엔 정답은 1번학생이어야 한다.
		return answer;
	}

}
