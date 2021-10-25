package Core.Ques9;

public class SBI extends Bank {

    String name="SBI";
    int rateOfInterest=6;

    @Override
    public void getDetails() {
        System.out.println("Name:"+name+", Rate Of Interest:"+rateOfInterest);
    }

}
