class Solution {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> x = new LinkedList<>();
		if (root == null)
			return x;
		LinkedList<Node> l = new LinkedList<>();
		LinkedList<Node> save = new LinkedList<>();
		save.add(root);
		while (true) {
			if (save.size() == 0)
				break;
			l = save;
			save = new LinkedList<>();
			LinkedList<Integer> a = new LinkedList<>();
			while (true) {
				root = (l.size() > 0) ? l.removeFirst() : null;
				if (root == null)
					break;
				a.add(root.val);
				while (true) {
					Node n = (root.children.size() > 0) ? root.children.remove(0) : null;
					if (n == null)
						break;
					save.add(n);
				}
			}
			x.add((LinkedList<Integer>) a.clone());
		}
		return x;
	}
}
