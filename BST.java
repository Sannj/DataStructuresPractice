    package DataStructuresPractice;

    /**
     * Created by sanjanabadam on 8/16/16.
     */
    public class BST {

        public static TreeNode root;

        BST() {
            this.root = null;
        }

        public boolean search(int x) {

            if (this.root == null) {
                return false;
            }
            TreeNode temp = this.root;
            while (temp != null) {
                if (temp.data == x) {
                    return true;
                } else if (temp.data > x) {
                    temp = temp.left;

                } else if (temp.data < x) {
                    temp = temp.right;

                }
            }

            return false;

        }
    /*
        public boolean delete(int x){

        }
        */

        public boolean insert(int x) {

            //check if root is null
            if (root == null) {
                root = new TreeNode(x);
                return true;
            }
            TreeNode temp = root;
            TreeNode parent = null;
            while (true) {
                parent = temp;
                if (x < temp.data) {
                    temp = temp.left;
                    if (temp == null) {
                        parent.left = new TreeNode(x);
                        return true;
                    }
                } else if (x > temp.data) {
                    temp = temp.right;
                    if (temp == null)
                        parent.right = new TreeNode(x);
                    return true;
                }
            }

        }

        public TreeNode getRoot() {
            return root;
        }

        public void inOrder(TreeNode rootNode) {
            if (rootNode != null) {
                inOrder(rootNode.left);
                System.out.println(rootNode.data);
                inOrder(rootNode.right);
            }
        }

        public void PreOrder(TreeNode rootNode) {

            System.out.println(rootNode.data);
            inOrder(rootNode.left);
            inOrder(rootNode.right);
        }

        public void PostOrder(TreeNode rootNode) {
            inOrder(rootNode.left);
            inOrder(rootNode.right);
            System.out.println(rootNode.data);
        }

        public static void main(String[] args) {
            BST b = new BST();
            b.insert(10);
            b.insert(8);
            System.out.println(b.search(8));
            System.out.println(b.search(9));
            b.insert(11);
            b.insert(9);
            System.out.println(b.search(9));
            b.inOrder(b.getRoot());
            b.PreOrder(b.getRoot());
            b.PostOrder(b.getRoot());

    
        }


    }
