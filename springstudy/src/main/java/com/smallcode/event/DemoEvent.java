package com.smallcode.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Lenny on 2017/12/10.
 */
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
