//这个和int i那个不一样
/*
方法调用的时候，设计到参数传递的问题，传递的时候，java只遵循一种语法机制
就是将变量中保存的“值”传递过去，只不过有时这个值是一个字面值10，
有时是另一个java对象的内存地址0x1234。
 */
public class A133Constructor {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);//传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是另一个java对象的内存地址
        System.out.println("main-->" + u.i);//21
        /*
        u本身有内存地址，是局部变量，u变量中保存的那个值也非常特殊，
        这个值是另一个java对象在堆内存只中的内存地址
        也就是说这个例子中的地址0x1234和上个例子中的字面值10地位一样
         */
    }
    public static void add(User u) {
        u.i++;
        System.out.println("add-->" + u.i);//21
    }
}
class User {
    int i;//实例变量
    //构造方法
    public User(int i) {
        this.i = i;
    }
}
