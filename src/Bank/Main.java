package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bobsAcc=new BankAccount(/*"1234",0.00,"Bob Barley","eli@abv.bg","087812345"*/);
        System.out.println(bobsAcc.getAccountNumber());
        System.out.println(bobsAcc.getBalance());


        bobsAcc.withdraw(100.0);
        bobsAcc.depositFunds(50);
        bobsAcc.withdraw(100);

        //BankAccount timsAccount=new BankAccount("tim","eli@abv.bg",1231234235);
        //System.out.println(timsAccount.getAccountNumber()+"name"+timsAccount.getCustomerName());

        VipCustomer person1=new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2=new VipCustomer("bob","eli!@abv.bg",250023);
        System.out.println(person2.getName());
        VipCustomer person3=new VipCustomer("tim","al4o!@12",4444);
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }

}
