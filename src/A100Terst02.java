public class A100Terst02 {
    public static void main(String[] args) {
        //与上一个版本不一样
        A100User u = new A100User();//创建user对象

        //上一个版本
        //u.addr = new A100Address;
        A100Address a = new A100Address();//创建Address对象
        u.addr = a;//这个语句把两个对象连接起来
        a.city = "菏泽";
        a.street = "王集镇街道";
        a.code = "274400";
        System.out.println(a.city);
        System.out.println(a.street);
        System.out.println(a.code);

    }
}
