package Core.Ques9;

public class ICICI extends Bank{

    String name="ICICI";
    int rateOfInterest=8;

    @Override
    public void getDetails() {
        System.out.println("Name:"+name+", Rate Of Interest:"+rateOfInterest);
    }
}
