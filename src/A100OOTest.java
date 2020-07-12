public class A100OOTest {
    public static void main(String[] args) {
        A100User u = new A100User();//创建User对象
        u.addr = new A100Address();//修改User对象内部实例变量addr的值

        //main方法中只能看到一个引用u，一切都只能通过u来访问
        u.addr.city = "武汉";
        u.addr.code = "关山街道";
        u.addr.code = "450046";
        System.out.println("城市：" + u.addr.city);
        System.out.println("街道：" + u.addr.street);
        System.out.println("邮编：" + u.addr.code);
    }
}
