package com.demo.supplier;

import java.util.function.Supplier;

public class DemoTest {
    /**
     * Supplier 获取指定泛型对象数据 生成数据
     * @param supplier
     * @return
     */
    public static int getMax(Supplier<Integer> supplier){
      return supplier.get();
    }

    public static void main(String[] args) {
        Integer[] integers = {48,78,47,16,487};

        // 获取最大值
        int max1 = getMax(() -> {
            int max = integers[0];
            for (int i = 0; i < integers.length; i++) {
                if (max < integers[i]) {
                    max = integers[i];
                }
            }
            return max;
        });
        System.out.println(max1);
    }
}
