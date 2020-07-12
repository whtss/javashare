/*
1、封装之后看不到事务复杂的一面，对外提供简单的入口。
2、封装之后才会形成真正的“对象”，真正的“独立体”
3、封装就以意味着程序可以重复使用，并且适用性比较强，任何场合都可以使用
4、封装之后，事务本身的安全性得以提高
 */
public class A119Pack {
    public static void main(String[] args) {
        A119User user = new A119User();
        //age属性私有，在外部不能直接访问
        user.setAge(-35);
        System.out.println(user.getAge());
    }
}
