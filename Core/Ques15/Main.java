package Core.Ques15;

class Singleton
{
    private static Singleton singleton_instance=null;

    private Singleton()
    {
        System.out.println("Singleton constructor");
    }

    public static Singleton getInstance()
    {
        if(singleton_instance==null)
            singleton_instance=new Singleton();
        return singleton_instance;
    }
}

public class Main
{
    public static void main(String[] args) {
        Singleton x= Singleton.getInstance();
        System.out.println("Singleton Instance created!!!");
    }
}
