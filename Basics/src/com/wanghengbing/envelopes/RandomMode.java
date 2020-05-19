package com.wanghengbing.envelopes;

import com.wanghengbing.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // 总金额
        int lefttotalMoney = totalMoney;

        // 总个数
        int lefttotalCount = totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            int mo = new Random().nextInt(lefttotalMoney / lefttotalCount * 2) + 1;
            list.add(mo);
            lefttotalCount --;
            lefttotalMoney -=mo;
        }
        list.add(lefttotalMoney);
        int vaMoney = 0;
        for (int i = 0; i < list.size(); i++) {
            vaMoney += list.get(i);
        }
        if (vaMoney != totalMoney){
            return null;
        }
        return list;
    }
}
