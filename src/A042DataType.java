public class A042DataType {
    public static void main(String[] args){
        //所有浮点型字面值默认当做double来处理
        double a = 3.1;
        System.out.println(a);
        //想要当做float来处理，需要添加F/f
        float b = 2.3f;
        System.out.println(b);
    }
}
