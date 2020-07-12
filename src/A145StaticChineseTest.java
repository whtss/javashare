public class A145StaticChineseTest {
    public static void main(String[] args) {
        A145StaticChinese wxx = new A145StaticChinese("3729221996","王新星");
        System.out.println(wxx.name + "的身份证号是" + wxx.id + "国籍是" + A145StaticChinese.country);

        A145StaticChinese lky = new A145StaticChinese("3729221997","吕开玉");
        System.out.println(lky.name + "的身份证号是" + lky.id + "国籍是" + A145StaticChinese.country);
    }
}
