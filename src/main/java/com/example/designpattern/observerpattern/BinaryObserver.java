package com.example.designpattern.observerpattern;

public class BinaryObserver extends Observer{

    /***
     * 注入主题对象并将观察者添加到主题对象中
     * @param subject
     */
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
