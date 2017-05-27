package com.zrb.Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangruibiao on 17/5/11.
 */
public class DateUtils {

    public static void transformDate(Long l,String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(l != null){
            Date date = new Date(l);
            String format = sdf.format(date);
            System.out.println(date);
            System.out.println(format);
        }
        if(s != null){

            try {
                Date d =  sdf.parse(s);
                System.out.println(d.getTime());
            }catch (Exception e){
                e.printStackTrace();
            }
            List<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(4);
            System.out.println(list.toString());
        }
    }
}
