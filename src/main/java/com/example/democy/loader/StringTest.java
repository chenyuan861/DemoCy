package com.example.democy.loader;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * 整个项目的恶意攻击，窃取，所以获取的String还是APi的，这个就是双亲委派机制
 *
 */
public class StringTest {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();
        calendar.setTime(new Date());
        //calendar.add(Calendar.HOUR_OF_DAY,-3);
        calendar.add(Calendar.HOUR,-4);
        System.out.println(calendar.getTime());

        BigDecimal bigDecimal= new BigDecimal(0);
        for(int i=0;i<4;i++){
            bigDecimal=  bigDecimal.add(BigDecimal.valueOf(i));
        }
        System.out.println(bigDecimal.toString());
    }

}
