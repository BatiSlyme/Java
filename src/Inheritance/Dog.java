package Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


// we need to call the constructor for the dog that calls the other class
    public Dog(  int size, int weight, int name,int eyes,int legs,int tail,int teeth,String coat) {
        super(1, 1, size, weight, name);// 1= all dogs have got a brain
        this.coat=coat;
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;

    }
    public void chew(){
        System.out.println("chew called");
    }

    @Override
    public void eat() {
        System.out.println("eat called");
        chew();
        super.eat();//vikame ot animal blagodarenie na supera
    }

    public void walk(){
        System.out.println("walk");
        move(2);
    }

    public void run() {
        System.out.println("run called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegds caleed");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
