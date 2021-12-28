package Ex02;
import java.util.*;

public class Main_2_03 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for(int i=0;i<n;i++) {
			arr1[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(solution(arr1,arr2)[i]);
		}
		
	}

	public static String[] solution(int[] arr1,int[] arr2){
		String[] answer=new String[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			if(arr2[i]-arr1[i]==1 || arr2[i]-arr1[i]==-2) {
				answer[i]="B";
			}else if(arr2[i]==arr1[i]){
				answer[i]="D";
			}else {
				answer[i]="A";
			}
		}
		
		return answer;

	}
}