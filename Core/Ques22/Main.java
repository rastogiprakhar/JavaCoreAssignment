package Core.Ques22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        while(number>0)
        {
            int digit=(int)number%10;
            number/=10;

            if(!map.containsKey(digit))
                map.put(digit,1);
            else
                map.put(digit,map.get(digit)+1);

            sum+=digit;
        }

        boolean flag=false;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int tempSum=sum-entry.getKey();
            int checkDigit=tempSum%10;
            if(map.containsKey(checkDigit)) {
                map.put(entry.getKey(), entry.getKey() - 1);
                if (map.get(checkDigit) > 0) {
                    flag = true;
                    break;
                }
                else
                    map.put(entry.getKey(), entry.getKey() - 1);
            }
            sum+= entry.getKey();
        }

        if(flag)
            System.out.println("okay");
        else
            System.out.println("not okay");
    }
}