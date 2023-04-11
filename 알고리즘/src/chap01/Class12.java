package chap01;

import java.util.Scanner;
//암호
/*
1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 */
public class Class12 {

	public static void main(String[] args) {
		Class12 T=new Class12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
	public String solution(int n, String s) {
		String answer ="";
		for(int i=0; i<n;i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*','0');
			int num = Integer.parseInt(tmp, 2);	//2진수를 10진수로 바꿔줌.
			answer += (char)num;	//숫자를 Character로 캐스트 해서 문자로 변경.
			
			s=s.substring(7);	//s의 앞부분은 버리고 갱신하는 과정
		}
		
		return answer;
	}

}

//replace(char oldChar, char newChar) 홀따옴표로 감싸주기
//Integer.parseInt(str, 2)를 이용하면 2진수로 입력된 string변수를 10진수로 바꿔준다.string변수를 2진수로 보고 10진수로 변형.
//Integer.parseInt(str, 8)를 이용하면 8진수로 입력된 string변수를 10진수로 바꿔준다.
