public class A045DataType {
    public static void main(String[] args){
        //a++  先做赋值运算，再++
        int a = 100;
        System.out.println(a++);//100
        System.out.println(a);//101
        //++b  先++，再做赋值运算
        int b = 100;
        System.out.println(++b);//101
        System.out.println(b);//101


    }
}
