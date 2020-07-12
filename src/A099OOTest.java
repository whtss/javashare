public class A099OOTest {
    public static void main(String[] args) {
        A099Student s = new A099Student();//创建实例对象
        s.no = 1912281;
        s.name = "吕开玉";
        s.age = 23;
        s.sex = false;
        s.address = "海南儋州";
        System.out.println("学号是：" + s.no);
        System.out.println("姓名是：" + s.name);
        System.out.println("年龄是：" + s.age);
        if (s.sex) {
            System.out.println("性别是：男");
        }else {
            System.out.println("性别是：女");
        }
        System.out.println("住址是：" + s.address);

        A099Student stu = new A099Student();//stu是一个全新的变量
        //stu是一个引用，stu同时是一个局部变量，Student是变量的数据类型
        System.out.println("学号是：" + stu.no);//0
        System.out.println("姓名是：" + stu.name);//null
        System.out.println("年龄是：" + stu.age);//0
        System.out.println("性别是：" + stu.sex);//null
        System.out.println("住址是：" + stu.address);//null

        //编译报错  no这个实例变量不能采用“类名”的方式访问，必须通过对象才能访问
        //System.out.println(A099Student.no);
    }
}
