package Ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_3_01 {
	
	public static void main(String[] args) {
		Main_3_01 T = new Main_3_01();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n ; i++) {
			a[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int b[] = new int[m];
		for(int i=0; i<m ; i++) {
			b[i] = in.nextInt();
		}
		
		
		for(int x : T.Solution(n, m, a, b) )
			System.out.print(x+" ");
		
	}
	
	public ArrayList<Integer> Solution(int n,int m,int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0,p2=0;
	
		while(p1<n && p2<m) {
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]); // a[p1]을 add 하고 p1++이 된다.
			}else {
				answer.add(b[p2++]);
			}
		}
		
		while(p1<n) {
			answer.add(a[p1++]);
		}
		
		while(p2<m) {
			answer.add(b[p2++]);
		}
		
		return answer;
	}
}
