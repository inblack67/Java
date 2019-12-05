package com.intellisense;


class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot()
    {
        return "No plot here";
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }
    public String plot()
    {
        return "A shark fucks lot of hoomans";
    }
}

class IndependenceDay extends Movie
{
    public IndependenceDay()
    {
        super("IndependenceDay");
    }
    public String plot()
    {
        return "Aliens take over the planet";
    }
}

class Maze extends Movie
{
    public Maze()
    {
        super("Maze");
    }
    public String plot()
    {
        return "Escape the maze";
    }
}
class Stars extends Movie
{
    public Stars()
    {
        super("Stars");
    }
    public String plot()
    {
        return "Aakash Ganga - The Galaxy";
    }
}

class Forgotten extends Movie
{
    public Forgotten()
    {
        super("Forgotten");
    }
//    public String plot()
//    {
//        return "Eternal Sunshine of the spotless mind";
//    }
}





public class Main {

    public static void main(String[] args)
    {
        for(int i=1; i<11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie name -> " + movie.getName() + "\n" + "Plot -> " + movie.plot());
        }
    }

    public static Movie randomMovie()
    {
        int randomNumber = (int)((Math.random() * 5)+1);
        System.out.println("Random -> " + randomNumber);

        switch (randomNumber)
        {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Maze();
            case 4:
                return new Stars();
            case 5:
                return new Forgotten();
        }
        return null;
    }
}
