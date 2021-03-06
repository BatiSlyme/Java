package Polymorphism;

class Movie{
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("ELI Q IZQDE AKULA");
    }

    public String plot(){
        return "A lot of sharks eat people";
    }
}
class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens";
    }
}

class MazeRunner extends Movie{
    public MazeRunner()
    {
    super("mazerun");
    }

    @Override
    public String plot() {
        return "Kids try to escape the maze";
    }
}

class Starwars extends Movie{

    public Starwars() {
        super("Star Wards");
    }

    @Override
    public String plot() {
        return"imperial forces try to take over the galaxy";
    }
}


class Forgetable extends Movie {
    public Forgetable()

    {
        super("Forgetable");
    }
//    no plot method
}




public class Main {
    public static void main(String[] args){

        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+ ":" +movie.getName()+"\n"+ "Plot"+movie.plot()+"\n");
        }
    }


    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*5)+1;
        System.out.println("random number generatoer was:"+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();

        }
        return null;
    }
}
