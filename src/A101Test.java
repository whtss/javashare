//二者联系起来
public class A101Test {
    public static void main(String[] args) {
        //创建一个妻子对象
        A101Wife wangyihuan = new A101Wife();
        wangyihuan.name = "王奕欢";

        //创建一个丈夫对象
        A101Husband heyaodong = new A101Husband();
        heyaodong.name = "贺耀东";

        //结婚
        wangyihuan.h = heyaodong;
        heyaodong.w = wangyihuan;
        //System.out.println(heyaodong.name + "的妻子的名字叫" +wangyihuan.name);//这个不能将二者联系起来
        System.out.println(heyaodong.name + "的妻子的名字叫" +heyaodong.w.name);
        System.out.println(wangyihuan.name + "的丈夫的名字叫" + wangyihuan.h.name);

    }
}
