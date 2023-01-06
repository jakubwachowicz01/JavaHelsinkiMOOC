
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Jakub's account",100);
        account.deposit(20);
        System.out.println(account);
    }
}
