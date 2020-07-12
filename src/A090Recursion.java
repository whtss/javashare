//计算1-n的和，不用递归
public class A090Recursion {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入要计算的n项和：");
        int n = s.nextInt();
        int i;
        int sum = 0;
        for (i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println("前" + n + "项和是：" + sum);
    }
}
