/*
可以用static定义静态代码块：
     1、语法：static {
                 java语句;
              }
     2、静态代码块在类加载的时候执行，并且只执行1次
     3、静态代码块在一个类中可以编写多个，遵循自上而下的顺序执行，但默认在main方法前执行
     4、静态代码块的作用：
          静态代码块是java为程序员准备的一个特殊时刻，这个特殊时刻被称为类加载时刻。
          若希望在此时刻执行一段特殊程序，这段程序可以直接放到静态代码块中
          如：完成日志记录
     5、通常在静态代码块中完成预备工作，先完成数据的准备工具，如：初始化连接池解析xml文件
 */
public class A146StaticBlock {
    static {
        System.out.println("我是静态代码块-->1");
    }
    static {
        System.out.println("我是静态代码块-->2");
    }
    public static void main(String[] args) {
        System.out.println("我是main方法");
    }
    //就是写在main方法后面，也默认在main方法之前执行
    static {
        System.out.println("我是静态代码块-->3");
    }
}
