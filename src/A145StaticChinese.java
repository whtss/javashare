/*
成员变量声明为实例变量的时候
   所有对象都有这个属性，但不同对象的具体属性值不同
成员变量声明为静态变量的时候
   所有对象都有这个属性，且所有对象的属性值相同，建议使用静态变量，节省内存开销
*/
//中国人  类
public class A145StaticChinese {
    //身份证号，每个人都有不同的身份证号
    String id;
    //姓名，假设每个人都有不同的姓名
    String name;
    //国籍，每个人的国籍都是中国
    //这种特征属于类级别的，可以提升为整个模板的特征，可以在前面加static关键字修饰
    static String country = "中国";

    //构造方法
    public A145StaticChinese() {
    }

    public A145StaticChinese(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
