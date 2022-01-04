package Ex03;

import java.util.*;

public class Main_3_05 {
	
	public static void main(String[] args) {
		Main_3_05 T = new Main_3_05();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		System.out.println(T.Solution(n));
		
	}
	
	public int Solution(int n) {
		int answer=0;
		int sum=0,lt=0,rt=0;
		int m = n/2+1;
		int[] arr = new int[m];
		
		for(int i=0;i<m;i++) {
			arr[i]=i+1;
		}//자연수 배열
		
		for(rt=0;rt<m;rt++) {
			sum+=arr[rt];
			if(sum==n) {
				answer++;
			}
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) {
					answer++;
				}
			}
		}
			
		
		return answer;
	}
}
