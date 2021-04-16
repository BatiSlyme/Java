package AutoboxingChallange1;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branche> branches;

    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branche>();
    }
    public boolean addBranch(String branchName){
        if (findBranch(branchName)==null){
            this.branches.add(new Branche(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName, double initialAmount){
        Branche branch=findBranch(branchName);
        if (branch!=null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branche branch=findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branche findBranch(String branchName){
        for (int i=0;i<=this.branches.size();i++){
            Branche checkCustomer=this.branches.get(i);
            if (this.branches.get(i).getName().equals(branchName)){
                return checkCustomer;
            }
        }
        return null;
    }
    public boolean listCustomer(String branchName,boolean showTransactions){
        Branche branch=findBranch(branchName);
        if (branch!=null){
            System.out.println("Customers details for branch "+branch.getName());
            ArrayList<Customer> branchCustomers=branch.getCustomers();
            for (int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer=branchCustomers.get(i);
                System.out.println("Customer "+ branchCustomer.getName()+"["+(i+1)+"]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transcations=branchCustomer.getTransactions();
                    for (int j=0;j<transcations.size();j++){
                        System.out.println("{"+(j+1)+"] Amount "+transcations.get(j));
                    }
                }
            }
            return true;
        }else
            return false;
    }

}
