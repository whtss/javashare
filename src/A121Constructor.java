/*
构造方法的语法结构：
[修饰符列表] 构造方法名(形参) {
构造方法体
}
 */
//构造方法
//构造方法支持重载机制，在一个类中编写多个构造方法，显然已经构成了方法重载
public class A121Constructor {
    //无参数的构造方法
    public A121Constructor() {
        System.out.println("I love You!");
    }
    //有参数的构造方法
    public A121Constructor(int i) {
        System.out.println("I love You!" + i + "次");
    }
    public A121Constructor(String name) {
        System.out.println( name + "love You!");
    }
    public A121Constructor(int i ,String name) {
        System.out.println(name + "love You!" + i + "次");
    }
}
