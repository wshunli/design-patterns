package ch14;

public class ObserverPatternMain {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change("New State");
        subject.detach(observer);
        subject.change("New State");

    }
}
