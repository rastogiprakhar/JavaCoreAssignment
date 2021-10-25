package Core.Ques20;

public class MallardDuck extends  Duck{

    public MallardDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }
    public  void ShowDetail(){
        super.ShowDetail();
        System.out.println("Mallard ducks fly fast and quack loud.");
    }
}
