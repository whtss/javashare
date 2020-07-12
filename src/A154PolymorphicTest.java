//面向对象编程的核心：定义好类，然后实例化为对象，给一个环境驱使一下，让各个对象之间协作起来形成一个系统
/*
* 多态的作用：【以主人喂养宠物为例】
*      降低程序的耦合度，提高程序的扩展力
*      能使用多态尽量使用多态
*      父类型引用指向子类型对象
* 核心：面向抽象编程，尽量不要面向具体编程
* */
public class A154PolymorphicTest {
    public static void main(String[] args) {
        A154PolymorphicCat tom = new A154PolymorphicCat();
        A154PolymorphicHost hyd = new A154PolymorphicHost();
        tom.name = "汤姆";
        hyd.feed(tom);
        hyd.feed(new A154PolymorphicCat());//也可以这样访问

        //主要又想喂狗了
        A154PolymorphicDog erHa = new A154PolymorphicDog();
        erHa.name = "二哈";
        hyd.feed(erHa);
        hyd.feed(new A154PolymorphicDog());//也可以这样访问
    }
}
