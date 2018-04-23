package com.smallcode;

import com.smallcode.service.PayService;
import com.smallcode.service.WxPayService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
//        ServiceLoader<PayService> serviceLoader = ServiceLoader.load(PayService.class);
//
//        Scanner scan = new Scanner(System.in);
//
//
//        for (PayService service : serviceLoader) {
//            service.pay();
//        }

        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
