package chap01;

import java.util.Scanner;
//��ȣ
/*
1. ��#*****#���� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1��, *�������� 0���� ��ȯ�մϴ�. ����� ��1000001���� ��ȯ�˴ϴ�.

2. �ٲ� 2������ 10����ȭ �մϴ�. ��1000001���� 10����ȭ �ϸ� 65�� �˴ϴ�.

3. �ƽ�Ű ��ȣ�� 65���ڷ� ��ȯ�մϴ�. �� �ƽ�ũ��ȣ 65�� �빮�� 'A'�Դϴ�.
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
			int num = Integer.parseInt(tmp, 2);	//2������ 10������ �ٲ���.
			answer += (char)num;	//���ڸ� Character�� ĳ��Ʈ �ؼ� ���ڷ� ����.
			
			s=s.substring(7);	//s�� �պκ��� ������ �����ϴ� ����
		}
		
		return answer;
	}

}

//replace(char oldChar, char newChar) Ȧ����ǥ�� �����ֱ�
//Integer.parseInt(str, 2)�� �̿��ϸ� 2������ �Էµ� string������ 10������ �ٲ��ش�.string������ 2������ ���� 10������ ����.
//Integer.parseInt(str, 8)�� �̿��ϸ� 8������ �Էµ� string������ 10������ �ٲ��ش�.
