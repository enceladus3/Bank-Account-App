# Bank-Account-App

Backend app for handling customer bank account and performing transactions.
Major highlights:
- Reads a .csv file of names, Social Security Numbers, account type and initial deposit;
- Uses a proper data structure to hold all these accounts;
- We have 2 types of accounts Savings and Current. Both savings and current accounts share the following properties:
deposit,
withdraw,
transfer,
print the info.
- Both will have an 11 digit account numbe generated in this way : 1 or 2 depending on whether it's a savings account or a current account, last two digits of the Social Security Number(SSN), a unique 5-digit number and a random 3-digit number;
- Savings account holders are given a Locker and that's identified by 3-digit number and accesses with the 4-digit code;
- Current account holders are assigned a debit card with a 12-digit number and a 4-digit PIN;
- Both accounts will use an interface that determines the base interest rate (usually done using an API);
- Our savings account will use .25 less than the base rate and our current accounts will have 10% interest rate of base rate;
- The show info method should reveal relevant account information as well as information specific to the current account or savings account.
