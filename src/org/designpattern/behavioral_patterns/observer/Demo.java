package org.designpattern.behavioral_patterns.observer;

import java.util.*;

class ObservableValue extends Observable{

    private int value = 0;

    public ObservableValue(int n) {
        this.value = n;
    }

    public void setValue(int n) {
        value = n;
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return value;
    }
}

class TextObserver implements Observer {

    private ObservableValue oValue;

    public TextObserver(ObservableValue ov) {
        oValue = ov;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs == oValue) {
            System.out.println(oValue.getValue());
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        ObservableValue observableValue = new ObservableValue(0);
        TextObserver textObserver = new TextObserver(observableValue);
        observableValue.addObserver(textObserver);
        new Thread(()-> {
            for (int i=0; i<10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                observableValue.setValue(i + new Random().nextInt(10));
            }
        }).start();
    }
}
