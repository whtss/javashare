//当程序员调用以下无参数的构造方法时，默认创建的日期是1970年1月1日
public class A141ThisDate {
    private int year;
    private int month;
    private int day;
    //构造方法
    public A141ThisDate() {//无参
        /*this.year = 1970;
        this.month = 1;
        this.day = 1;*/

        //这个表示创建了一个新的对象，不能用
        //new A141ThisDate();

        //使用这种方法不会调用新的java对象，同时又可以达到调用其他构造方法
        this(1970,1,1);
        //this()的这种语法结构必须在当前构造方法的第一行
    }
    public A141ThisDate(int year, int month, int day) {//有参
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //sertter and getter
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    //对外提供一个方法，可以将日期打印输出到控制台
    public void printDate() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
