package MarketPlace;

import java.text.DecimalFormat;

class Bronze{

    protected double turnover,valueOfPurchase;
    private String owner;

//    public double getTurnover() {
//        return turnover;
//    }

    public Bronze(String owner, double turnover, double valueOfPurchase) {
        this.owner=owner;
        this.turnover = turnover;
        this.valueOfPurchase = valueOfPurchase;

    }

    public double discount(){
        double discountRate=0;

        if (this.turnover>100&&this.turnover<300){
            discountRate=0.01;
        }
        else if(this.turnover>=300)
            discountRate=0.25;

        System.out.println("Bronze");
        DecimalFormat df = new DecimalFormat("#0.####");
        System.out.println("Purchase value: $"+ this.valueOfPurchase);
        System.out.println("Discount rate: "+(df.format(discountRate*100)+"%"));
        System.out.println("Discount: $"+df.format(discountRate*this.valueOfPurchase));
        System.out.println("Total: $"+  (valueOfPurchase- (discountRate*this.valueOfPurchase)));

        return discountRate;
    }

}

class Silver extends Bronze {

    public Silver(String name, double turnover, double valueOfPurchase) {
           super(name,turnover, valueOfPurchase);
    }

    @Override
    public double discount() {
        double discountRate=0;
        if (super.turnover<300){
            discountRate=0.02;
        }
        else
            discountRate=0.035;



        System.out.println("Silver");
        DecimalFormat df = new DecimalFormat("#0.####");
        System.out.println("Purchase value: $"+ this.valueOfPurchase);
        System.out.println("Discount rate: "+(df.format(discountRate*100)+"%"));
        System.out.println("Discount: $"+df.format(discountRate*this.valueOfPurchase));
        System.out.println("Total: $"+  (valueOfPurchase- (discountRate*this.valueOfPurchase)));

        return discountRate;
    }
}

class Gold extends Bronze {

    public Gold(String owner, double turnover, double valueOfPurchase) {
        super("gold", turnover, valueOfPurchase);
    }


    @Override
    public double discount() {
        double discountRate=0;

        if ( super.turnover < 100) {
            discountRate = 0.02;

        } else if (super.turnover >= 100 && super.turnover < 200) {
            discountRate = 0.03;

        } else if (super.turnover >= 200 && super.turnover < 300) {
            discountRate = 0.04;

        } else if (super.turnover >= 300 && super.turnover < 400) {
            discountRate = 0.05;


        } else if (super.turnover >= 400 && super.turnover < 500) {
            discountRate = 0.06;


        } else if (super.turnover >= 500 && super.turnover < 600) {
            discountRate = 0.07;


        } else if (super.turnover >= 600 && super.turnover < 700) {
            discountRate = 0.08;

        } else if (super.turnover >= 700 && super.turnover < 800) {
            discountRate = 0.09;

        } else if (super.turnover >= 800) {
            discountRate = 0.10;

        }

        System.out.println("Gold");
        DecimalFormat df = new DecimalFormat("#0.####");
        System.out.println("Purchase value: $"+ this.valueOfPurchase);
        System.out.println("Discount rate: "+(df.format(discountRate*100)+"%"));
        System.out.println("Discount: $"+df.format(discountRate*this.valueOfPurchase));
        System.out.println("Total: $"+  (valueOfPurchase- (discountRate*this.valueOfPurchase)));

        return discountRate;

    }
}


public class Main {
    public static void main(String[] args){
        Bronze bronze=new Bronze("nasko",0,150);
        bronze.discount();
        System.out.println();
        Silver silver=new Silver("eli",600,850);
        silver.discount();
        System.out.println();
        Gold gold=new Gold("emo" ,1500 ,1300 );
        gold.discount();

    }
}
