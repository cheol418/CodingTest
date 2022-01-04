package Ex03;

import java.util.*;

public class Main_3_04 {
	
	public static void main(String[] args) {
		Main_3_04 T = new Main_3_04();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n ; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println(T.Solution(n, m, a));
		
	}
	
	public int Solution(int n,int m,int[] arr) {
		int answer=0;
		int sum=0,lt=0,rt=0;
		
		for(rt=0;rt<n;rt++) { //rt 증가 -> rt위치값 더하고 -> 값 확인
			sum+=arr[rt];
			if(sum==m)
				answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m)
					answer++;
			}
			
		}
		
		return answer;
	}
}
