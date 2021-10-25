package Core.Ques20;

public class Main {
    public static void main(String[] args) {
        BirdInterface[] duck = new BirdInterface[3];
        duck[0] = new RubberDuck(2,4, Bird.DuckType.Rubber);
        duck[1] = new MallardDuck(4,6, Bird.DuckType.Mallard);
        duck[2] = new RedheadDuck(6,8, Bird.DuckType.RedHead);
        for (int i=0; i<duck.length; i++){
            duck[i].ShowDetail();
            System.out.println();
        }
    }
}

