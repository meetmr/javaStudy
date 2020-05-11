/*
    变量:程序运行期间，内容可以发生改变的量。
    创建一个变量并且使用的格式:
    数据类型 变量名称; //创建了一个变量
    变量名称 = 数据值; //赋值，将右边的数据值，赋值交给左边的变量
    一步到位的格式:
    数据类型变量名称= 数据值; //在创建一个变量的同时，立刻放入指定的数据值

    使用变量的时候，有一些注意事项:
    1.如果创建多个变量，那么变量之间的名称不可以重复。
    2.对于float和long类型来说，字母后缀F和L不要丢掉。
    3.如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
    4.没有进行赋值的变量，不能直接使用; -定要赋值之后，才能使用。
    5.变量使用不能超过作用域的范围。
    [作用域] :从定 义变量的一行开始，一直到直接所属 的大括号结束为止。
    6.可以通过一个语句来创建多个变量，但是一般情况不推荐这么写。
*/



public class Variable {
    public static void main(String[] args) {
        // 创建变量 数据类型 变量名称;
        int num1;
        // 赋值  变量名称 = 数据值;
        num1 = 50;
        System.out.println("变量num1的值：" + num1);
        // 改变变量的值
        num1 = 100;
        System.out.println("变量num1的值：" + num1);

        //  一步到位的格式:
        //  数据类型 变量名称 = 数据值;
        int num2 = 200;
        System.out.println("变量num2的值：" + num2);
        // 改变变量的值
        num2 = 500;
        System.out.println("变量num2的值：" + num2);

        System.out.println("==================================");
        byte num3 = 20;  // byte取值范围为 -128~127
        System.out.println("变量num3的值：" + num3);

        System.out.println("==================================");
        long num4 = 322222222222L;  // byte取值范围为 -128~127
        System.out.println("变量num4的值：" + num4);
        System.out.println("==================================");

        float num5 = 15.41F;
        System.out.println("变量num5的值：" + num5);

        double num6 = 5.41;
        System.out.println("变量num6的值：" + num6);

        char zifu1 = '啊';
        System.out.println("变量zifu1的值：" + zifu1);
        System.out.println("==================================");
    }

}
