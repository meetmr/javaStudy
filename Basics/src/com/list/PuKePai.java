package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PuKePai {
    public static void main(String[] args) {
        //获取牌
        ArrayList<String> poker = getPoker();

        // 打乱牌
        Collections.shuffle(poker);

        // 发牌
        // 定义4个个接受牌的集合
        ArrayList<String> gamePlayer1 = new ArrayList<>();
        ArrayList<String> gamePlayer2 = new ArrayList<>();
        ArrayList<String> gamePlayer3 = new ArrayList<>();
        ArrayList<String> hand = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if ( i>= 51){
                hand.add(p);
            }else if(i % 3 == 0){
                gamePlayer1.add(p);
            }else if(i % 3 == 1){
                gamePlayer2.add(p);
            }else {
                gamePlayer3.add(p);
            }
        }

        System.out.println("玩家1 "+gamePlayer1);
        System.out.println("玩家2 "+gamePlayer2);
        System.out.println("玩家3 "+gamePlayer3);
        System.out.println("底牌 "+hand);
    }

    public static ArrayList<String> getPoker(){
        ArrayList<String> poker = new ArrayList<>();  //定义扑克牌
        String[] decors = {"♥","♣","♦","♠"};  // 定义花色
        String[] pokeNos = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"}; // 定牌序号

        // 先把大王小王存进到扑克牌中
        poker.add("大王");
        poker.add("小王");
        for (String pokeNo:pokeNos) {
            for (String decor:decors) {
                poker.add(decor+pokeNo);
            }
        }
        return poker;
    }
}
