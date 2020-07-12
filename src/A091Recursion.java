//用递归计算1-n的和
public class A091Recursion {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入你要求的n：");
        int n = s.nextInt();
        int result = sum(n);
        System.out.println("求得的和是：" + result);
    }
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
