package com.smallcode.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * *Aware 是外部对容器的内部服务访问。
 * 原则上 spring容器和Bean是不耦合的，想获取到spring容器提供的服务，则需要实现*Aware，这样bean和spring容器耦合了。
 * Created by Lenny on 2017/12/10.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    public void setBeanName(String name) {
        beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {

    }

    public void outputResult() {
        System.out.println("beanName:" + beanName);
    }
}
