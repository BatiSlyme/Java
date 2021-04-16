package AutoboxingChallange1;

import java.util.ArrayList;

public class Branche {
    private String name;
    private ArrayList<Customer> customers;

    public Branche(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerNmame,double amount){
        Customer existingCustomer=findCustomer(customerNmame);
        if (findCustomer(customerNmame)!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i=0;i<=this.customers.size();i++){
            Customer checkCustomer=this.customers.get(i);
            if (this.customers.get(i).getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }
}
