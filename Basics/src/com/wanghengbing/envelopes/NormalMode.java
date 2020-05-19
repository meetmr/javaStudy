package com.wanghengbing.envelopes;

import com.wanghengbing.red.OpenMode;

import java.util.ArrayList;
/*
* 普通红包
*
* */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount; // 平均
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add( avg+mod );
        return list;
    }
}
