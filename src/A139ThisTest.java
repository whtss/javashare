public class A139ThisTest {
    public static void main(String[] args) {
        //调用带有static的方法
        A139ThisTest.doSome();

        //调用不带static的方法
        A139ThisTest doother = new A139ThisTest();
        doother.doOther();
        System.out.println("--------------------");
        doother.run();
    }
    public static void doSome() {
        System.out.println("我是带有static的方法");
    }
    public void doOther() {
        System.out.println("我是不带static的方法");
    }
    //run是实例方法，调用run方法的一定是有
    //run是实例方法，调用run方法的一定是有对象存在的，一定是创建了对象才能调用run方法
    //所有可以正确执行doOther
    public void run() {
        //大括号的代码执行过程中一定是存在“当前对象”的
        System.out.println("冲鸭！！！");
        doOther();
    }
}
