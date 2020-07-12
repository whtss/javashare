//以下循环使用较少
public class A076For {
    public static void main(String[] args){
        int i,j;
        //给for循环起名for1
        for1:for (i=1;i<=3;i++) {
            //给for循环起名for2
            for2:for (j=1;j<=10;j++) {
                System.out.println(i + "," + j);
                if (j == 5) {
                    //给for循环起名字，这个时候跳出的是外层循环
                    break for1;
                }
            }
        }
    }
}
