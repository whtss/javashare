public class A084Method {
    public static void main(String[] args) {
        m();
    }
    //以下语句编译报错，因为无法保证return 语句100%执行
    /*
    public static int m() {
        int a = 10;
        //编译时程序并不会判断a>3是否成立
        if (a>3) {
            return 1;
        }
    }
    */
    //以下程序保证return 1或者return 0一定会有一个执行，编译正确
    public static int m() {
        int a = 10;
        if (a>3) {
            return 1;
        }else {
            return 0;
            //return语句下面的语句永远不会被执行到，故编译报错
            //System.out.println("Hello world");
        }
    }
}
