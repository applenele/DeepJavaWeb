package com.smallcode.utils;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class SerialNumberUtil {


    private static final AtomicInteger SERIAL = new AtomicInteger(Integer.MAX_VALUE);
    private static final int SHIFTS_FOR_TIMESTAMP = 17;
    private static final int SHIFTS_FOR_UNION = 14;
    private static final int SHIFTS_FOR_TYPE = 4;
    private static final int SHIFTS_FOR_NODE = 4;
    private static final int SHIFTS_FOR_SERIAL = 24;
    private static final int MASK_FOR_SERIAL = (1 << SHIFTS_FOR_SERIAL) - 1;
    private static final long MASK_FOR_UNION = (1 << SHIFTS_FOR_UNION) - 1;
    private static final long MASK_FOR_TYPE = (1 << SHIFTS_FOR_TYPE) - 1;

    public static String next(long mechId, long type) {
        long second = TimeUtil.toSeconds() - TimeUtil.toSeconds(TimeUtil.floor(new Date()));
        long serverId = 1; //这个地方应该可以根据tomcat参数来设置的，通过或tomcat参数来获取服务器id
        long serial = SERIAL.incrementAndGet();
        long secondShift = second << (64 - 1 - SHIFTS_FOR_TIMESTAMP);
        long unionShift = mechId << (64 - 1 - SHIFTS_FOR_TIMESTAMP - SHIFTS_FOR_UNION);
        long typeShift = type << (64 - 1 - SHIFTS_FOR_TIMESTAMP - SHIFTS_FOR_UNION - SHIFTS_FOR_TYPE);
        long nodeShift = serverId << (64 - 1 - SHIFTS_FOR_TIMESTAMP - SHIFTS_FOR_UNION - SHIFTS_FOR_TYPE - SHIFTS_FOR_NODE);
        long number = secondShift | unionShift | typeShift | nodeShift | (serial & MASK_FOR_SERIAL);
        return String.valueOf(TimeUtil.toInt(new Date())) + String.valueOf(number);
    }

    public static long getSecond(long id) {
        return id >> (SHIFTS_FOR_UNION + SHIFTS_FOR_TYPE + SHIFTS_FOR_NODE + SHIFTS_FOR_SERIAL);
    }

    public static long getMechId(long id) {
        return (id >> (SHIFTS_FOR_TYPE + SHIFTS_FOR_NODE + SHIFTS_FOR_SERIAL)) & MASK_FOR_UNION;
    }

    public static long getType(long id) {
        return (id >> (SHIFTS_FOR_NODE + SHIFTS_FOR_SERIAL)) & MASK_FOR_TYPE;
    }


    public static void main(String[] args) {
//        String number = next(12, 6);
//        System.out.println(number);  //2017112319492195304210432
        System.out.println("秒数："+getSecond(19492195304210432L));
        System.out.println("商户Id："+getMechId(19492195304210432L));
        System.out.println("订单类型："+getType(19492195304210432L));
    }
}
