package Ex01;
import java.util.*;

public class Main_05 {
//특정 문자 뒤집기
	public static void main(String[] args) {
		Main_05 T = new Main_05();
		Scanner sc = new Scanner(System.in);
		
		String str= sc.next();
		
		System.out.println(T.solution(str));
		
		
	}
	
	public String solution(String str) {
		String answer;
			
			//x를 문자 배열로 toCharArray사용
			char[] s = str.toCharArray(); //문자배열
			//단어의 맨앞 lt, 맨뒤 rt
			int lt=0, rt=str.length()-1;
		
			while(lt<rt) {
				if(!Character.isAlphabetic(s[lt])) {//lt가 알파벳?특문?
					lt++;
				}else if(!Character.isAlphabetic(s[rt])){//rt가 특문?
					rt--;
				}else {
					
					char tmp=s[lt];
					s[lt]=s[rt];
					s[rt]=tmp;
					lt++;
					rt--;
				}
				
				
			}
			String tmp=String.valueOf(s); //배열 -> String 으로
			answer=tmp;
			
		return answer;
	}

}
