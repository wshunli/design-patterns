package ch14.pull;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {

        String state = ((ConcreteSubject) subject).getState();
        System.out.println("ConcreteObserver：" + state);

    }
}
