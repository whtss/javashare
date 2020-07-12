public class A102OOTest {
    public static void main(String[] args) {
        A100User u = new A100User();
        u = null;
        //以下程序编译通过，因为符合语法
        //运行时出现空指针异常
        //空引用访问实例相关的数据一定会出现空指针异常
        //System.out.println(u.number);
    }
}
