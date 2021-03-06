package ArrrayAndString;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

	int solution(String str){
		
		List<Character> list = new ArrayList<Character>();
		int max = Integer.MIN_VALUE;
		for(char c: str.toCharArray()){
			if(!list.contains(c)){
				list.add(c);
			}
			else{
				if(list.size()>max){
					max = list.size();
					list.clear();
					list.add(c);
				}
			}
		}
		
		if(list.size() > max){
			max = list.size();
		}
		System.out.println(max);
		return max;

	}
	public static void main(String[] args) {
		String s = "aabcbcdbca";
		LongestSubString object = new LongestSubString();
		int i = object.solution(s);
		System.out.println(i);
	}

}
