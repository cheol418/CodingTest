package Ex01;
import java.util.*;

public class Main_12 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		String str=in.next();

		System.out.println(solution(n,str));


	}

	public static String solution(int n,String s){
		String answer="";
		for(int i=0;i<n;i++) {
			String tmp=s.substring(0,7).replace('#', '1').replace('*','0');
			int num=Integer.parseInt(tmp,2); //2Áø¼öÈ­
			answer+=(char)num;
			s=s.substring(7);
		}
		return answer;

	}
}