package Ex02;
import java.util.*;

public class Main_2_02 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
			System.out.print(solution(n, arr));
		
	}

	public static int solution(int n,int[] arr){
		int answer= 1,max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
			
		}
		return answer;

	}
}