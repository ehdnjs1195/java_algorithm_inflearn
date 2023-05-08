package chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
		Class01 T = new Class01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arrN = new int[n];
		for (int i = 0; i < n; i++)
			arrN[i] = kb.nextInt();
		int m = kb.nextInt();
		int[] arrM = new int[m];
		for (int i = 0; i < m; i++)
			arrM[i] = kb.nextInt();
		for (int tmp : T.solution(n, m, arrN, arrM))
			System.out.print(tmp + " ");
	}

	public ArrayList<Integer> solution(int n, int m, int[] arrN, int[] arrM) {
		ArrayList<Integer> answer = new ArrayList<>();
		int pi = 0, pj = 0;
		
		while(pi < n && pj < m) {
			if(arrN[pi] < arrM[pj]) answer.add(arrN[pi++]);
			else answer.add(arrM[pj++]);
		}
		while(pi < n) answer.add(arrN[pi++]);
		while(pj < m) answer.add(arrM[pj++]);
		
		
		return answer;
	}

}
