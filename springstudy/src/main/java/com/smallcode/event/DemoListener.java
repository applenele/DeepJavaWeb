package com.smallcode.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Lenny on 2017/12/10.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMessage();
        System.out.println("收到消息：" + msg);
    }
}
