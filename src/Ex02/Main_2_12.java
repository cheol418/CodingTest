package Ex02;
import java.util.*;
class Main_2_12 {	

	public static void main(String[] args){
		Main_2_12 T = new Main_2_12();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt(); // 학생수
		int m=in.nextInt(); // 줄의수
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=in.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
	
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				int cnt=0;
				for(int k=0; k<m; k++){
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
						if(arr[k][s]==i) pi=s; // i의 등수
						if(arr[k][s]==j) pj=s; // j의 등수
					}
					if(pi<pj) cnt++; // i가 j보다 등수가 앞서면 cnt++
				}
				if(cnt==m){ // m번의 경우에서 모두 i의 등수가 앞서면 cnt == m
					answer++;
					//System.out.println(i+" "+j);
				}
			}
		}
		return answer;
	}
	
}