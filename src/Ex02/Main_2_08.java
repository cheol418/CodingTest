package Ex02;
import java.util.*;
//등수 계산
public class Main_2_08 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Main_2_08 T = new Main_2_08();
		for(int x :T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}
	
	
	public int[] solution(int n,int[] arr){
		int[] answer= new int[n];
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[i])
					cnt++;
			}
			answer[i]=cnt;
		}
		
		return answer;
	}
	
}