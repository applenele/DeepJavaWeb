package com.smallcode.doctorstarter.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Lenny on 2017/12/28.
 */
public class HelloStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Hello World");
        System.out.println("Source:" + event.getSource());
    }
}
