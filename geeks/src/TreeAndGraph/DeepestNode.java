package TreeAndGraph;

public class DeepestNode {
	int deepest = Integer.MIN_VALUE;
	int value;
	
	public int findDeepest(Node node, int level){
		
		if(node == null) return level-1;
		if(node.left == null && node.right == null){
			if(level > deepest){
				deepest = level;
				value = node.data;
				return deepest;
			}
		}
		
		return Math.max(findDeepest(node.left, level+1) , findDeepest(node.right, level+1));
		
		
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		root.left.right.right.right = new Node(9);
		root.right.right = new Node(8);
		
		DeepestNode object = new DeepestNode();
		int i = object.findDeepest(root, 0);
		System.out.println(i);
		System.out.println("value =  " + object.value);
	}

}
