package com.smallcode.schedule;

import com.smallcode.annotation.WiselyConfiguration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lenny on 2017/12/11.
 */
@Service
@WiselyConfiguration
public class ScheduleTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
    }
}
