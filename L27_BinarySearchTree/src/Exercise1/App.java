package Exercise1;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        //Root
        bst.add(45);

        //Left
        bst.add(22);
        bst.add(11);
        bst.add(15);
        bst.add(30);
        bst.add(25);

        //Right
        bst.add(77);
        bst.add(90);
        bst.add(88);

        bst.print();
        System.out.println(bst.findMax());
        System.out.println(bst.findMin());
        bst.removeMin();
        bst.print();
        bst.removeMax();
        bst.print();
    }
}
