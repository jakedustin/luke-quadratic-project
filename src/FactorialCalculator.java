import tree.Node;

public class FactorialCalculator {

    Node[] head = new Node[10];

    public void getNames() {
        String s = 1 == 0 ? "hello" : "luke";
        System.out.println(s);

        if (1 != 0) {
            s = "hello";
        } else {
            s = "luke";
        }

        System.out.println(s);
    }
    public int calculate(int x) {
        System.out.println(this.readString());
        return 1;
    }

    public String readString() {
        return "Hello luke";
    }
}
