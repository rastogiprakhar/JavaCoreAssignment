package Core.Ques9;

public class Main {
    public static void main(String[] args) {
        Bank bank=new BOI();
        bank.getDetails();

        bank=new ICICI();
        bank.getDetails();

        bank=new SBI();
        bank.getDetails();
    }
}
