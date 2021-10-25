package Core.Ques10;

import java.util.Scanner;

public class Main {
    static void testWhileLoop()
    {
        System.out.println("CHECKING WHILE LOOP FUNCTIONALITY");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        while(!s.equalsIgnoreCase("done"))
        {
            if(s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
            s=sc.next();
        }
    }

    static void testDoWhileLoop()
    {
        System.out.println("CHECKING DO-WHILE LOOP FUNCTIONALITY");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equalsIgnoreCase("done"))
            return;

        do{
            if(s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
            s=sc.next();
        }
        while(!s.equalsIgnoreCase("done"));

    }

    public static void main(String[] args) {
        testWhileLoop();
        testDoWhileLoop();
    }
}