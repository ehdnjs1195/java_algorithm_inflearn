package chap01;
import java.util.*;
//���ڸ� ����
/*
 ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.

���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.

�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
 */
public class Class09 {

	public static void main(String[] args) {
		Class09 T = new Class09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}
	//#1. int��
//	public int solution(String s) {
//		int answer = 0;
//		for(char x : s.toCharArray()) {
//			if(x>=48 && x<=57) answer = answer*10+(x-48);
//			//�ƽ�Ű��ȣ�� 48~57���̴� ���� 0~9 �̴�.
//			//�ؼ�: x���ڰ� ����(0~9)�̸� answer�� ����.
//			//x-48�̸� ���� 0~9�� �ǹ��� �� �ִ�.
//		}
//		
//		return answer;
//	}
	
	//#2. String����
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
			//Character�޼ҵ� �� '���ڳ�?' ���� �޼ҵ�
			//answer�� ���ڰ� ��� ������ ���� => �� �տ� 0�� �Ѵ� ���������� 
			//IntegerŬ������ parseInt()�޼ҵ带 �̿��ϸ� ���������� ��ȯ�ǹǷ� �Ǿտ� ������ 0�� �ڿ������� ������.
		}
		
		return Integer.parseInt(answer);
	}
}
