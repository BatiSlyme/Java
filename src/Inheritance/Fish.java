package Inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    public Fish(int size, int weight, int name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim() {


        moveBackFin();
        super.move(6);
    }


}


