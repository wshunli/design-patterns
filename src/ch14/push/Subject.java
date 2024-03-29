package ch14.push;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {

        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 删除观察者对象
     *
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("Detached an observer");
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState) {

        for (Observer observer : list) {
            observer.update(newState);
        }
    }

}
