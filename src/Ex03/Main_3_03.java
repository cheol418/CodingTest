package Ex03;

import java.util.*;

public class Main_3_03 {
	
	public static void main(String[] args) {
		Main_3_03 T = new Main_3_03();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n ; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println(T.Solution(n, k, a));
		
	}
	
	public int Solution(int n,int k,int[] a) {
		int answer=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
			answer=sum;
		}
		for(int i=k;i<n;i++) {
			sum+=(a[i]-a[i-k]);
			answer=Math.max(answer, sum); //�ִ밪
		}		
		
		return answer;
	}
}
