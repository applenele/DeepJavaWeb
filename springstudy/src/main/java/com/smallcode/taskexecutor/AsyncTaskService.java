package com.smallcode.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Lenny on 2017/12/10.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int id) {
        System.out.println("异步任务：" + id);
    }
}
