package com.zrb.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by zhangruibiao on 17/5/22.
 */
public class lambdaTest {
    public static void main(String[] args) {

        IntStream.of(new int[]{1,2,3}).forEach(System.out::println);
        IntStream.range(1,3).forEach(System.out::println);
        IntStream.rangeClosed(1,3).forEach(System.out::println);
        Stream stream = Stream.of("a","b","c");
        String[] strArray = new String[] {"a","b","c"};
        stream = Stream.of(strArray);
//        String[] strAraay1 = stream.toArray(String[]::new);


    }

    public void test(){
        Stream stream = Stream.of("a","b","c");
        String[] strArray = new String[] {"a","b","c"};
        stream = Stream.of(strArray);
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();
    }
}
