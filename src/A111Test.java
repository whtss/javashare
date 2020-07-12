public class A111Test {
    public static void main(String[] args) {
        A111House home =  new A111House();
        A111Person heyaodong = new A111Person();
        home.host = heyaodong;
        heyaodong.name = "贺耀东";
        System.out.println("房子原来的主人名字是：" + home.host.name);

        //房子换新主人了
        A111Person xuzhu = new A111Person();
        home.host = xuzhu;
        xuzhu.name = "徐铸";
        System.out.println("房子的新主人的名字是：" + home.host.name);
    }
}
