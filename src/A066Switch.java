//用switch语句判断考生的成绩属于哪个等级
//假设用户的输入均合法
public class A066Switch {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入考生的成绩：");
        double score = s.nextDouble();
        int grade = (int)(score / 10);
        char X = 'E';
        switch (grade) {
            case 9 : case 10 :
                X = 'A';break;
            case 8 :
                X = 'B';break;
            case 6 : case 7 :
                X = 'C';break;
            default :
                X = 'D';
        }
        System.out.println("该考生的分数等级是" + X);
    }
}
