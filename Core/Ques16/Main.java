package Core.Ques16;

class A implements Cloneable
{
    int i;
    String s;

    //CLONEABLE INTERFACE
    A(int i,String s)
    {
        this.i=i;
        this.s=s;
    }


    //COPY CONSTRUCTOR
    A(A obj)
    {
        this.i=obj.i;
        this.s=obj.s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a1=new A(1,"A");
        System.out.println("a1.i: "+a1.i+" ,a1.s: "+a1.s);

        A a2= (A) a1.clone();
        System.out.println("<----Clone interface implementation----> ");
        System.out.println("a2.i: "+a2.i+" ,a2.s: "+a2.s);


        A a3=new A(a2);
        System.out.println("<----Copy constructor implementation---->");
        System.out.println("a3.i: "+a3.i+" ,a3.s: "+a3.s);
    }
}
