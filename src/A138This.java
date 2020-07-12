public class A138This {
    int i = 10;//在main方法中不能直接访问
    static int j = 11;//在main方法中可以直接访问
    public static void main(String[] args) {
       // System.out.println(i);//编译报错
        System.out.println(j);
    }
}
