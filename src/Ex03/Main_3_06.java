package Ex03;

import java.util.*;

public class Main_3_06 {
	
	public static void main(String[] args) {
		Main_3_06 T = new Main_3_06();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n ; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println(T.Solution(n, k, a));
		
	}
	
	public int Solution(int n,int k,int[] arr) {
		int answer=0;
		int sum=0,lt=0,rt=0;
		
		
		
		return answer;
	}
}
