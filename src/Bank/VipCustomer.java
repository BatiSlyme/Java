package Bank;

public class VipCustomer {
    private String name ,email;
    private double creditLimit;

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email) {
        this(name,email,1234123);
    }

    VipCustomer(){
        this("Default name","eli@abv.bg",1213123);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
