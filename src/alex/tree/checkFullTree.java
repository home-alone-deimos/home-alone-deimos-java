package alex.tree;

public class checkFullTree {
    public static void main(String[] args) {
        binaryTree treeFull = new binaryTree(1);
        binaryTree treeNotFull = new binaryTree();

        treeFull.root.left = new Node(2);
        treeFull.root.right = new Node(3);
        treeFull.root.left.left = new Node(4);
        treeFull.root.left.right = new Node(5);
        treeFull.root.right.left = new Node(6);
        treeFull.root.right.right = new Node(7);
        treeNotFull.root = new Node(1);
        treeNotFull.root.left = new Node(2);
        treeNotFull.root.right = new Node(3);
        treeNotFull.root.left.left = new Node(4);
        treeNotFull.root.left.right = new Node(5);
        treeNotFull.root.right.left = new Node(6);
        treeNotFull.root.right.right = new Node(7);
        treeNotFull.root.left.left.left = new Node(8);

        System.out.println("Is first tree full?");
        System.out.println(isFull(treeFull.root));
        System.out.println("Is second tree full?");
        System.out.println(isFull(treeNotFull.root));
    }

    static boolean isFull(Node node){
        if (node == null){
            return true;
        }

        if (node.left == null && node.right == null){
            return true;
        }

        if (node.left != null && node.right != null){
            return (isFull(node.left) && isFull(node.right));
        }

        return false;
    }
}
