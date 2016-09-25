package DataStructuresPractice;
public class BinaryTreeTraversals{

	public static void main(String args[]){
		BinaryTreeTraversals binary = new BinaryTreeTraversals();
		Node root = new Node(10);
		Node node1 = new Node(5);
        Node node2 = new Node(4);
        Node node3 = new Node(1);
        Node node4 = new Node(7);
        Node node5 = new Node(9);
        Node node6 = new Node(13);
        Node node7 = new Node(12);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        System.out.println("Inorder traversal of this tree : ");
        binary.InOrder(root);
        System.out.println("\nPreorder traversal of this tree : ");
        binary.PreOrder(root);
        System.out.println("\nPostorder traversal of this tree : ");
        binary.PostOrder(root);

	}

	public void InOrder(Node root){
		if(root!=null){
			InOrder(root.left);
			System.out.print(root.data+ " ");
			InOrder(root.right);
		}
	}

	public void PreOrder(Node root){
		if(root!=null){
			System.out.print(root.data+ " ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}

	public void PostOrder(Node root){
		if(root!=null){
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data+ " ");
		}
	}



	public static class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}