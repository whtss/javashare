public class A119User {
    //属性私有
    private int age;
    //set方法和get方法都没有static关键字
    //set方法没有返回值，因为set方法只负责修改数据
    public void setAge(int a) {
        if (a > 0 && a < 150) {
            age = a;
        }else {
            System.out.println("您输入的年龄有误！！！");
            return;
        }
    }
    //get方法没有形参，因为只负责读取数据
    public int getAge() {
        return age;
    }
}
