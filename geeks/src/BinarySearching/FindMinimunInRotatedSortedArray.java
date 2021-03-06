package BinarySearching;

public class FindMinimunInRotatedSortedArray {

	public int solution (int[] array){
		if(array.length == 1){
			return array[0];
		}
		
		return binarySearch(array, 0, array.length-1 );
	}
	
	public int binarySearch(int[] array, int left, int right){
		
		if(left > right){
			return array[0];
		}
		
		int mid = (left + right) / 2;
		
		//right hand side is minimum
		if(array[mid] > array[mid +1]){
			return array[mid+1];
		}
		
		//check mid self is minumum
		if(mid > left && array[mid] < array[mid-1] ){
			return array[mid];
		}
		
		if(array[mid] < array[right]){
			return binarySearch(array, left, mid-1);
		}
		else if(array[mid] > array[right]){
			return binarySearch(array, mid+1, right);
		}
		else if(array[mid] == array[left]){
			if(array[mid] != array[right]){
				return binarySearch(array, mid + 1,right);
			}
			else{
				return -1;
			}
		}
		return -1;


	}
	
	public static void main(String[] args) {
		//int[] array = {5, 6, 1, 2, 3, 4};
		//int[] array = {3,5,6,7,8,9,1,2};
		//int[] array = {1,1,2,2,3};
		//int[] array = {50,5,20,30,40};
		int[] array = {2,2,2,2,0,1,1,2};
		FindMinimunInRotatedSortedArray object = new FindMinimunInRotatedSortedArray();
		int i = object.solution(array);
		System.out.println("minimun is = " + i);
	}
	
}
