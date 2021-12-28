package Ex01;
import java.util.*;

public class Main_04_StringBuilder {
//단어 뒤집기 -> StringBuilder
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
			//생성된 객체를 변경시켜서 메모리 낭비를 줄인다.
			answer.add(tmp);
		}

		return answer;
	}

}
