package com.wanghengbing.envelopes;

import com.wanghengbing.red.RedPacketFrame;

public class Envelopes extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public Envelopes(String title) {
        super(title);
    }
}
