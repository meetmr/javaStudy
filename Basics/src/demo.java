
public class demo {
    public static void main(String[] args) {
        for (int o = 0; o<10; o++){
            System.out.println("wanghengbing"+ o);
        }
        System.out.println("\n");
        System.out.println(add(10,20));
        // 根据传入类型不同调用不同的方法
        System.out.println(add(10.2F,20.3F));
    }

    //定义加法函数
    public static int add(int a,int b){
        return  a + b;
    }

    // 重载
    public static float add(float a , float b){
        return a + b;
    }

}
