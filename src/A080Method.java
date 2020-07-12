//用方法计算两个数的和
/*方法的语法结构
[修饰符列表] 返回值类型 方法名(形参列表) {
    方法体
        }
*/
public class A080Method {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入要求和的第一个数：");
        int i = s.nextInt();
        System.out.print("请输入要求和的第二个数：");
        int j = s.nextInt();
        System.out.println("这两个数的和是：" + add(i,j));
    }
    //方法名最好见名知意；首字母小写，后面每个单词首字母大写
    public static int add(int i ,int j) {
        return i + j;
    }
}
