package ch11;

public class CompositeMain {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.operation();

        Composite branch = new Composite();
        root.add(branch);

        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        branch.add(leaf1);
        branch.add(leaf2);

        display(root);

    }

    public static void display(Composite root) {

        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.operation();
            } else {
                display((Composite) component);
            }
        }
    }
}
