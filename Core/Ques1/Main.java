package Core.Ques1;

public class Main {

    public static void main(String[] args)
    {
        String s="spaps";
        boolean flag=false;
        for(char i='a';i<='z';i++)
        {
            String seq="p"+i+"p";
            if(s.contains(seq))
            {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
