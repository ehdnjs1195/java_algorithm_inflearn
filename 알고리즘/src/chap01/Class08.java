package chap01;
import java.util.*;
//��ȿ�� �Ӹ����
/*
 �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.

���ĺ� �̿��� ���ڵ��� �����մϴ�.
 */
public class Class08 {
	public static void main(String[] args) {
		Class08 T = new Class08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
	public String solution(String s) {
		String answer ="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]","");	
		//��ҹ��� ���� ���ϹǷ� ���� �빮�ڷ� ��ȯ�ϰ�,
		//���Խ����� ^(����)A-Z : A���� Z������ �ƴϸ�, "" �� ����ȭ�ض�. => ���ĺ��� �̾Ƴ���
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) return "YES";
		
		return answer;
	}
}

/*
 * replace() VS replaceAll()
 * 1. ���ڰ� ���¿��� ���� CharSequence�� String�� ����
 * 2. replaceAll()�� ����: regex => ���� ǥ����
 * replaceAll()�� ����ǥ������ ����� �� �ִ�.
 * 
 */