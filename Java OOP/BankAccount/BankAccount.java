public class BankAccount {
    // Member Variables
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    
    // Static variable to keep track of number of accounts
    private static int numberOfAccounts = 0;
    private static double totalBankMoney = 0;

    // Constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++;
    }

    // Private helper to generate random 10-digit account number
    private String generateAccountNumber() {
        String accNum = "";
        for (int i = 0; i < 10; i++) {
            accNum += (int)(Math.random() * 10);
        }
        return accNum;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalBankMoney() {
        return totalBankMoney;
    }

    // Deposit Method
    public void deposit(double amount, String accountType) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid account type for deposit.");
            return;
        }
        totalBankMoney += amount;
        System.out.println("Deposited $" + amount + " into " + accountType + " account.");
    }

    // Withdraw Method
    public void withdraw(double amount, String accountType) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalBankMoney -= amount;
                System.out.println("Withdrew $" + amount + " from checking account.");
            } else {
                System.out.println("Insufficient funds in checking.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalBankMoney -= amount;
                System.out.println("Withdrew $" + amount + " from savings account.");
            } else {
                System.out.println("Insufficient funds in savings.");
            }
        } else {
            System.out.println("Invalid account type for withdrawal.");
        }
    }

    // Display Balances
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Checking Balance: $" + checkingBalance);
        System.out.println("Savings Balance: $" + savingsBalance);
        System.out.println("Total Balance: $" + getTotalBalance());
    }
}
