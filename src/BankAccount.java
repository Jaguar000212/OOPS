public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final String customerName;
    System.Logger logger = System.getLogger(BankAccount.class.getName());

    public BankAccount(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        logger.log(System.Logger.Level.valueOf("INFO"),"Deposited " + amount + " to account " + this.accountNumber);
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in account " + this.accountNumber);
        }
        this.balance -= amount;
        logger.log(System.Logger.Level.valueOf("INFO"), "Withdrew " + amount + " from account " + this.accountNumber);
    }
}
