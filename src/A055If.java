public class A055If {
    public static void main(String[] args) {
        //第一步：创建键盘扫描器对象22
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入您的年龄：");
        //第二步：调用Scanner对象的next方法接收用户输入
        double age = s.nextDouble();
        String result = "老年";
        if (age > 150 || age < 0){
            System.out.println("您输入的年龄不合法，如果您处在这个年龄段算我服");
        }else if (age < 3){
            result = "婴儿";
        }else if (age < 5){
            result = "幼儿";
        }else if (age < 15){
            result = "青少年";
        }else if (age < 30){
            result = "青年";
        }else if (age < 40){
            result = "壮年";
        }else if (age < 60){
            result = "中年";
        }
        if (age <= 150 && age >= 0){
            System.out.println("您的年龄所在的是" + result + "阶段");
        }
    }
}
