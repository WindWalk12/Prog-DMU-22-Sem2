package Exercise2;

public class App {
    public static void main(String[] args) {
        //Left
        BinaryTree<Integer> bt15 = new BinaryTree<>(15);
        BinaryTree<Integer> bt25 = new BinaryTree<>(25);

        BinaryTree<Integer> bt11 = new BinaryTree<>(11, null, bt15);
        BinaryTree<Integer> bt30 = new BinaryTree<>(30, bt25, null);

        BinaryTree<Integer> bt22 = new BinaryTree<>(22, bt11, bt30);

        //Right
        BinaryTree<Integer> bt88 = new BinaryTree<>(88);

        BinaryTree<Integer> bt90 = new BinaryTree<>(90, bt88, null);

        BinaryTree<Integer> bt77 = new BinaryTree<>(77, null, bt90);

        //Root
        BinaryTree<Integer> bt45 = new BinaryTree<>(45, bt22, bt77);

        System.out.println("Size: " + bt45.size());
        System.out.println("Height: " + bt45.height());
        //Preorder: 45 22 11 15 30 25 77 90 88
        //Inorder: 11 15 22 25 30 45 77 88 90
        //Postorder: 15 11 25 30 22 88 90 77 45
        System.out.print("Preorder: ");
        bt45.preOrder();
        System.out.println();
        System.out.print("Inorder: ");
        bt45.inOrder();
        System.out.println();
        System.out.print("Postorder: ");
        bt45.postOrder();
        System.out.println();
    }
}
