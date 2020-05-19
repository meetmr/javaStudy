public class Packing {
    public static void main(String[] args) {
        // 自动装箱  基本数据类型->包装类型对象
        // 自动拆箱  包装类对象->基本数据类型

        // int 的包装类 Integer
        Integer int1 = new Integer(10);
        Integer int2 = new Integer("4");
        System.out.println(int1);
        System.out.println(int2);

        Integer int3 = Integer.valueOf(10);
        
    }
}
