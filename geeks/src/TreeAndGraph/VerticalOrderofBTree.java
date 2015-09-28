package TreeAndGraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderofBTree {

	public void verticalOrder(Node node){
		
		Map<Integer, LinkedList<Integer>> map = new TreeMap<Integer, LinkedList<Integer>>();
		Queue<Qnode> queue = new LinkedList<Qnode>();
		queue.add(new Qnode(0, node));
		
		while(!queue.isEmpty()){
			Qnode qn = queue.remove();
			int level = qn.level;
			Node n = qn.node;
			
			//update map to record latest value for each vertical level
			if(!map.containsKey(level)){
				LinkedList<Integer> list = new LinkedList<Integer>();
				list.add(n.data);
				map.put(level, list);
			}
			else{
				LinkedList<Integer> list = map.get(level);
				list.add(n.data);
			}

			
			if(n.left!= null){
				queue.add(new Qnode(level +1, n.left));
			}
			
			if(n.right != null){
				queue.add(new Qnode(level-1, n.right));
			}
			
		}
		
		for(Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()){
			List<Integer> list = map.get(entry.getKey());
			System.out.println("next levle");

			for(Integer key: list){
				System.out.println("++ vertial order " + key);

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
		
		VerticalOrderofBTree object = new VerticalOrderofBTree();
		object.verticalOrder(root);
	}

}
