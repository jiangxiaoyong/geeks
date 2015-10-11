package TreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBTree {

	public void solution(Node node){
		if(node == null) return;
		
		if(node.left != null && node.right != null){
			Node temp = node.left;
			node.left = node.right;
			node.right= temp;
		}
		
		if(node.left != null){
			solution(node.left);
		}
		
		if(node.right != null){
			solution(node.right);
		}
	}
	
	public void traverse(Node node){
		Queue<Qnode> queue = new LinkedList<Qnode>();
		queue.add(new Qnode(0, node	));
		
		while(!queue.isEmpty()){
			Qnode qn = queue.remove();
			int level = qn.level;
			Node n = qn.node;
			
			System.out.println(n.data);
			
			if(n.left != null){
				queue.add(new Qnode(level+1, n.left));
			}
			
			if(n.right != null){
				queue.add(new Qnode(level+1, n.right));
			}
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
		
		InvertBTree object = new InvertBTree();
		object.traverse(root);
		object.solution(root);
		System.out.println("====");
		object.traverse(root);
	}

}
