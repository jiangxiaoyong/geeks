package ArrrayAndString;

import java.util.Hashtable;
import java.util.Map;

public class MajorityElement {

	public int solution (int[] array){
		
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		for(int key : array){
			if(!hashtable.containsKey(key)){
				hashtable.put(key, 1);
			}
			else{
				hashtable.put(key, hashtable.get(key) + 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		//find max value, loop hash table keyset
		for(Integer key : hashtable.keySet()){
			int value = hashtable.get(key).intValue();
			if(value > max){
				max = value;
			}
		}
		
		if(max > array.length/2){
			return max;
		}
		else{
			return -1;
		}

	}
	
	
	public static void main(String[] args) {
		int[] array = {3,3,4,2,4,4,2,4,4};
		MajorityElement me = new MajorityElement();
		int i = me.solution(array);
		System.out.println("Majority is " + i);
	}
	

}
