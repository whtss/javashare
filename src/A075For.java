//输出1-100所有素数
//每八个素数换行一次
public class A075For {
    public static void main(String[] args) {
        int i,j;
        int flag;
        int count = 0;
        for (i=2;i<=100;i++) {
            flag = 0;
            for (j=2;j<i;j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
                System.out.print("素数是：" + i + "\t");
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
