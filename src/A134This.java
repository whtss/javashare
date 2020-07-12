//this变量中保存的地址指向了自身
//当一个行为执行过程中需要对象参与，那么这个这个方法一定要定义为实例方法，不要带有static关键字
public class A134This {
    //构造方法
    String name;
    public A134This() {
    }
    public void shopping() {
        System.out.println(name + "在购物");//多数情况下“this.”可以省略
        //完整写法
        System.out.println(this.name + "在超市购物");
    }
    public static void printName() {
        //带有static的方法中不能直接访问实例变量
        //System.out.println(name);
        //this不能使用在带有static的方法中
        //System.out.println(this.name);
    }
    public static void printName2() {
        //想访问name这个实例变量应该这样
        //创建
        A134This c = new A134This();
        c.name = "武海涛";
        System.out.println(c.name);
    }
}
