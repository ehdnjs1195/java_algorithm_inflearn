package chap01;
import java.util.*;
//ȸ�� ���ڿ�
/*
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
 */
public class Class07 {

	public static void main(String[] args) {
		Class07 T = new Class07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	//#1. �� ���ڷ� ���ϱ�
//	public String solution(String str) {
//		String answer = "YES";
//		str = str.toUpperCase();	//��ҹ��� �������� �����Ƿ� ���� ����ڷ� ����
//		int len = str.length();
//		for(int i = 0; i < len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";	
//			//�� ���ڸ� ������ �� ���� �ٸ��� ���̻� ���� �ʿ� �����Ƿ� �ٷ� "NO"�� �����ϰ� ����
//		}
//		return answer;
//	}
	
	//#2. StringBuilder() ��ü �̿��ϱ�
	public String solution(String str) {
		String answer ="NO";
		//str�� ���������� StringBuilder��ü ���
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		// �׳� equals�� ���ϸ� ��ҹ��ڸ� �����ϰ� �ȴ�.
		return answer;
	}
	
}
