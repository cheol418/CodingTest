package Ex02;
import java.util.*;
//¼Ò¼öÀÇ °¹¼ö
public class Main_2_05 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		
		solution(n);
	}

	public static void solution(int n){
		int answer=0;
		int cnt=0;
		int[] ch=new int[n+1];
		for(int i=2;i<=n;i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i;j<=n; j=j+i) {
					ch[j]=1;
				}
			}
		}
		
		
//		for(int i=2;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				if(i%j != 0) {
//					cnt++;
//				}
//			}
//			
//			if(cnt==2)
//				answer++;
//		}
		
		
		System.out.println(answer);
	}
}