package chap03_prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Class02 {

	public static void main(String[] args) {
		Class02 T = new Class02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = kb.nextInt();
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) b[i] = kb.nextInt();
		for(int x : T.solution(n, m, a, b)) System.out.print(x + " ");
		
	}

	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) { //겹치는 거 요소 배열에 담기
			for(int j=0; j<m; j++) {
				if(a[i] == b[j]) answer.add(b[j]);
			}
		}
		
		for(int i=0; i<answer.size(); i++) { //배열 오름차순으로 정렬하기.
			for(int j=answer.size()-i-1; j>=0; j--) {
				if(j < answer.size()-1 && answer.get(j) > answer.get(j+1)) {
					int tmp = answer.get(j);
					answer.set(j, answer.get(j+1));
					answer.set(j+1, tmp);
				}
			}
		}
		return answer;
	}

}
