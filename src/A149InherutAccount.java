public class A149InherutAccount {
    private String actno;//账户名
    private double balabce;//余额
    //构造方法
    public A149InherutAccount() {
    }
    public A149InherutAccount(String actno, double balabce) {
        this.actno = actno;
        this.balabce = balabce;
    }

    //setter and getter
    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalabce() {
        return balabce;
    }
    public void setBalabce(double balabce) {
        this.balabce = balabce;
    }
}
