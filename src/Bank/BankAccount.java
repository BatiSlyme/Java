package Bank;

public class BankAccount {
    private double balance;
    private String accountNumber,customerName,email,phoneNumber;

    public BankAccount(){
        this("1233334",2.50,"deafult name","default msg","default phone");//call onther contructer
        System.out.println("Empty constructer called");
    }



    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("account constructer");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999",105.5,customerName,email,phoneNumber);

    }




    public void depositFunds(double depositAmount){
        this.balance+=depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if(this.balance-withdrawAmount<0){
            System.out.println("Only"+this.balance+"available. no withdraw allowed");
        }else{
            this.balance-=withdrawAmount;
            System.out.println("withdraw of"+withdrawAmount+"processes. remaining balance="+this.balance);
        }
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }













}
