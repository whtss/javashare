//父类型引用指向子类型对象，这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态
//两种类型之间必须要有继承关系，否则无法编译通过
public class A152PolymorphicTest {
    public static void main(String[] args) {
        //子类型-->父类型，向上转型【多态】
        A152PolymorphicAnimal cat = new A152PolymorphicCat();
        /*
        java程序分为编译阶段和运行阶段，若编译无法通过，根本无法运行
        编译器检查cat为Animal类型的，Animal中有move方法，所以编译通过
        称为静态绑定，编译阶段绑定。
        在运行阶段JVM堆内存中真实创建的对象是Cat，那么运行阶段一定会调用Cct中的move方法
        称为动态绑定，运行阶段绑定。
        无论Cat有没有重写move方法运行阶段一定是调用的Cat的move()方法
         */
        cat.move();

        //编译器检查cat为Animal类型的，Animal中没有catchMouse方法，所以编译报错，根本无法运行
        //cat.catchMove;

        /*
        新的需求：想让以上对象执行catchMouse()方法
             可以将cat强制类型转换
             cat是A152PolymorphicAnimal（父类），转换为A152PolymorphicCat（子类），称为向下转型
         */
        A152PolymorphicCat cat2 = (A152PolymorphicCat)cat;
        //当调用的方法是子类型中特有的，必须向下转型
        cat2.catchMouse();
        //以上两行代码等同于下面一行
        ((A152PolymorphicCat) cat).catchMouse();

        //多态
        A152PolymorphicAnimal bird = new A152PolymorphicBird();
        //以下程序编译正确，因为bird是Animal类型的，Animal和Cat存在继承关系，向下转型合法
        //但程序运行阶段报错，因为JVM真实存在的对象是Bird类型，和Cat无继承关系，无法转换为Cat类型
        //A152PolymorphicCat bird2 = (A152PolymorphicCat)bird;

        //向下转型存在安全隐患，可以用instanceof运算符避免
        if(bird instanceof A152PolymorphicCat) {//如果bird是Cat类型的实例
            A152PolymorphicCat bird2 = (A152PolymorphicCat)bird;
            bird2.catchMouse();
        }else if (bird instanceof A152PolymorphicBird) {//如果bird是Bird类型的实例
            A152PolymorphicBird bird2 = (A152PolymorphicBird) bird;
            bird2.fly();
        }
    }

}
