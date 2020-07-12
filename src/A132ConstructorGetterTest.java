public class A132ConstructorGetterTest {
    public static void main(String[] args) {
        A132ConstructorGetter c1 = new A132ConstructorGetter();
        System.out.println(c1.getNo());
        System.out.println(c1.getName());
        System.out.println(c1.getBirth());

        A132ConstructorGetter c2 = new A132ConstructorGetter(81,"徐铸","1999");
        System.out.println(c2.getNo());
        System.out.println(c2.getName());
        System.out.println(c2.getBirth());
    }
}
