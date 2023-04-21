package class2.BankApplication;

public interface Bank {

    public int getBalance();

    public int addMoney(int money, String password, int accountNo);

    public int withDrawMoney(int money, String password, int accountNo);


}
