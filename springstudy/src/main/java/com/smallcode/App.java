package com.smallcode;

import com.smallcode.taskexecutor.AsyncTaskService;
import com.smallcode.taskexecutor.TaskExectorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
//        demoPublisher.publish("event test");

//        AwareService awareService = context.getBean(AwareService.class);
//        awareService.outputResult();


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExectorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 100; i++) {
            asyncTaskService.executeAsyncTask(i);
        }

        System.out.println("Hello World!");
    }
}
