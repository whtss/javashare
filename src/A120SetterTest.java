public class A120SetterTest {
    public static void main(String[] args) {
        A120Setter setter = new A120Setter();
        setter.setId(120);
        setter.setName("徐铸");
        System.out.println("id是：" + setter.getId());
        System.out.println("姓名是：" + setter.getName());
        A120Setter set = new A120Setter();
        set.setId(99);
        set.setName("贺耀东");
        System.out.println("id是：" + set.getId());
        System.out.println("姓名是：" + set.getName());
    }
}
