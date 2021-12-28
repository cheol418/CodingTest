package Ex02;
import java.util.*;
//격자판 최대합
public class Main_2_09 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			arr[i][j]=in.nextInt();
			}
		}
		Main_2_09 T = new Main_2_09();
		
		System.out.print(T.solution(n,arr));
	}
	
	
	public int solution(int n,int[][] arr){
		int answer= Integer.MIN_VALUE;
		int g=0,s=0,Ld=0,Rd=0;
		
		for(int i=0;i<n;i++) {
			g=s=0;
			for(int j=0;j<n;j++) {
				g+=arr[i][j]; //행의합
				s+=arr[j][i]; //열의합
			}
			
			answer=Math.max(answer, g);
			answer=Math.max(answer, s);
		}
		
		for(int i=0;i<n;i++) {
			Ld+=arr[i][i]; //왼대각
			Rd+=arr[i][n-i-1]; //오른대각
			}
			
			answer=Math.max(answer, Ld);
			answer=Math.max(answer, Rd);
		
		return answer;
	}
	
}