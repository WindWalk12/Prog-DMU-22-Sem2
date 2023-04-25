package Exercise3;

public class App {
    public static void main(String[] args) {
        SortedLinkedListDouble sll = new SortedLinkedListDouble();
        sll.addElement("a");
        sll.addElement("b");
        sll.addElement("z");
        sll.udskrivElements();
        sll.addElement("c");
        System.out.println();
        sll.udskrivElements();
        System.out.println();
        sll.removeElement("b");
        sll.udskrivElements();
    }
}
