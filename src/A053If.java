public class A053If {
    public static void main(String[] args) {
        double grade = 97.5;
        if (grade > 100 || grade < 0){
            System.out.println("分数输入有误，请重新输入");
        }else if (grade >= 90){
            System.out.println("等级：A");
        }else if (grade >= 80){
            System.out.println("等级：B");
        }else if (grade >= 60){
            System.out.println("等级：C");
        }else {
            System.out.println("等级：D");
        }
    }
}
