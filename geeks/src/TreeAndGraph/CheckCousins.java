package TreeAndGraph;

public class CheckCousins {

	public boolean solution(Node node, Node n1, Node n2){

		if(getHeight(node, n1, 1) != getHeight(node, n2, 1)){
			return false;
		}
		else{
			if(!sameParent(node, n1, n2)){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public boolean sameParent(Node node, Node n1, Node n2){
		if((node.left == n1 || node.right == n1) && (node.left == n2 || node.right == n2)){
			return true;
			
		}
		else{
			return false;
		}
	}
	
	public int getHeight(Node node, Node target, int level){
		if(node == null) return -1;
		
		if(node == target) return level;
		
		int height =getHeight(node.left, target, level+1);
		if(height != -1){
			return height;
		}
		else{
			return getHeight(node.right, target, level+1);
		}
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
		
		CheckCousins object = new CheckCousins();
		Node n1 = root.left.left; //4
		Node n2 = root.right.right;//8
		boolean d = object.solution(root, n1, n2);
		System.out.println(d);
	}

}
