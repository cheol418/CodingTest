package Ex01;
import java.util.*;

public class Main_11 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();

		System.out.println(solution(str));


	}

	public static String solution(String s){
		String answer="";
		s = s+" ";
		int cnt=1;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				cnt++;
			}
			else {
				answer+=s.charAt(i);
				if(cnt>1) {
					//answer+=cnt;
					answer+=String.valueOf(cnt);
					cnt=1;
				}
			}
		}
		
		return answer;

	}
}