//制作一个简单的计算器
//前提是输入的都合法
public class A065Switch {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = s.nextInt();
        System.out.print("请输入要进行的运算：");
        String operator = s.next();
        System.out.print("请输入第二个数字：");
        int num2 = s.nextInt();
        int result = 0;
        switch (operator){
            case "+" :
                result = num1 + num2;break;
            case "-" :
                result = num1 - num2;break;
            case "*" :
                result = num1 * num2;break;
            case "/" :
                result = num1 / num2;break;
            case "%" :
                result = num1 % num2;break;
        }
        System.out.println(num1 + operator + num2 + "=" + result);

    }
}
