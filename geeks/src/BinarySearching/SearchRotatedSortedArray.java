package BinarySearching;

public class SearchRotatedSortedArray {

	public int solution(int[] array, int target){
		if(array.length == 1){
			return array[0];
		}
		
		return binarySearch(array, 0, array.length -1, target);
	}
	
	public int binarySearch(int[] array, int left, int right, int target){
		if(left > right){
			return -1;
		}
		
		int mid = (left + right) / 2;
		
		if(array[mid] == target){
			return mid;
		}
		
		if(array[left] < array[mid]){
			if(target >array[left] && target < array[mid]){
				return binarySearch(array, left, mid -1, target);
			}
			else{
				return binarySearch(array, mid + 1, right, target);
			}
		}
		else if(array[mid] < array[right]){
			if(target > array[mid] && target < array[right]){
				return binarySearch(array, mid + 1 , right, target);
			}
			else{
				return binarySearch(array, left, mid -1, target);
			}
		}
		else{
			if(array[mid] == array[left]){
				if(target > array[mid] && target < array[right]){
					return binarySearch(array, mid + 1, right, target);
				}
			}
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
		int i = srsa.solution(array,10);
		System.out.println("index = " + i);
	}
	
}
