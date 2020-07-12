public class A056If {
    public static void main(String[] args) {
        //接收字符串暂时还不会弄
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统");
        System.out.print("请输入您的性别：");
        int sex = s.nextInt();//1代表男，0代表女
        if (sex != 1 && sex != 0) {
            System.out.println("您的性别是怎么回事？？？");
        }
        System.out.print("请输入今天的天气：");
        int weather = s.nextInt();//1代表晴天，0代表下雨
        if (weather == 0){
            if (sex == 1) {
                System.out.println("今天出门带一把大黑伞！");
            }else if (sex == 0) {
                System.out.println("今天出门带一把小花伞！");
            }
        }else if (weather == 1) {
            System.out.print("请输入今天的气温：");
            int tem = s.nextInt();
            if (tem > 30){
                if (sex == 1) {
                    System.out.println("今天记得带墨镜！");
                }else if (sex == 0) {
                    System.out.println("今天记得带太阳镜！");
                }
            }else {
                System.out.println("今天不热，不用带东西！");
            }
        }else {
            System.out.println("你有病呀，今天别出门了！");
        }
    }
}
