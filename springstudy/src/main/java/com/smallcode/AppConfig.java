package com.smallcode;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Lenny on 2017/12/10.
 */

@Configuration
@ComponentScan("com.smallcode")
@EnableScheduling  // 全局启用定时任务
public class AppConfig {

}
