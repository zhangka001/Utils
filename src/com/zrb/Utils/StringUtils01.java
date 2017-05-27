package com.zrb.Utils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhangruibiao on 17/5/11.
 */
public class StringUtils01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0 ; i < 10 ; i++){
            sb.append(String.valueOf(i));
        }
        Map<String,String> map = new HashMap<>();
        map.put("String",sb.toString());
        System.out.println(map.get("String"));
    }


}

class StringUtils03 {
    public static void main(String[] args) {



    }
}
