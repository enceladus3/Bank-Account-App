package bankaccountapp;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.SeparatorUI;

public class Savings extends Account {
    // List specific properties for Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoXKey;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDesposit) {
        super(name, sSN, initDesposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        this.safetyDepositBoxID =  (int) (Math.random() * Math.pow(10, 3));
        this.safetyDepositBoXKey = (int) (Math.random() * Math.pow(10, 3));

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("" +
                "Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoXKey
        );
    }
}
