package Ex02;
import java.util.*;
//점수 계산
public class Main_2_07 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Main_2_07 T = new Main_2_07();
		System.out.println(T.solution(n,arr));
	}
	
	
	public int solution(int n,int[] arr){
		int answer=0;
		int tmp=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				tmp++;
			}
			else {
				tmp=0;
			}
			
			answer+=tmp;
		}

		
		return answer;
	}
	
}