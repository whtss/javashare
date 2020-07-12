/*方法重载的优点：
*程序员调用方法时比较方便，虽然调用的是不同的方法，但是就感觉跟调用一个方法一样，不需要记忆太多方法名
* 代码美观
* 前提：功能相似的时候，方法名可以相同
* 但是，功能不同的时候，尽可能让方法名不同
*/
public class A086Overload {
    public static void main(String[] args) {
        //使用方法重载，调用方法的时候就像在使用一个方法一样
        //此时区分方法不再依靠方法名，而是依靠参数的数据类型
        System.out.println(add(1,2));
        System.out.println(add(1.0,2.0));
        System.out.println(add(1L,2L));
    }
    //以下三个方法构成了方法重载
    public static int add(int i,int j) {
        System.out.println("int类型求和");
        return i + j;
    }
    public static double add(double i,double j) {
        System.out.println("double类型求和");
        return i + j;
    }
    public static long add(long i,long j) {
        System.out.println("long类型求和");
        return i + j;
    }
}
