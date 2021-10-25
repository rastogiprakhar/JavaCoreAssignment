package Core.Ques12;

class CustomException extends Exception
{
    CustomException(String msg)
    {
        System.out.println(msg);
    }
}

public class Main {
    public static void main(String[] args) throws CustomException {
        try {
            exceptionFunc();
        } catch(Throwable e) {
            StackTraceElement[] trace = e.getStackTrace();
            System.err.println(trace[0].toString());
        }
    }


    public static void exceptionFunc()throws CustomException {
        CustomException e=new CustomException("Throwing Exception without stack trace");
        StackTraceElement[] trace = new StackTraceElement[] {
                new StackTraceElement("ClassName","methodName","fileName",1)
        };
        // sets the stack trace elements
        e.setStackTrace(trace);
        throw e;
    }
}
