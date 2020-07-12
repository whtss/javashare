/*构成了方法重载的条件
*  在同一个类中
*  方法名相同，参数列表不同：数量不同，顺序不同，类型不同
*/
//方法重载和方法名+参数列表有关系
//方法重载和返回值类型无关
//方法重载和修饰符列表无关

public class A087Overload {
    public static void main(String[] args) {
        m();
        m(1);
        m(1,2.0);
        m(1.0,2);
        m(2.0);
    }

    //以下方法构成了方法重载：数量不同
    public static void m() {
        System.out.println("这是不传递参数的");
    }
    public static void m(int a) {
        System.out.println("这个传递int类型参数" + a);
    }

    //顺序不同
    public static void m(int a, double b) {
        System.out.println("这个先传递int再传递double" + a + "," + b);
    }
    public static void m(double a, int b) {
        System.out.println("这个先传递double再传递int" + a +"," + b);
    }

    //类型不同
    //public static void m(int a) {}
    //和第二个重复了，（不是方法重载，是方法重复）放开就报错了
    public static void m(double a) {
        System.out.println("这个传递double类型参数" + a);
    }
}
