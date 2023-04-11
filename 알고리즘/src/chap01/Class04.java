package chap01;
//�ܾ� ������
//N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

import java.util.*;

public class Class04 {
	public static void main(String[] args) {
		Class04 T = new Class04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

	//StringBuilder()���
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			//x�� ������ StringBuilder��ü�� �����.������.��Ʈ����ü�� ������
//			answer.add(tmp);
//		}
//		return answer;
//	}
	//Ư�����ڸ� ������. 
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();	//x�� ���� �迭ȭ ��.�� x�� �ϳ��� �ɰ�.
			int lt =0, rt = x.length()-1;	//lt�� ���� ����, rt�� ������
			while(lt < rt) {	//���� �ٲٴ� �˰���. �ܿ��α�
				char tmp = s[lt];
				s[lt] = s[rt];	//���ʿ� �����ʹ��� �ֱ�
				s[rt] = tmp;	//�����ʿ� ���ʹ��� �ֱ�
				lt++;	//���� �ε��� ����
				rt--;	//������ �ε��� ����
			}	//while ���� �� ������ ���� s�� ���ڿ��� ������ ���°� ��
			String tmp = String.valueOf(s);	//s��� ���ڸ� Stringȭ ������
			// !���⼭ valueOf�� ��ü. �� �ƴϴ�. String�̶� Ŭ������ �ٷ� �� �� ����ϴ� ����ƽ �޼ҵ���.
			// ����ƽ �޼ҵ�� Ŭ����. ���� ������ �����ϹǷ� ��밡��. 
			answer.add(tmp);
		}
		
		return answer;
	}
	
}

/*  <StringBuilder()�� ����ϴ� ����>
 *  String�� ���� ����(immutable) ��ü��� �Ѵ�. 2���� String ��ü�� ���� ��, str1 + str2 �� ���� ������ �ϸ�
 *  ���ο� String�� �����Ѵ�. ���� String ��ü�� ���ϴ� ������ �޸� �Ҵ�� ������ �߻����� ���������� ���� �ʴ�.
 *   
 *  StringBuilder�� String�� ���ڿ��� ���� �� ���ο� ��ü�� �����ϴ� ���� �ƴ϶� ������ �����Ϳ� ���ϴ� ����� ����ϱ�
 *  ������ �ӵ��� ������ ��������� ���ϰ� ����. append()�Լ� Ȱ��
 *  ���� �� ���ڿ��� ���ϴ� ��Ȳ�� �߻��� ��� StringBuilder�� ���������� ����ϸ� �ȴ�.
 * 
 */
