package tree;

public class Tree {

    Node[] head = new Node[10];

    public void getNames() {
        for (Node n : head) {
            System.out.println(n.getName());
        }
    }
}
