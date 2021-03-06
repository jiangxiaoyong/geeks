package BinarySearching;

public class FindMissingNum {

	public int solution(int[] array){
		return binarySearch(array, 0, array.length-1);
	}
	
	public int binarySearch(int[] array, int left, int right){
		
		if(left > right) return -1;
		
		int mid = (right + left) / 2;
		
		if(mid > left && array[mid] - array[mid-1] > 1 ){//missing value between current and left
			return array[mid] -1;
		}
		
		if(array[mid+1] - array[mid] >1	){//missing value between current and right
			return array[mid] + 1;
		}
		
		if(mid > left && array[mid] - array[left] + 1 != count(array, array[mid])){//search left
			return binarySearch(array, left, mid -1);
		}
		else{
			return binarySearch(array, mid+1, right);
		}
	}
	
	public int count(int[] array, int value){
		int counter = 0;
		for(int i: array){
			counter++;
			if(i == value){
				break;
			}
		}
		return counter;
	}
	
	public int solution2(int[] array){
		int x1 = array[0];
		int x2 = 1;
		
		//xor all element in array
		for(int i =1 ; i < array.length; i++){
			x1 = x1 ^ array[i];
		}
		
		//xor number from 1 to n
		for(int i =2; i <= array.length +1; i++){
			x2 = x2 ^ i;
		}
		
		return x1^x2;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,8};
		FindMissingNum object = new FindMissingNum();
		int num = object.solution2(array);
		System.out.println(num);
	}

}
