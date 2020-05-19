package com.wanghengbing.objectarray;
import java.util.ArrayList;
import java.util.Random;
public class DemoListRandom {
    public static void main(String[] args) {
        // 定义int 集合
        ArrayList<Integer> in = new ArrayList<>();
        for (int i = 0; i<30; i++){
            in.add(new Random().nextInt(33) +1);
        }
        System.out.println(in);
//        for (int i = 0; i<in.size(); i++){
//            System.out.print(" "+ in.get(i));
//        }

//       printArrayList(in);
//         ArrayList<Integer> return_list = getSamllList(in);
        System.out.println(getSamllList(in));
    }

    // 自定义打印集合
    public static void printArrayList(ArrayList<Integer> array_list){
        System.out.print("{");
        for (int i = 0; i<array_list.size(); i++){
            if (array_list.size()-1 == i){
                System.out.print(array_list.get(i)+"}");
            }else {
                System.out.print(array_list.get(i)+"@");
            }
        }
    }

    // 传递一个集合，输错这个集合中的所有偶数
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> big_list){
        ArrayList<Integer> return_list = new ArrayList<>();
        for (int i = 0; i<big_list.size(); i++){
            if (big_list.get(i) % 2 == 0){
                return_list.add(big_list.get(i));
            }
        }
        return return_list;
    }
}
