/*
实例代码块【了解内容，不常用】
     1、实例代码块可以编写多个，遵循自上而下的顺序执行
     2、实例代码块在构造方法之前执行，构造方法执行一次，实例代码块执行一次
     3、实例代码块也是java语言为程序员准备的一个特殊时机，这个特殊时机被称为：对象初始化时机
 */
public class A147StaticNo {
    //构造方法
    public A147StaticNo() {
        System.out.println("我是构造方法！！！");
    }
    {
        System.out.println("我是实例代码块1");
    }
    {
        System.out.println("我是实例代码块2");
    }

    public static void main(String[] args) {
        System.out.println("我是主方法！！！！！");
        new A147StaticNo();
        new A147StaticNo();
    }
}
