package Ex01;
import java.util.*;
public class Main_01 {
	
	//문자세기
	
	public int solution(String str,char t) {
		int answer = 0 ;
		str = str.toUpperCase();
		t=Character.toUpperCase(t);
		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==t)
//			answer++;
//		}
		for(char x : str.toCharArray()) {
			//toCharArray -> 문자를 배열로 만든다.
			if(x==t)
				answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_01 T = new Main_01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		//charAt(n) -> n번째 문자를 가져와라.
		
		System.out.println(T.solution(str, c));
		
		
	}
	
}
