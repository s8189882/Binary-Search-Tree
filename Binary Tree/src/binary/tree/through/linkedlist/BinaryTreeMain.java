package binary.tree.through.linkedlist;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		System.out.println("...Binary Tree Data Structure...");
		
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);

		System.out.println("\nBinary Tree Size = " + binaryTree.getSize() + "\n");
		binaryTree.printTree();
	}	
}
