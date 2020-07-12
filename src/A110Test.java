public class A110Test {
    public static void main(String[] args) {
        A110Student s = new A110Student();
        A110Computer c = new A110Computer();
        s.cc = c;
        s.name = "徐铸";
        c.brand = "lenovo";
        c.version = "T680";
        c.color = "黑色";
        System.out.println(s.name + "的笔记本电脑的品牌是" + s.cc.brand);
        System.out.println(s.name + "的笔记本电脑的型号是" + s.cc.version);
        System.out.println(s.name + "的笔记本电脑的颜色是" + s.cc.color);
    }
}
