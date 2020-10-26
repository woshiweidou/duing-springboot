package com.weidoubaobao.duying.listenner;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

    public TestEvent(Object source) {
        super(source);
    }

    public void printMessage(String mes){
        System.out.println("自定义的事件 我要打印出来");
    }
}
