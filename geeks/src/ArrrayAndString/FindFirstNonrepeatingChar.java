package ArrrayAndString;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonrepeatingChar {

	public char solution(String str){
		char c = 0;
		Map<Character, Integer> table = new LinkedHashMap<Character, Integer>();
		for(char key : str.toCharArray()){
			if(!table.containsKey(key)){
				table.put(key, 1);
			}
			else{
				table.put(key, table.get(key).intValue()+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : table.entrySet()){
			if(entry.getValue().intValue() == 1){
				c = entry.getKey().charValue();
				break;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		FindFirstNonrepeatingChar object = new FindFirstNonrepeatingChar();
		char i = object.solution(str);
		System.out.println("char = " + i);
		
	}
	
}
