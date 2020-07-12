public class A143Comprehensive {
    int i = 10;//没有static的变量
    public static void doSome() {//带有static的方法
        System.out.println("do some!!!");
    }
    public void doOther() {//没有static的方法
        System.out.println("do other!!!");
    }
    public static void method1() {//带有static的方法
        //调用doSome
        //完整方式调用
        A143Comprehensive.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        A143Comprehensive c2 = new A143Comprehensive();
        c2.doOther();
        //省略方式调用

        //访问i
        //完整方式访问
        System.out.println(c2.i);
        //省略方式访问
    }
    public void method2() {//没有static的方法
        //调用doSome
        //完整方式调用
        A143Comprehensive.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        this.doOther();
        //省略方式调用
        doOther();

        //访问i
        //完整方式访问
        System.out.println(this.i);
        //省略方式访问
        System.out.println(i);
    }
    public static void main(String[] args) {//主方法
        //调用method1
        //完整方式调用
        A143Comprehensive.method1();
        //省略方式调用
        method1();

        //调用method2
        //完整方式调用
        A143Comprehensive c1 = new A143Comprehensive();
        c1.method2();
        //省略方式调用

    }
}
