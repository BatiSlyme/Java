package OOPmastereChallangePt1;

class Hamburger{
    private String breadRollType,name,meat;
    private double price;

    private String addition1Name;
    private double addition1price;

    private String addition2Name;
    private double addition2price;

    private String addition3Name;
    private double addition3price;

    private String addition4Name;
    private double addition4price;

    public Hamburger(String name,String meat,String breadRollType, double price) {
        this.name=name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void priceAdd1(String name,double price){
        this.addition1Name=name;
        this.addition1price=price;
    }
    public void priceAdd2(String name,double price){
        this.addition2Name=name;
        this.addition2price=price;

    }
    public void priceAdd3(String name,double price){
        this.addition3Name=name;
        this.addition3price=price;
    }
    public void priceAdd4(String name,double price){
        this.addition4Name=name;
        this.addition4price=price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice=this.price;
        System.out.println(this.name+" hamburger"+" on a "+this.breadRollType+" roll"
                + " price is: " +this.price);
        if(this.addition1Name!=null) {
            hamburgerPrice += this.addition1price;
            System.out.println("added "+this.addition1Name+ " for the price "
                    + this.addition1price);
        }
        if(this.addition2Name!=null) {
            hamburgerPrice += this.addition2price;
            System.out.println("added "+this.addition2Name+ " for the price "
                    +this.addition2price);
        }
        if(this.addition3Name!=null){
            hamburgerPrice+=this.addition3price;
            System.out.println("added "+this.addition3Name+ " for the price "
                    +this.addition3price);
        }
        if(this.addition4Name!=null){
            hamburgerPrice+=this.addition4price;
            System.out.println("added "+this.addition4Name+ " for the price "
                    +this.addition4price);
        }
        return hamburgerPrice;

    }
}
class healthyBurger extends Hamburger {
    private String healthyExtra1;
    private double healthPrice1;

    private String healthyExtra2;
    private double healthPrice2;

    public healthyBurger(String meat, double price) {
        super("healthy", meat, "brown rye", price);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1 = name;
        this.healthPrice1 = price;
    }

    public void addHealthAddition12(String name, double price) {
        this.healthyExtra2 = name;
        this.healthPrice2 = price;
    }


    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1 != null) {
            hamburgerPrice += this.healthPrice1;
            System.out.println("Added " + this.healthyExtra1 + " for an extra" + healthPrice1);
        }
        if (this.healthyExtra2 != null) {
            hamburgerPrice += this.healthPrice2;
            System.out.println("Added " + this.healthyExtra1 + " for an extra" + healthPrice2);
        }
        return hamburgerPrice;
    }
}

class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "sausige & beacon", "White", 14.54);
        super.priceAdd1("Chips",2.75);
        super.priceAdd2("Drink",1.30);
    }

    @Override
    public void priceAdd1(String name, double price) {
        System.out.println("cannot add additional items to a deluse burger");
    }

    @Override
    public void priceAdd2(String name, double price) {
        System.out.println("cannot add additional items to a deluse burger");
    }

    @Override
    public void priceAdd3(String name, double price) {
        System.out.println("cannot add additional items to a deluse burger");
    }

    @Override
    public void priceAdd4(String name, double price) {
        System.out.println("cannot add additional items to a deluse burger");
    }
}

public class Main {

    public static void main(String[] args){
        Hamburger hamburger=new Hamburger("basic","sausige","white",3.56);
        double price=hamburger.itemizeHamburger();

        hamburger.priceAdd1("tomatto",0.27);
        hamburger.priceAdd2("carrot",1.23);
        hamburger.priceAdd3("lettuce",0.3);
        hamburger.priceAdd4("cheese",1.12);
        price=hamburger.itemizeHamburger();
        System.out.println("total cost: "+ hamburger.itemizeHamburger());

        healthyBurger healthyburger=new healthyBurger("Bacon",5.67);
        healthyburger.priceAdd1("Egg",5.43);
        healthyburger.addHealthAddition1("Lentals",3.41);
        System.out.println("Total healthy Burger price is: "+healthyburger.itemizeHamburger());

        DeluxeBurger db=new DeluxeBurger();
        db.itemizeHamburger();
        db.priceAdd1("egg",12);



    }
}
