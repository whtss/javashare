public class A85Method {
    public static void main(String[] args) {
        int i = 10;
        add1(i);
        System.out.println("main-->" + i);//此时的i是10
    }
    public static void add1(int i) {
        i++;
        System.out.println("agg1-->" + i);//此时的i是11
    }
}
