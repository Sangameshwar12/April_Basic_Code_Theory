package class2;

public class Account {
    private int accontNo;

    private String password;

    private int balance;

    public Account(String password, int balance){
        this.accontNo = 1234;
        this.password = password;
        this.balance = balance;

    }

    public int getBalance(String passworSent){
        // put a validation of my choice
        if(passworSent == password){
            return balance;
        }
        return -1;
    }


      

    public String setPassword(String oldPassword, String newPassword){

        if(oldPassword == password){
            this.password = newPassword;
            return "Password Update Successfully!";
        }
        return "Please enter correct original password";

    }


}
