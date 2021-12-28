import java.util.*;

public class Main_04 {
//�ܾ� ������ -> ����������
	public static void main(String[] args) {
		Main_04 T = new Main_04();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str= new String[n];
		
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		
		for(String x : T.solution(n,str)) {
			
			System.out.println(x);
		}
		
		
	}
	
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> answer=new ArrayList<>();
		
		for(String x : str) {
			
			//x�� ���� �迭�� toCharArray���
			char[] s = x.toCharArray(); //���ڹ迭
			//�ܾ��� �Ǿ� lt, �ǵ� rt
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s); //�迭 -> String ����
			answer.add(tmp);
		}

		return answer;
	}

}
