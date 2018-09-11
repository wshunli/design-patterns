package ch14.push;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("ConcreteSubject：" + state);
        this.nodifyObservers(state);//状态发生改变，通知各个观察者
    }
}
