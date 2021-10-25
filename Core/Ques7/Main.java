package Core.Ques7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void checkOccurrences(String s, int index,Map<Character,Integer> map)
    {
        if(index>=s.length())
            return;

        if(!map.containsKey(s.charAt(index)))
            map.put(s.charAt(index),1);
        else
            map.put(s.charAt(index),map.get(s.charAt(index))+1);

        checkOccurrences(s,index+1,map);
    }

    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        String s="abcdefghijabcde";
        checkOccurrences(s,0,map);
        System.out.println(map);
    }
}


