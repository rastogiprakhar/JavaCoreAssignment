package Core.Ques14;

public class Main
{
    public static void main(String[] args)
    {
            try
            {
                Class.forName("ClassNotFoundException");
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }
    }
}
