class Account {
    private int balance = 1000;
    public int getBalance() {
        return balance;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.getBalance());
    }
}
