package chap01;
import java.util.*;
//�ߺ���������
public class Class06 {
	public static void main(String[] args) {
		Class06 T = new Class06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String answer="";
		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			//charAt(�ε�����ȣ): �ε��� ��ȣ�� ���� �ϳ� ��ȯ.
			//indexOf(Ư������): ���ڿ����� Ư�����ڰ� �߰ߵ� �ε�����ȣ ��ȯ.
			//�ذ�����Ʈ: �׹��ڿ��� �߰ߵǴ� �ε�����ȣ�� indexOf()�޼ҵ��� ��ȣ�� ������ ó�� ���� �����̹Ƿ� �����.
			// 			�ٸ��� �̹� �տ��� ���� ������ ��.
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		}
		return answer;
	}
}
