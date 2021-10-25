package Core.Ques20;

public class Duck implements BirdInterface{
    private double weight;
    private int numberOfWings;
    private Bird.DuckType TypeOfDuck;

    public Duck (double weight, int numberOfWings, Bird.DuckType TypeOfDuck){
        this.weight = weight;
        this.numberOfWings = numberOfWings;
        this.TypeOfDuck = TypeOfDuck;
    }

    @Override
    public void ShowDetail() {
        if ( TypeOfDuck == Bird.DuckType.Mallard)
            System.out.println("Mallard Duck");
        else if ( TypeOfDuck == Bird.DuckType.Rubber)
            System.out.println("Rubber Duck");
        else if ( TypeOfDuck == Bird.DuckType.RedHead)
            System.out.println("Redhead Duck");
        System.out.println("Weight of duck : " + weight);
        System.out.println("Total number of wings : " + numberOfWings);
    }
}
