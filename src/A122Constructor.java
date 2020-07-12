public class A122Constructor {
    public static void main(String[] args) {
        A122Constructor.doOther();//类名.方法名
        doOther();//在同一个类中可以不用写类名

        A122Constructor con = new A122Constructor();
        con.doSome();//引用.方法名
    }
    public void doSome() {
        System.out.println("我没有static，调用我需要引用.方法名");
    }
    public static void doOther() {
        System.out.println("我有static，调用我需要类名.方法名，在同一个类中可以不用写类名");
    }
}
