package ArrrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class kLargestElementinArray {

	public int[] solution(int[] array){

		int[] temp = {0,0,0};
		for(int i : array){
			if(i > temp[0]){
				shift(temp,i);
				System.out.println(Arrays.toString(temp));

			}
		}
		
		
		return temp;
	}
	
	public void shift(int[] array, int max){
		int i,j;
		i = array[0];
		j = array[1];
		
		array[0] = max;
		array[1] = i;
		array[2] = j;
	}
	public static void main(String[] args) {
		int[] array = {1, 23, 12, 9, 30, 2, 50};
		kLargestElementinArray object= new kLargestElementinArray();
		int[] a = object.solution(array);
		System.out.println(Arrays.toString(a));
	}

}
