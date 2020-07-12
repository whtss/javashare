public class A156FinalTest {
    public static void main(String[] args) {
        A156FinalUser u = new A156FinalUser(30);
        //又创建一个User对象
        u = new A156FinalUser(50);//程序执行至此，表示以上对象已经变成垃圾数据，等待回收

        //带final
        final A156FinalUser user = new A156FinalUser(30);
        System.out.println(user.id);
        //final修饰的引用，一旦指向某个对象，不能再指向其他对象，被指向的对象无法被垃圾回收机制回收
        //user = new A156FinalUser(50);
        //但是所指向对象内部的内存是可以修改的
        user.id = 60;
        System.out.println(user.id);
    }
}
