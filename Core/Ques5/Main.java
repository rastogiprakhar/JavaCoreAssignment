package Core.Ques5;

public class Main {
    static int firstFactorial(int num)
    {
        if(num<=1)
            return 1;

        return num*firstFactorial(num-1);
    }

    public static void main(String[] args) {
        int factorial=firstFactorial(8);
        System.out.println(factorial);
    }
}
