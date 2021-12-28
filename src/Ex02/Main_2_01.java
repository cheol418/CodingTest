package Ex02;
import java.util.*;

public class Main_2_01 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x+" ");
		}

	}

	public static ArrayList<Integer> solution(int n,int[] arr){
		ArrayList<Integer> answer= new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1])
				answer.add(arr[i]);
		}
		
		return answer;

	}
}