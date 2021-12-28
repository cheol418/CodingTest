package Ex01;
import java.util.*;

public class Main_03 {
//가장 긴 단어
	public static void main(String[] args) {
		Main_03 T = new Main_03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//문장입력
		System.out.println(T.solution(str));
		
		
	}
	
	public String solution(String str) {
		String answer="";

//		int m =Integer.MIN_VALUE;
//		String[] s= str.split(" ");
//		for(String x : s) {
//			//System.out.println(x);
//			int len = x.length();
//			if(len>m) {
//				m=len;
//				answer=x;
//			}
//			
//		}
	
		int m =Integer.MIN_VALUE,pos;
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>m) { // len>=m 하면 안된다.
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m)
			answer=str;
		
		return answer;
	}

}
