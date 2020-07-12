public class A083Method {
    public static void main(String[] args) {
        int i;
        for (i=1;i<10;i++) {
            if (i == 5) {
                return;//结束的不是for循环，是main方法
            }
            System.out.println(i);
        }
        //没有机会执行了，i=5时，直接跳出main方法
        System.out.println("Hello World");
    }
}
