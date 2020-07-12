public class A155FinalTest {
    //java规定实例变量被final修饰后，必须手动赋值，不能使用系统默认值
    //解决方案1
    final int i = 10;

    //解决方案2
    final int j;
    //构造方法
    public A155FinalTest() {
        this.j = 25;
    }
    //以上两种解决方法，本质一样，都是在构造方法执行过程中给实例变量赋值

    public static void main(String[] args) {
        A155FinalTest le = new A155FinalTest();
        System.out.println(le.i);
        System.out.println(le.j);
    }
}
