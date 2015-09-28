package TreeAndGraph;

public class MaxinumSum {
	int max = Integer.MIN_VALUE;
	
	public int max(Node node){
		if(node == null){
			return -1;
		}
		
		return find(node,0);
	}
	
	public int find(Node node, int cur){
		if(node == null) return max;
		
		cur = cur + node.data;
		if(cur > max){
			max = cur;
		}
		
		return Math.max(find(node.left, cur), find(node.right, cur));
	}
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		root.right.right = new Node(8);
		
		
		MaxinumSum object = new MaxinumSum();
		int max = object.max(root);
		System.out.println("max value " + max);
	}

}
