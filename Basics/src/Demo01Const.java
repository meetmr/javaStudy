/* 常量：在程序运行期间，固定不变的量。
* 常量的分类：
* 1、字符串常量：String 凡是双引号引起来的部分，就是字符串常量（”asaw“、”54454“、”呵呵的撒“）
* 2、整数常量：int 直接写上数字，没有小数点。(45、457、-15)
* 3、浮点数常量：float 直接写上数字，有小数点。(4.5、45.54、-1.1)
* 4、布尔常量：Boolean true,false
* 5、空常量：null只代表没有任何数据
* 6、字符常量：char 用单引号引起来的单个字符就是字符常量('a','5','中')
*/
public class Demo01Const {
    public static void main(String[] args){
        // 字符串常量
        System.out.println("SVBA");
        System.out.println("");
        System.out.println("啊我我去");

        // 整数常量
        System.out.println(262);
        System.out.println(-262);

        // 浮点数
        System.out.println(6.54);
        System.out.println(0.54);

        // 布尔
        System.out.println(true);
        System.out.println(false);

        // 字符常量
        System.out.println('w');
        System.out.println('王');
        //System.out.println('');  Error:(30, 28) java: 空字符文字  不能直接写空

    }
}
