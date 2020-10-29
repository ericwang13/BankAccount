public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(13717, "password");

        System.out.println(account.getAccountID());
        System.out.println(account.getBalance());
        account.setPassword("4g^epZ3KTq4HR");

        System.out.println(account.withdraw(10));
        System.out.println(account.getBalance());

        System.out.println(account.deposit(1000));
        System.out.println(account.getBalance());

        System.out.println(account.deposit(-100));
        System.out.println(account.getBalance());

        System.out.println(account.withdraw(30));
        System.out.println(account.getBalance());
    }
}