package Ex01;
import java.util.*;

public class Main_04_StringBuilder {
//�ܾ� ������ -> StringBuilder
	public static void main(String[] args) {
		Main_04_StringBuilder T = new Main_04_StringBuilder();
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
			String tmp =new StringBuilder(x).reverse().toString();
			//������ ��ü�� ������Ѽ� �޸� ���� ���δ�.
			answer.add(tmp);
		}

		return answer;
	}

}
