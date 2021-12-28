package Ex01;
import java.util.*;

public class Main_05 {
//Ư�� ���� ������
	public static void main(String[] args) {
		Main_05 T = new Main_05();
		Scanner sc = new Scanner(System.in);
		
		String str= sc.next();
		
		System.out.println(T.solution(str));
		
		
	}
	
	public String solution(String str) {
		String answer;
			
			//x�� ���� �迭�� toCharArray���
			char[] s = str.toCharArray(); //���ڹ迭
			//�ܾ��� �Ǿ� lt, �ǵ� rt
			int lt=0, rt=str.length()-1;
		
			while(lt<rt) {
				if(!Character.isAlphabetic(s[lt])) {//lt�� ���ĺ�?Ư��?
					lt++;
				}else if(!Character.isAlphabetic(s[rt])){//rt�� Ư��?
					rt--;
				}else {
					
					char tmp=s[lt];
					s[lt]=s[rt];
					s[rt]=tmp;
					lt++;
					rt--;
				}
				
				
			}
			String tmp=String.valueOf(s); //�迭 -> String ����
			answer=tmp;
			
		return answer;
	}

}
