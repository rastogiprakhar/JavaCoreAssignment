package Core.Ques8;

public class Main {
    //STATIC VARIABLES
    static String firstName="Prakhar";
    static String lastName="Rastogi";
    static int age=24;

    static
    {
        //USING STATIC BLOCK
        System.out.println("PRINT 1 USING STATIC BLOCK");
        System.out.println("First Name:"+firstName+" , Last Name:"+lastName+" , Age:"+age);
    }
    public static void main(String[] args) {
        //USING STATIC METHOD MAIN
        System.out.println();
        System.out.println("PRINT 2 USING STATIC MAIN METHOD");
        System.out.println("First Name:"+firstName+" , Last Name:"+lastName+" , Age:"+age);
    }
}
