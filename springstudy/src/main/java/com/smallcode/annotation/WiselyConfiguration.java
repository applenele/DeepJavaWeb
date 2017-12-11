package com.smallcode.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;

/**
 * Created by Lenny on 2017/12/11.
 */

@ComponentScan
public @interface WiselyConfiguration {

    //相当于给 ComponentScan value 传值
    @AliasFor(
            annotation = ComponentScan.class,
            attribute = "value"
    )
    String[] value() default {};

}
