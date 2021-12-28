import java.util.*;

public class Main_04 {
//단어 뒤집기 -> 직접뒤집기
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
			
			//x를 문자 배열로 toCharArray사용
			char[] s = x.toCharArray(); //문자배열
			//단어의 맨앞 lt, 맨뒤 rt
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s); //배열 -> String 으로
			answer.add(tmp);
		}

		return answer;
	}

}
