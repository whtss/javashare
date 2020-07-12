public class A062Switch {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入星期几：");
        String day = s.next();
        int num = 0;
        switch (day){
            case "星期一" :
                num = 1;break;
            case "星期二" :
                num = 2;break;
            case "星期三" :
                num = 3;break;
            case "星期四" :
                num = 4;break;
            case "星期五" :
                num = 5;break;
            case "星期六" :
                num = 6;break;
            case "星期日" :
                num = 7;break;
        }
        if (num != 0) {
            System.out.println( num + "是一个吉祥的数字");
        }else {
            System.out.println("你输入的啥，你是二吧");
        }
    }
}
