package Core.Ques11;

import java.util.ArrayDeque;

public class Barista {
/*
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready
 */
    ArrayDeque<String> orders=new ArrayDeque<>();
    public void prepareCoffee()
    {
        String currentOrder= orders.getFirst();
        //prepare order
    }

    public void notifyCustomerForOrderCompletion()
    {

    }
}
