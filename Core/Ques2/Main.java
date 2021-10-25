package Core.Ques2;

public class Main {
    public static void main(String[] args) {
        int b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        int count0=0,count1=1;
        for(int i=0;i< b_nums.length;i++)
        {
            if(b_nums[i]==0)
                count0++;
            else if(b_nums[i]==1)
                count1++;
        }

        for(int i=0;i<count0;i++)
            b_nums[i]=0;

        for(int i=count0;i<b_nums.length;i++)
            b_nums[i]=1;

        for(int i:b_nums)
            System.out.print(i+" ");
    }
}
