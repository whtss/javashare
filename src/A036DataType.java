public class A036DataType {

    //这里static必须加，别问为什么
    static int i = 100;
    //成员变量 没有赋值，系统会默认赋值
    //局部变量若不赋值会报错
    static int k;
    public static void main(String[] args){

        System.out.println(i);
        System.out.println(k);

    }
}
