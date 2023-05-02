package chap02_prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Class06 {

	public static void main(String[] args) {
		Class06 t = new Class06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int tmp : t.solution(n, arr)) System.out.print(tmp + " ");
	}

	public ArrayList<Integer> solution(int n ,int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			int tmp = 0;
			while(arr[i] > 0) { //뒤집는 반복문
				tmp = (tmp * 10) + arr[i] % 10;
				arr[i] /= 10;
			}
			boolean check = true;
			for(int j = 2; j < tmp; j++) {
				if((tmp % j) == 0) { //나머지가 0이 있으면 소수가 아니므로
					check = false; //false 리턴
					break; //반복문 종료
				}
			}
			if(check && tmp != 1) answer.add(tmp); //동시에 1이면 안된다.
		}
		return answer;
	}
}
