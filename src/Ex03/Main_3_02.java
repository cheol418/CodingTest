package Ex03;

import java.util.*;

public class Main_3_02 {
	
	public static void main(String[] args) {
		Main_3_02 T = new Main_3_02();
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
		Arrays.sort(a);
		Arrays.sort(b); // sort 오름차순 정렬
		
		int p1=0,p2=0;
		
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}else if(a[p1]<b[p2]){
				p1++;
			}else {
				p2++;
			}
			
		}
		
		return answer;
	}
}
