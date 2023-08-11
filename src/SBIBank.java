import java.util.UUID;

public class SBIBank implements BankApp{

    private String name;

    private String accountNo;

    private String password;

    private double balance;

    final double rateofinterest = 9.0;

    final String IFSCCode = "SBI000786";

    public SBIBank() {
    }

    public SBIBank(String name, String password, double balance){
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current balance is: " + this.balance;
        }
        return "Password is incorrect!!!";
    }

    @Override
    public String addmoney(double ammount) {
        this.balance += ammount;
        return "Rs. " + ammount + " is credited in your account and current balance is: " + this.balance;
    }

    @Override
    public String withdrawmoney(String password, double ammount) {
        if(this.password.equals(password)){
            if(this.balance <= ammount){
                return "Balance is insufficient";
            }
            this.balance -= ammount;
            return "Rs. " + ammount + " is debited from your account and your current balance is: " + this.balance;
        }
        return "Passwors is incorrect!!!";
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(oldpassword.equals(this.password)){
            this.password = newpassword;
            return "Password is change successfully";
        }
        return "oldpassword is incorrect!!!";
    }

    @Override
    public double interest(int year) {
        return (this.balance * rateofinterest * year)/100;
    }

    @Override
    public String toString() {
        return "SBIBank{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
