package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {
        /*
        // TEST //
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
        savacc1.showInfo();
        System.out.println("****************");
        chkacc1.showInfo();
        savacc1.deposit(5000);
        */

        List<Account> accounts = new LinkedList<>();

        // Read CSV file and create new accounts based on that data
        String file = "/home/oct/IdeaProjects/JavaOOP/src/bankaccountapp/NewBankAccounts.csv";
        List<String[]> newAccountHolders = myUtilities.CSV.read(file);

        for(var i : newAccountHolders) {
            //System.out.println("NEW ACCOUNT");
            var name = i[0];
            var sSN = i[1];
            var accountType = i[2];
            var initDeposit = Double.parseDouble(i[3]);
            //System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if(accountType.equals("Savings")) {
                //System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")){
                //System.out.println("OPEN A CHECKING ACCCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (var i: accounts) {
            System.out.println("\n************");
            i.showInfo();
        }

    }
}
