package Ex01;
import java.util.Scanner;

//��ҹ��� ��ȯ

public class Main_02 {
	public String solution(String str) {
		String answer="";
		
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x))
//				answer += Character.toUpperCase(x);
//			else
//				answer += Character.toLowerCase(x);
//		}
		
		//�ƽ�Ű�ڵ� Ȱ���� ���
		for(char x : str.toCharArray()) { //char�� ������
			if(x>=97 && x<=122)
				answer += (char)(x-32);
			else
			answer += (char)(x+32);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_02 T = new Main_02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));

	}

}
