package Core.Ques4;

public class Main {
    public static void main(String[] args) {
        String s="Sample String";
        char[] arr=s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        s=new String(arr);
        System.out.println(s);
    }
}
