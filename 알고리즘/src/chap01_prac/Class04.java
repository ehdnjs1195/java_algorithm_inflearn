package chap01_prac;
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
	
	//StringBulider ��ü�̿�
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
//		
//		return answer;
//	}

	//���� ���ڿ� ������
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {	//lt�� rt���� �������ȸ� �ݺ�
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
}

/* <String.valueOf() VS Object.toString()>
 * 1. ��ȯ ���� �ڷ����� ���� �� ����
 * 2. NULL ���� ó�� ����.
 * 	- toString()�� ���: null ���� ���ڿ��� �� ��ȯ �� NullPointException�� �߻���Ų��.
 *  - valueOf()�� ���: �Ķ���ͷ� null�� ���޵� ��� "null"�� ��ȯ�Ѵ�.
 * 
 *  null�� ���� �߻��� ������ ���Ӱ��� ������ ������ϱ� ��ƴٴ� ������ �ִ�. ���� NPE�� �����ϱ� ����
 *  String.valueOf()�� ����ϴ� ���� ����.
 */
