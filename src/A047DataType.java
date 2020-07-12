public class A047DataType {
    public static void main(String[] args) {
        //逻辑与（&），后面的也需要计算
        int x = 8; int y = 9;
        System.out.println(x < y & ++x < y);//先++，再比较
        int a = 8; int b = 9;
        System.out.println(a < b & a++ < b);//先比较，再++
        int m = 8; int n = 9;
        System.out.println(m > n & ++m > n);//逻辑与，前后都要计算
        System.out.println(m);//9

        //短路与（&），前面的满足条件，后面的不再计算
        int p = 8; int q = 9;
        System.out.println(p > q && ++p > q);//逻辑与，前后都要计算
        System.out.println(p);//8

        byte c = 10;
        c += 5;//等同于：c = (byte)(c + 5)，其实并不等同于：x = x + 5，因为这个式子左右类型不同，报错
        System.out.println(c);//15
        byte d = 10;
        d += 1000;//等同于：d = (byte)(d + 1000)，不会报错，但超出范围会损失精度
        System.out.println(d);
    }
}
