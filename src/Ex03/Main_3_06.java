package Ex03;

import java.util.*;

public class Main_3_06 {
	
	public static void main(String[] args) {
		Main_3_06 T = new Main_3_06();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.Solution(n, k, arr));
		
	}
	
	public int Solution(int n,int k,int[] arr) {
		int answer=0;
		int cnt=0,lt=0,rt=0; //cnt 0->1 ¹Ù²Û È½¼ö
		
		for(rt=0;rt<n;rt++) {
			if(arr[rt]==0) {
				cnt++;
			}
			while(cnt>k) {
				if(arr[lt]==0) {
					cnt--;
				}
				lt++;
			}
			int len = rt-lt+1;
			answer=Math.max(answer, len); 
		}
		
		
		return answer;
	}
}
