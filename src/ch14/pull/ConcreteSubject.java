package ch14.pull;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("ConcreteSubject：" + state);
        this.nodifyObservers();//状态发生改变，通知各个观察者

    }
}
