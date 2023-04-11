package chap01;
import java.util.*;
/*
 * ���� ª�� ���ڰŸ�
 * ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
 * ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 */
public class Class10 {

	public static void main(String[] args) {
		Class10 T = new Class10();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0); // char ���� �ϳ��� �޴� ���
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}

	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];	//�������� int�迭 ����
		int p = 1000; //answer�迭�� ä���� ����. ù ���ڸ� 100���� ū ���ڷ� ����ش�.
		for(int i=0; i<s.length(); i++) {	//���ʿ��� ���� ���ϱ� ����
			if(s.charAt(i)==t) {	//i��° ���ڰ� �Է¹��� ���� t�� ������
				p = 0;
				answer[i] = p;
			} else {	//�ٸ���
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000; //�ٽ� p�� �ʱ�ȭ �ϰ� ����
		for(int i=s.length()-1; i>=0; i--) {	//�����ʿ����� ��
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);	//p�� answer�� �� �������� ������
			}
		}
		
		
		return answer;
	}
}
