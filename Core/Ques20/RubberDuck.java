package Core.Ques20;

public class RubberDuck extends Duck{
    public RubberDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }
    public void ShowDetail(){
        super.ShowDetail();
        System.out.println("Rubber ducks don’t fly and squeak.");
    }
}
