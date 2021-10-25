package Core.Ques3;

public class Third {
    public static void main(String[] args) {
        String s="abcdefabcdeabcdaaa";
        char toBeRemoved='a';
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=toBeRemoved)
                sb.append(s.charAt(i));
        }

        s=new String(sb);
        System.out.println(s);

    }
}
