package TreeAndGraph;


public class LeftOrRightViewofTree {

	int leftcurrent = 0;
	//left view
	public void LeftViewRecursion(Node node, int nextLevel){
		if(node == null) return;
		
		if(leftcurrent < nextLevel){
			System.out.println(node.data);
			leftcurrent = nextLevel;
		}
		
		LeftViewRecursion(node.left, nextLevel + 1);
		LeftViewRecursion(node.right, nextLevel + 1);
		
	}
	
	//right view
	int rightcurrent = 0;
	public void RightViewRecursion(Node node, int nextLevel){
		if(node == null) return;
		
		if(rightcurrent < nextLevel){
			System.out.println(node.data);
			rightcurrent = nextLevel;
		}
		
		LeftViewRecursion(node.right, nextLevel + 1);
		LeftViewRecursion(node.left, nextLevel + 1);
		
	}
	
	
	public static void main(String[] args) {
		Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.right.right = new Node(45);
        
        LeftOrRightViewofTree object = new LeftOrRightViewofTree();
        System.out.println("left view");
        object.LeftViewRecursion(root, 1);
        
        System.out.println("right view");
        object.RightViewRecursion(root, 1);
	}

}

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
}
