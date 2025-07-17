public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        // Test deposits
        acc1.deposit(500, "checking");
        acc1.deposit(1000, "savings");
        acc2.deposit(200, "checking");

        // Test withdrawals
        acc1.withdraw(100, "checking");
        acc1.withdraw(1500, "savings"); // Should give insufficient funds
        acc2.withdraw(50, "savings");   // Should give invalid account type or insufficient funds

        // Display account info
        System.out.println("\n--- Account 1 Info ---");
        acc1.displayAccountInfo();

        System.out.println("\n--- Account 2 Info ---");
        acc2.displayAccountInfo();

        // Display static info
        System.out.println("\nNumber of Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalBankMoney());
    }
}
