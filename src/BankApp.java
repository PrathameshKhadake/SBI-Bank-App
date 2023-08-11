public interface BankApp {
    String fetchBalance(String password);

    String addmoney(double ammount);

    String withdrawmoney(String password, double ammount);

    String changepassword(String oldpassword, String newpassword);

    double interest(int year);


}
