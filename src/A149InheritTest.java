public class A149InheritTest {
    public static void main(String[] args) {
        A149InheritCreditAccount creditAccount = new A149InheritCreditAccount();
        creditAccount.setActno("王新星");
        creditAccount.setBalabce(9999999999999.99);
        creditAccount.setCredit(100.0);
        System.out.println(creditAccount.getActno() + "的账户余额为" + creditAccount.getBalabce() + "信用度为" + creditAccount.getCredit());

    }
}
