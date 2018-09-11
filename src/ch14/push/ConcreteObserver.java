package ch14.push;

public class ConcreteObserver implements Observer {

    private String observerState;//观察者的状态

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("ConcreteObserver：" + observerState);
    }
}
