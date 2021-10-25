package Core.Ques9;

public class BOI extends Bank{

    String name="BOI";
    int rateOfInterest=7;

    @Override
    public void getDetails() {
        System.out.println("Name:"+name+", Rate Of Interest:"+rateOfInterest);
    }
}
