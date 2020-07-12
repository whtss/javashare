public class A132ConstructorGetter {
    private int no;
    private String name;
    private String birth;

    //自动生成构造方法

    public A132ConstructorGetter() {//无参数
    }
    public A132ConstructorGetter(int no, String name, String birth) {//有参数
        this.no = no;
        this.name = name;
        this.birth = birth;
    }
    //自动生成getter
    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }
}
