public class A039DataType {
    public static void main(String[] args){
        int a = 10;//这是十进制
        int b = 010;//这是八进制，以0开头
        int c = 0x10;//这是十六进制，以0x开头
        long d = 2147483648000L;//默认当做int类型，想让它当做long类型，需要加L
        System.out.println(a);//10
        System.out.println(b);//8
        System.out.println(c);//16
        System.out.println(d);//2147483648000
    }
}
