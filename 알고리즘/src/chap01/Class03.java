package chap01;

import java.util.*;

//���� �� �ܾ�
//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
class Main{
//	public String solution(String str) {
//		String answer="";
//		int m = Integer.MIN_VALUE; // ���� �������ڷ� �ʱ�ȭ -2^31 �� �Ǵ¼�
//		String[] s = str.split(" "); //" "�� ������ s�� �迭�� ���
//		for(String x : s) {	//����x�� s�迭 �ϳ��� ��Ƽ� for�� ������
//			int len = x.length();
//			if(len > m) {
//				m = len;
//				answer = x;
//			}
//		}
//		return answer;
//	}
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos; // ���� m ����� ���ÿ� �ʱ�ȭ, pos��� ���� ����.(�ʱ�ȭ�¾��� x)
		while((pos = str.indexOf(' ')) != -1) {	//indexOf(' ')�� ���⸦ �߰��ϸ� �� ��ġ�� ����, pos�� ���Ⱑ �ƴ϶�� -1�� ��ȯ�ϱ�
			String tmp = str.substring(0,pos); // 0���� pos������ ex) 0���� 2����
			int len = tmp.length();
			if(len > m ) {	// ���⼭ ��ȣ(=)�� �־������ ���ʿ��� ���̰� ���� �ܾ ������ ���ϰ� �Ǳ�ȴ�. ���̰� ���� �� ���� �ܾ ����Ϸ��� ��ȣ�� ������.
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); //pos�� ���⸦ ����Ű�� �����Ƿ� �� �ڷ� ���� ���ڷ� �ʱ�ȭ ���ֱ�.
		}
		if(str.length() > m) answer = str;	//������ �������� str���� study�� ����ִ� ����, �׷��� ���Ⱑ �����Ƿ� ������ �ܾ�� �ǳʶٰ� �ȴ�.
											//�׷��Ƿ� ������ �ܾ m���� ��ٸ� �������� �־��ش�.
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}

public class Class03 {
	
}
