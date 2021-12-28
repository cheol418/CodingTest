package Ex02;
import java.util.*;
//피보나치 수열
public class Main_2_04 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print(solution(n)[i]+" ");
		}
	}

	public static int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
	 	
		for(int i=2;i<n;i++) {
			answer[i]=answer[i-1]+answer[i-2];
		}
		
		return answer;

	}
}