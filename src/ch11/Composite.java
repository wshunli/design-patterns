package ch11;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        componentArrayList.add(component);
    }

    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }

}
