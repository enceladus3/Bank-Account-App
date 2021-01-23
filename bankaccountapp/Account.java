package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String sSN; // Social security #
    private double balance;

    private static int index = 10_000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber(this.sSN);

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(String sSN) {
        String lastTwoOfSNN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSNN + uniqueID + randomNumber;
        //return String.valueOf(Integer.valueOf(lastTwoOfSNN) + uniqueID);
    }

    private void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Acrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
        printBalance();
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount);
        balance -= amount;
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println("NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%");
    }
}
