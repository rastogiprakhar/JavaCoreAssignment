package Core.Ques6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        String s="This is duplicate check sentence. This is duplicate check sentence.";
        String[] arr=s.split("\\s");
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        System.out.println(map);
    }
}
