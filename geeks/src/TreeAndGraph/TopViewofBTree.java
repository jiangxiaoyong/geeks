package TreeAndGraph;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewofBTree {

	public void TopView(Node node){
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Queue<Qnode> queue = new LinkedList<Qnode>();
		queue.add(new Qnode(0, node));
		
		while(!queue.isEmpty()){
			Qnode qn = queue.remove();
			int level = qn.level;
			Node n = qn.node;
			
			if(!map.containsKey(level)){
				map.put(level, n.data);
			}
			
			if(n.left!=null){
				queue.add(new Qnode(level+1, n.left));
			}
			
			if(n.right != null){
				queue.add(new Qnode(level-1, n.right));
			}
		}
		
		for(Integer key : map.keySet()){
			System.out.println(map.get(key).intValue());
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
		
		TopViewofBTree object = new TopViewofBTree();
		object.TopView(root);
	}

}
