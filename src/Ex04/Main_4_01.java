package Ex04;

import java.util.*;

public class Main_4_01 {
	public static void main(String[] args) {
		Main_4_01 T = new Main_4_01();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str= in.next();
		System.out.println(T.Solution(n,str));
	}
	
	public char Solution(int n, String str) {
		char answer = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x , map.getOrDefault(x, 0)+1); //key,value
			
		}
		
		int max=Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {//존재하는 key탐색
			//System.out.println(key);
			if(map.get(key)>max) {
				max=map.get(key);
				answer=key;
			}
		}
		
		return answer;
	}
}
