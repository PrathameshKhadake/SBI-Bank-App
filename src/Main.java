public class Main {
    public static void main(String[] args) {

        SBIBank b = new SBIBank("Prathamesh", "P123", 2000);
        System.out.println(b);

        System.out.println(b.fetchBalance("P123"));//fetch bal pass. correct
        System.out.println(b.fetchBalance("p123"));//fetch bal pass. wrong

        System.out.println(b.addmoney(500));//add

        System.out.println(b.withdrawmoney("P123", 200));//pass. correct
        System.out.println(b.withdrawmoney("p123", 300));//pass. wrong
        System.out.println(b.withdrawmoney("P123", 5000));//pass. correct but ammount insufficient

        System.out.println(b.changepassword("P123", "p12"));//change pass.
        System.out.println(b.changepassword("p123", "p12"));//old pass. wrong

        System.out.println(b.fetchBalance("p12"));//fetch bal. after pass. change

        System.out.println("The interest of 5 year is: " + b.interest(5));

    }
}