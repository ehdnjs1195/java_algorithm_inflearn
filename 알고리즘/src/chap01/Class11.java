package chap01;
import java.util.*;
/*
 * ���ڿ� ����
���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�

���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
 */
public class Class11 {
	public static void main(String[] args) {
		Class11 T = new Class11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String s) {
		String answer = "";
		s=s+" ";
		int cnt = 1;
		for(int i =0; i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) cnt ++;
			else {
				answer += s.charAt(i);
				if(cnt >1) answer += String.valueOf(cnt);	//cnt�� String���� �߰�
				cnt =1;
			}
		}
		
		return answer;
	}
}
