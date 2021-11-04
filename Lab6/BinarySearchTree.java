package Lab6;

public class BinarySearchTree<E extends Comparable> {
    private class Node {
        public  E  data;
        public Node    left;
        public Node    right;

    }

    private Node  root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else insertSub(newNode, root);

    }

    public void insertIterative(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right =null;


        if(root == null){
            root = newNode;
        }else {
            Node current = root;

            boolean notSet = false;
            while (!notSet) {
                int result = newNode.data.compareTo(current.data);

                if (result >= 0) {
                    //go right
                    if (current.right == null) {
                        current.right = newNode;
                    } else {
                        current = current.right;
                    }
                } else {
                    // go left
                    if (current.left == null) {
                        current.left = newNode;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
    }
    private void insertSub(Node newNode, Node node) {
        int result = newNode.data.compareTo(node.data);
        if (result >= 0) {
            //go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertSub(newNode, node.right);
            }
        } else {
            // go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(newNode, node.left);
            }

        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> b1 = new BinarySearchTree();

        b1.insert(9);
        b1.insert(2);
        b1.insert(6);
        b1.insert(7);
        b1.insert(8);



    }
  
}
