package Core.Ques20;

public class RedheadDuck extends Duck{

    public RedheadDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }
    public void ShowDetail(){
        super.ShowDetail();
        System.out.println("Redhead ducks fly slow and quack mild.");
    }
}
